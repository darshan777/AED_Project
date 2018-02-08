/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StudentAdminRole.StudentRole.StudentFrontPage;
import userinterface.StudentAdminRole.StudentRole.StudentWorkAreaJPanel;

/**
 *
 * @author sangh
 */
public class StudentRole extends Role{
 

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new StudentFrontPage(userProcessContainer,account, organization, enterprise, business,network);
    }

    
    
    
}
