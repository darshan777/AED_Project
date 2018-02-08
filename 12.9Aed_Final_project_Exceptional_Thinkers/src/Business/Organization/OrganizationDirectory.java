/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author sangh
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Student.getValue())){
            organization = new StudentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CompanyDept.getValue())){
            organization = new CompanyDeptOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Coop.getValue())){
            organization = new CoopOrganization() ;
            organizationList.add(organization);
        }
        return organization;
    }
}