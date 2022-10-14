package mx.com.portafolio.controller;


import java.util.List;

//import static jdk.nashorn.internal.objects.NativeString.substring;

import mx.com.portafolio.config.Conexion;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alejandro Téllez Aguilar
 * CRUD Citas
 */

@Controller
public class AdminNivelEscolar {
    
     
    List DataNE;                                //Para la lista de citas
    String nombre_nivel;                            
    Conexion connecting = new Conexion();    //realiza la conexión a la base de datos
    JdbcTemplate jdbcTemplate = new JdbcTemplate(connecting.Conectar());
    
    ModelAndView AdNE = new ModelAndView();

    //Para listar todos los niveles en la interface de administración de niveles y buscar un nivel específico
    
    @RequestMapping(value="AdminNivelEscolar.htm")
    public ModelAndView Listar(String ane){
        
        
          
        if (ane == "" || ane == null) { //Si no tiene nada
            
            //Citas hoy
            String QCitas = "select dgenerales.iddgeneral, schoollevel.schoolname, schoollevel.schoolyearinicio, " +
                            "schoollevel.schoolyearfin, certificate.certificatename,  certificate.certificatecareer " +
                            "from dgenerales, schoollevel inner join certificate on schoollevel.idcertificate = certificate.idcertificate " +
                            "where dgenerales.iddgeneral=1 order by schoollevel.schoolyearinicio";
            DataNE = this.jdbcTemplate.queryForList(QCitas);
          
        } 
        
        AdNE.addObject("lista", DataNE);
        AdNE.setViewName("AdminNivelEscolar");
        return AdNE;
    }
    
     
}

