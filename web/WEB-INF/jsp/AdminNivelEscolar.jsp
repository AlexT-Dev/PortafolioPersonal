<%-- 
    Document   : AdminNivelEscolar
    Created on : 07 Oct. 2022, 19:22:05
    Author     : Alejandro Téllez
    Comment    : Muestra la relación de estudios realizados
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
            <a href="#modalPersonal"><span title="Datos Personales"><img class="fotoPersonal" src="./css/Alex.png" alt="imagen personal"></span></a>  
        </div>   
        

         <nav>
            <div>
               <ul class="menu">
                 <li ><a href="index.htm">Inicio</a></li>
                 <li ><a href="AdminNivelEscolar.htm">Estudios</a></li>
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
        <%-- Para tabla de desplegado --%>
     
        <table class="tabla">
            
          <thead class="">
            <tr class="tabla-thead tabla-tr" >
                
                <th class="tabla-th">ESTUDIOS REALIZADOS</th>
            </tr>
          </thead>
          
          <tbody class="tbody" >
            <tr>
              <c:forEach var="dato" items="${lista}">
                <td class="tabla-td">
                 <p class="p">Escuela: ${dato.schoolname} </p>
                 <p class="p">De: ${dato.schoolyearinicio} </p>
                 <p class="p">A: ${dato.schoolyearfin} </p>
                 <P class="p">Nivel: ${dato.certificatename} </p>

                 <div class="doc-recibido">
                   <p class="p">Documento: ${dato.certificatecareer} </p>
                 </div>
                 <div style="margin-top: 2px;"></div>
                </td>

              </c:forEach>

            </tr>
          </tbody>

        </table>
      
       
    </body>
    <footer class="position-absolute">
    
    </footer>

    </html>
    
    
    <%-- Borrar hacia abajo --%>
    
                            
                                