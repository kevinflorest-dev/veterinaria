
package pe.veterinaria.util;

import java.sql.*;


/**
 *
 * Clase para la conexión a la base de datos.
 */
public class ConnectionDB {
    
 public static Connection DB(){
     
     Connection cn = null;
     
     try {
         Class.forName("oracle.jdbc.OracleDriver");
         cn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","SYSTEM","123456");
         System.out.println("Se conecto");
     } catch (Exception e) {
         System.out.println("No se conecto : "+ e.getMessage());
     }
     
     return cn;
     }
    
}
