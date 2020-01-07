package pe.veterinaria.dao;

import java.sql.*;
import javax.swing.JOptionPane;
import pe.veterinaria.model.User;
import pe.veterinaria.util.ConnectionDB;

/**
 *
 * Acceso a la base de datos
 */

public class AdminDAO {
    
    Connection cn = null;
    PreparedStatement pt = null;
    ResultSet rs = null;
    
    public User validateUser(User user){
        String sql = "SELECT PRIMER_NOMBRE,SEGUNDO_NOMBRE,APELLIDO_PATERNO,"+
                     "APELLIDO_MATERNO FROM USUARIOS WHERE USUARIO = ? AND CLAVE = ?";
        
        try {
            cn = ConnectionDB.DB();
            pt = cn.prepareStatement(sql);
            
            pt.setString(1, user.getUser());
            pt.setString(2, user.getPassword());
            
            rs = pt.executeQuery();
            
            while(rs.next())
            {
               user.setName(rs.getString("PRIMER_NOMBRE"));
            }
            
            rs.close();
            pt.close();
            cn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Base de Datos", 
                    JOptionPane.ERROR_MESSAGE);
        }
       return user;
    }
    
}
