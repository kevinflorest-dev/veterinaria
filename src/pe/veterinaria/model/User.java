
package pe.veterinaria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Clase Login
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    private String user;
    private String password;
    private String name;
    private String lastname;
    
}
