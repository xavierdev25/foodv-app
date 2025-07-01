package Conexion;

import java.sql.*;

public class ConectarBD implements Parametros {
    public static Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;

    public ConectarBD() {
        try {
            Class.forName(Driver);
            conexion = DriverManager.getConnection(ruta, usuario, clave);
            st = conexion.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
            Mensajes.M1("ERROR al establecer la conexión a la BD: " + ex.getMessage());
        }
    }
}