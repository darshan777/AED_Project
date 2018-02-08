/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CompanyDeptOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CompanyAdmin.CompanyManagerRole.CompanyManagerWorkAreaJPanel;

/**
 *
 * @author Jerin
 */
public class CompanyManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new CompanyManagerWorkAreaJPanel(userProcessContainer, account, (CompanyDeptOrganization)organization, enterprise,business,network);
    }
    
    
}
