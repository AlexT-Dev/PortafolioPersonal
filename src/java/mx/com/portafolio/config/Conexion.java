
package mx.com.portafolio.config;


import java.sql.SQLException;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Alejandro Téllez
 */
public class Conexion {

    public DriverManagerDataSource Conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
      try {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/portfolio?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
       
        dataSource.setUsername("root");
        dataSource.setPassword("teaa701216mb1"); 
      } catch (Exception e){
          
      }      
        
    return dataSource;    
    }
                
}
