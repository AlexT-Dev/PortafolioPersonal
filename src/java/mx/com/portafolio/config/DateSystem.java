
package mx.com.portafolio.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alejandro Téllez Aguilar
 * Para obtener el formato de la fecha
 */
public class DateSystem {
    //Para fecha y hora de guardado de registros  
    
    
    public DateSystem() {
    }

    public String setDate(Date FechaCita) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String FechaRegistro = dateFormat.format(FechaCita);   //Para la fecha de registro de la consulta
        return FechaRegistro;
    }
}
