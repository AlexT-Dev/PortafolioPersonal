<%-- 
    Document   : AdminNivelEscolar
    Created on : 20 Oct. 2022, 19:22:05
    Author     : Alejandro Téllez
    Comment    : Muestra la información de la página
--%>

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
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
            <script src="http://code.jquery.com/jquery-latest.js"></script>
            <link rel="stylesheet" type="text/css" href="./css/personalstyle.css"/><%--personal--%>
            <title>Portafolio</title>
           
        </head>
  <header >
      <div class="header">   
        <div>
            <a href="#modalPersonal"><span title="Datos Personales"><img class="fotoPersonal" src="./css/Alex.jpg" alt="imagen personal"></span></a>  
        </div>   
        

         <nav>
            <div>
               <ul class="menu">
                 <li ><a href="index.htm">Inicio</a></li>
                 <li ><a href="AdminNivelEscolar.htm">Estudios</a></li>
                 <li ><a href="AdminJobs.htm">Empleos</a></li>
                 <li ><a href="AdminCrosscutting.htm" >Transversales </a></li>
                 <li ><a href="AdminKnowledge.htm">Conocimientos</a></li>
                 <li ><a href="AdminProjects.htm">Proyectos</a></li> 
                 <li ><a href="#">Comunidad</a></li>
                 <li ><a href="#">Acerca de...</a></li> 
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
   <body class="body"> <!-- class="body" --> 
       <ul >
         <c:forEach var="dato" items="${lista}">
            <li class="fijar-etiquetas etiquetas-gral ">    
             <p class="p">Autor:</p>
             <label class="label">${dato.autor} </label>
             <p class="p">Fecha de Creación:</p>
             <label class="label">${dato.creationdate}</label>
             <p class="p">Lenguaje:</p>
             <label class="label">${dato.language}</label>
             <p class="p">Framework:</p>
             <label class="label">${dato.framework}</label>
             <P class="p">Servidor:  </p>
             <label class="label">${dato.server}</label>
             <P class="p">Componente:  </p>
             <label class="label">${dato.component}</label>
             <P class="p">Tipo de Aplicación:  </p>
             <label class="label">${dato.application}</label>
             <P class="p">Base de Datos:  </p>
             <label class="label">${dato.database}</label>
             <P class="p">IDE:  </p>
             <label class="label">${dato.ide}</label>
            </li>
            <div style="margin-top: 10px;"></div>
         </c:forEach>
       </ul>
     
       
    </body>
    <footer class="position-absolute">
    
    </footer>

    </html>
    
    
    <%-- Borrar hacia abajo --%>
    
                 