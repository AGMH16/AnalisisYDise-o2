
package ClasesSQL;
import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author jenif
 */
public class ProveedorSQL {
     ConexionBD Conexion = new ConexionBD();
      public void InsertarProveedor(String nombre, String direccion, String telefono, String empresa) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("INSERT INTO proveedor(Nombre, Direccion, Telefono,Empresa) VALUES ('" + nombre + "','" + direccion + "','" + telefono + "','" + empresa + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añedido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
      
      //DELETE FROM proveedor WHERE Empresa='Pollo Feliz';
      public void DeleteProveedor(String empresa) {
        try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
                statement.execute("DELETE FROM proveedor WHERE Empresa=('" + empresa + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añedido a la lista");
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
      
       public int BuscarProveedorPorEmpresa(JTextField NombreProveedortxt1, JTextField TelefonoProveedortxt, JTextField TelefonoProveedortxt1, JTextField EmpresaProveedortxt, String nombreEmpresa) {
        int IdProveedor=0;
       try {
            try (Statement statement = (Statement) Conexion.getConnection().createStatement()) {
              ResultSet clr = statement.executeQuery("select idProveedor, Nombre, Direccion, Telefono, Empresa from proveedor");
              while (clr.next()) {
                IdProveedor=clr.getInt("idProveedor");
                String nombre = clr.getString("Nombre");
                String direccion = clr.getString("Direccion");
                String telefono = clr.getString("Telefono");
                String empresa = clr.getString("Empresa");

                if (nombreEmpresa.equals(empresa)) {
                    NombreProveedortxt1.setText(nombre);
                    TelefonoProveedortxt.setText(direccion);
                    TelefonoProveedortxt1.setText(telefono);
                    EmpresaProveedortxt.setText(empresa);

                }
            }
            }
            Conexion.getConnection().close();
        } catch (Exception e) {
        }
        
     
        return IdProveedor;
    }
}
