package Conexion;

import Interfaz.CrearCuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                CrearConexion();
               // System.out.println("Entro al if");
            }
            if (VerificarSQL()) {
               // System.out.println("Si esta activa");
            } else {
                connection.close();
                CrearConexion();
            }
            return connection;
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println(e);
            throw new RuntimeException("Conexión fallida", e);
        }
    }

    public static void CrearConexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Analisis2", "root", "1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean VerificarSQL() {
        boolean x = false;
        try {
            //Connection miConexion=(Connection) Conexion.GetConnection();

            Statement s = connection.createStatement();
            ResultSet clr = s.executeQuery("select 1");
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return x;
    }

   
}
