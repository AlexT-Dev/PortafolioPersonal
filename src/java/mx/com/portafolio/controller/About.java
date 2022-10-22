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
 * Desplegado de Acerca de...
 * Fecha: 20 de Octubre de 2022
 */

@Controller
public class About {
    
     
    List DataNE;                                //Para la lista de contenido
    String nombre_nivel;                            
    Conexion connecting = new Conexion();    //realiza la conexión a la base de datos
    JdbcTemplate jdbcTemplate = new JdbcTemplate(connecting.Conectar());
    
    ModelAndView AdNE = new ModelAndView();

    //Para listar todos los niveles en la interface de administración de niveles y buscar un nivel específico
    
    @RequestMapping(value="AcercaDe.htm")
    public ModelAndView Listar(String ane){
        
        
          
        if (ane == "" || ane == null) { //Si no tiene nada
            
            //Niveles escolares
            String QCitas = "call spabout(1)";
            DataNE = this.jdbcTemplate.queryForList(QCitas);
          
        } 
        
        AdNE.addObject("lista", DataNE);
        AdNE.setViewName("AcercaDe");
        return AdNE;
    }
    
     
}