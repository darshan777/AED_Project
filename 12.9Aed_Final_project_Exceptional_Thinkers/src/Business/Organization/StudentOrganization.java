/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.StudentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sangh
 */
public class StudentOrganization extends Organization{

    public StudentOrganization() {
        super(Type.Student.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StudentRole());
        return roles;
    }
     
}
