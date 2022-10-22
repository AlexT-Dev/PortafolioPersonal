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
 * Desplegado de Empleos
 * Fecha: 14 de Octubre de 2022
 */

@Controller
public class AdminJobs {
    
     
    List DataNE;                                //Para la lista de empleos
    String nombre_nivel;                            
    Conexion connecting = new Conexion();    //realiza la conexión a la base de datos
    JdbcTemplate jdbcTemplate = new JdbcTemplate(connecting.Conectar());
    
    ModelAndView AdNE = new ModelAndView();

    //Para listar todos los niveles en la interface de administración de niveles y buscar un nivel específico
    
    @RequestMapping(value="AdminJobs.htm")
    public ModelAndView Listar(String ane){
        
        
          
        if (ane == "" || ane == null) { //Si no tiene nada
            
            //Empleos
            String QJobs = "call pjobs(1)";  //Procedimiento almacenado
//                    
            DataNE = this.jdbcTemplate.queryForList(QJobs);
          
        } 
        
        AdNE.addObject("lista", DataNE);
        AdNE.setViewName("AdminJobs");
        return AdNE;
    }
    
     
}