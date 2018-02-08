/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompanyManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sangh
 */
public class CompanyDeptOrganization extends Organization {
    
    public CompanyDeptOrganization() {
        super(Type.CompanyDept.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CompanyManagerRole());
        return roles;
    }
}
