
package pe.veterinaria.service.impl;

import pe.veterinaria.dao.AdminDAO;
import pe.veterinaria.model.User;


/**
 *
 * Implementación de la interfaz AdminService
 * (Implementación de metodos)
 */

public class AdminServiceImpl  {
    
    AdminDAO dao = new AdminDAO();

    public User validateUser(User user) {
        return dao.validateUser(user);
    }
    
}
