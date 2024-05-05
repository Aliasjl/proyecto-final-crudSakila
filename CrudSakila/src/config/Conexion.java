
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/sakila"; // conexion base de datos sakila
            
           con=DriverManager.getConnection(url,"root","wally00");
            
                        System.out.println("Conexión establecida con éxito a la base de datos: " + url);

        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }
