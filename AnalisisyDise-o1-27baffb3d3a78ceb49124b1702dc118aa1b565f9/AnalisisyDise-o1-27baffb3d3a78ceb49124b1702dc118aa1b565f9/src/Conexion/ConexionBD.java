
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
    private static Connection connection;
    
    public static Connection getConnection() {
        try {
            if (connection == null) {
                Runtime.getRuntime().addShutdownHook(new getClose());
                Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Analisis2", "root", "1234");
                System.out.println("Entro al if");
            }
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println(e);
            throw new RuntimeException("Conexión fallida", e);
        }
    }
    
    static class getClose extends Thread{
        @Override
        public void run() {
            try {
                Connection conn = ConexionBD.getConnection();
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
