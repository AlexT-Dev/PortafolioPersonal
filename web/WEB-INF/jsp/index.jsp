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
            <a href="#modalPersonal"><img class="fotoPersonal" src="./css/Alex.png" alt="imagen personal"></a>  
        </div>   
        

         <nav>
            <div>
               <ul class="menu">
                 <li ><a href="#">Inicio</a></li>
                 <li ><a href="#">Estudios</a></li>
                 <li ><a href="#">Empleos</a></li>
                 <li ><a href="#" >Transversales </a></li>
                 <li ><a href="#">Conocimientos</a></li>
                 <li ><a href="#">Proyectos</a></li> 
                 <li ><a href="#">Comunidad</a></li>
                 <li ><a href="#">Acerca de...</a></li> 
               </ul>
            </div>
         </nav>
          <div>  <!-- Para iconos de redes sociales -->
            <div>
              <img class="fotoReduce" src="./css/fb.png" alt="facebook"> 
            </div>
            <div>
              <img class="fotoReduce" src="./css/gh.png" alt="GitHub"> 
            </div> 
              <div>
              <img class="fotoReduce" src="./css/in.png" alt="Indeed"> 
            </div> 
          </div> 
      </div>
    </header>
    
        <div >
           <p>dsadasdasddasdsad  </p>
           
         </div> 
     <footer class="fontfooter">
        The best page of my life
   </footer>   
   
  <!-- Modal para datos de la fotografía --->
     <div class="containerModal" id="modalPersonal">
      <div class="popup">
         <div class="imagen"></div>
          <div class="text-modal">
              <p>
                sdsadsad
                asdsdasd
                asd
                sad
                asd
                sa
                dsa
                d
                sad
                sad
                a
                as
                as
                as
                as
                as
                as
                as
                
                a
              </p>
          </div>
         <div><a href="#" class="btn-closeModal">תודה</a></div>
      </div> 
     </div>
   
  </body>
  
</html>
 
