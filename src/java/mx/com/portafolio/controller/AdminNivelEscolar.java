package mx.com.portafolio.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
//import static jdk.nashorn.internal.objects.NativeString.substring;

import mx.com.portafolio.config.Conexion;
import mx.com.portafolio.config.DateSystem;
import mx.com.portafolio.entities.SchoolLevel;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alejandro Téllez Aguilar
 * CRUD Citas
 */

@Controller
public class AdminNivelEscolar {
    
     int idSchoolLevel;         // id del Nivel Escolar
    String SchoolName;          // Nombre del Nivel Escolar 
       int SchoolYearInicio;    // Año de inicio del nivel escolar
       int SchoolYearFin;       // Año final del nivel escolar
    String SchoolState;         // Estado donde se realizó el nivel escolar 
    String SchoolCountry;       // Municipio donde se realizó el nivel escolar
       int idCertificate;       // io del certitificado recibido
       int idDGeneral;          // id del dueño del portafolio
    List DataNE;                                //Para la lista de citas
    String nombre_nivel;                            
    Conexion connecting = new Conexion();    //realiza la conexión a la base de datos
    JdbcTemplate jdbcTemplate = new JdbcTemplate(connecting.Conectar());
    ModelAndView mav = new ModelAndView();
    ModelAndView AdNE = new ModelAndView();

    //Para listar todos los niveles en la interface de administración de niveles y buscar un nivel específico
    
    @RequestMapping(value="AdminCitas.htm")
    public ModelAndView Listar(String fechacita){
        DateSystem CitasHoy = new DateSystem();
        Date FechaActual;
        FechaActual = new Date();
        String hoy = CitasHoy.setDate(FechaActual);
        
          
        if (fechacita == "" || fechacita == null) { //Si no tiene nada
            
            //Citas hoy
            String QCitas = "select distinct pacientes.idpaciente, pacientes.nombrepaciente, padecimiento.fechacita, padecimiento.horacita "
                + "from padecimiento, pacientes where padecimiento.idpaciente = pacientes.idpaciente and padecimiento.fechacita = '" + hoy.substring(0,10) + "' "
                + "order by padecimiento.horacita asc";
            DataNE = this.jdbcTemplate.queryForList(QCitas);
          
        } else {
            String SqlFind = "select distinct pacientes.idpaciente, pacientes.nombrepaciente, padecimiento.fechacita, padecimiento.horacita "
                + "from padecimiento, pacientes where padecimiento.idpaciente = pacientes.idpaciente and padecimiento.fechacita = '" + fechacita + "' "
                + "order by padecimiento.horacita asc";
           DataNE = this.jdbcTemplate.queryForList(SqlFind);  
        }
        
        AdNE.addObject("listacitas", DataNE);
        AdNE.setViewName("AdminCitas");
        return AdNE;
    }
    
     //Para abrir la ventana de captura de la nueva cita
    @RequestMapping (value="addCita.htm", method = RequestMethod.GET)
    public ModelAndView addCita(){
        
        mav.addObject(new Padecimiento());
        mav.setViewName("addCita");
        return mav;            
    }
    
    //Para agregar la cita
    @RequestMapping (value="addCita.htm", method = RequestMethod.POST)
    public ModelAndView addCita(Padecimiento padecimiento){
       String SqlCita;
        //Busca la cita 
        
       SqlCita = "select fechacita, horacita from padecimiento where fechacita = '" + padecimiento.getFechacita() + "' and horacita = '" + padecimiento.getHoracita() +"'";
       
       if (this.jdbcTemplate.queryForList(SqlCita).isEmpty()) { //Si no existe, la crea
            SqlCita = "insert into padecimiento (idpaciente, fechacita, horacita)"
                    + " values (?,?,?)";
      
            this.jdbcTemplate.update(SqlCita,padecimiento.getIdpaciente(),padecimiento.getFechacita(),padecimiento.getHoracita());
            //Cuando se genera la cita, se crea un registro para llenar la receta del padecimiento
            String QReceta = "insert into pacientesrecetas (idpaciente, fechareceta) values (?,?) ";
            this.jdbcTemplate.update(QReceta,padecimiento.getIdpaciente(),padecimiento.getFechacita());
       } else {
           //Mensaje al usuario
           System.out.println("Ya Existe Cita en el horario " + padecimiento.getHoracita());
       }
       
       
       return new ModelAndView("redirect:/AdminCitas.htm");            
    }
    
    //Obtiene la cita para Modificar los datos
    @RequestMapping(value="editCita.htm", method = RequestMethod.GET)
    public ModelAndView editCita(HttpServletRequest request){
       
       paciente = Integer.parseInt(request.getParameter("paciente"));
       fecha = (String)request.getParameter("fechacita");
       hora = (String)request.getParameter("horacita");
       
        String QCitas = "select pacientes.idpaciente, pacientes.nombrepaciente, padecimiento.fechacita, padecimiento.horacita"
                + " from padecimiento, pacientes where padecimiento.idpaciente = pacientes.idpaciente and (padecimiento.fechacita = '" + fecha + "' and "
                + " padecimiento.horacita = '" + hora + "')"; // padecimiento.idpaciente = " + paciente;
                
       DataNE = this.jdbcTemplate.queryForList(QCitas);
       mav.addObject("listacitas", DataNE);
       mav.setViewName("editCita");
       return mav;
    }
    
    //Guarda cita modificada
    @RequestMapping(value="editCita.htm", method = RequestMethod.POST)
    public ModelAndView editCita(Padecimiento padecimiento){
       
       String QCita = "update padecimiento set horacita = ?, fechacita = ? "
                    + "where fechacita = '" + fecha + "' and horacita = '" + hora + "'";
       
       
       this.jdbcTemplate.update(QCita, padecimiento.getHoracita().substring(6,11), padecimiento.getFechacita().substring(11,21));
       return new ModelAndView("redirect:/AdminCitas.htm");
    } 
}

