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
 * Desplegado de Conocimientos
 * Fecha: 19 de Octubre de 2022
 */

@Controller
public class AdminProjects {
    
     
    List DataPro;                             //Para la lista de Tipos de Conocimiento
    
    String nombre_nivel;                            
    Conexion connecting = new Conexion();    //realiza la conexión a la base de datos
    JdbcTemplate jdbcTemplate = new JdbcTemplate(connecting.Conectar());
    
     ModelAndView AdPro = new ModelAndView();
    
    //Para listar todos los niveles en la interface de administración de niveles y buscar un nivel específico
    
    @RequestMapping(value="AdminProjects.htm")
    public ModelAndView Listar(String ane){
        
        
          
        if (ane == "" || ane == null) { //Si no tiene nada
            
            //Conocimientos-Componentes
            String QPro = "call spprojects(1)";  //Procedimiento para obtener paquetes, knowledgetype
            DataPro = this.jdbcTemplate.queryForList(QPro);
            
        } 
        
        AdPro.addObject("lista", DataPro);  //Objeto con los tipos de Conocimiento
        
        AdPro.setViewName("AdminProjects");
        return AdPro;
    }
    
     
}