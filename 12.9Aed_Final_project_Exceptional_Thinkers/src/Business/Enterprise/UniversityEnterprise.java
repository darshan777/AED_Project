/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sangh
 */
public class UniversityEnterprise extends Enterprise{

    public UniversityEnterprise(String name) {
        super(name, EnterpriseType.University);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
