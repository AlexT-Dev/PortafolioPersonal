<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns:th="http://www.thymeleaf.org">
    
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="./css/personalstyle.css"/>
       <title>Portafolio</title>
    </head>
   <body class="body"> <!-- class="body" --> 
    <header >
      <div class="header">   
        <div>
            <a href="#modalPersonal"><span title="Datos Personales"><img class="fotoPersonal" src="./css/Alex.jpg" alt="imagen personal"></span></a>  
        </div>   
        

         <nav>
            <div>
               <ul class="menu">
                 <li ><a href="">Inicio</a></li>
                 <li ><a href="AdminNivelEscolar.htm">Estudios</a></li>
                 <li ><a href="AdminJobs.htm">Empleos</a></li>
                 <li ><a href="AdminCrosscutting.htm" >Transversales </a></li>
                 <li ><a href="AdminKnowledge.htm">Conocimientos</a></li>
                 <li ><a href="AdminProjects.htm">Proyectos</a></li> 
                 <li ><a href="#">Comunidad</a></li>
                 <li ><a href="AcercaDe.htm">Acerca de...</a></li> 
               </ul>
            </div>
         </nav>
          <div>  <!-- Para iconos de redes sociales -->
            <div>
                <a href="https://www.facebook.com/profile.php?id=100008755599666" target="_blank"><span title="Facebook"><img class="fotoReduce" src="./css/fb.png" alt="facebook"></span></a>
            </div>
            <div>
                <a href="https://github.com/AlexT-Dev" target="_blank"><span title="Gut Hub"><img class="fotoReduce" src="./css/gh.png" alt="GitHub"></span></a>
            </div> 
              <div>
                  <a href="https://www.linkedin.com/in/alejandro-t%C3%A9llez-aguilar-175b02214/" target="_blank"><span title="LinkedIn"><img class="fotoReduce" src="./css/in.png" alt="Indeed"></span></a> 
            </div> 
          </div> 
      </div>
    </header>
    
        
     <footer class="fontfooter">
        The best page of my life
   </footer>   
   
  <!-- Modal para datos de la fotografía --->
     <div class="containerModal" id="modalPersonal">
      <div class="popup">
         <div class="imagen"></div>
          <div class="text-modal">
              <p class="encPersonales">DATOS PERSONALES</p>
              <hr class="hrModal">
              <form>
              <label class="encDato labelModal">Nombre:</label><p class="encDato pModal"> Alejandro Téllez Aguilar</p>
              <label class="encDato labelModal">Domicilio: </label><p class="encDato pModal"> Justo Sierra 221, Colima, Col., México, C. P. 28010</p>
              <label class="encDato labelModal">Teléfono: </label><p class="encDato pModal">+52 312 194 85 62</p>
              <label class="encDato labelModal">R.F.C.: </label><p class="encDato pModal">TEAA701216MB1</p>
              <label class="encDato labelModal">EMail: </label><p class="encDato pModal">atacolmx@hotmail.com, atacolmx@gmail.com</p>
              </form>
              
          </div>
         <div><a href="#" class="btn-closeModal"><span title="Cerrar">✔</span></a></div>
      </div> 
     </div>
   
  </body>
  
</html>
 
