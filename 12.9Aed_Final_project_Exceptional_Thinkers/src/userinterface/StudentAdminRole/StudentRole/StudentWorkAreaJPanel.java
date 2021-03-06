/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentAdminRole.StudentRole;

import Business.EcoSystem;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CompanyDeptOrganization;

import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.Role.StudentRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppliedJobRequest;
import Business.WorkQueue.JobDirectory;
import Business.WorkQueue.JobResultWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jerin
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private JobDirectory jobList;
    private EcoSystem business;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public StudentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = (StudentOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;

        populateJob();
       populateAppliedJob();
    }

    private void populateJob() {

        DefaultTableModel model = (DefaultTableModel) JobPostingtable.getModel();
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[5];
            row[0] = request;
            row[1] = request.getJob().getJobType();
            row[2] = ((JobResultWorkRequest)request).getEnterpriseName();
            row[3] = request.getJob().getJobLoc();
            row[4] = ((JobResultWorkRequest)request).getSender();
            model.addRow(row);
        }
    }

    public void populateAppliedJob() {

        DefaultTableModel model = (DefaultTableModel) appliedJobTable.getModel();
        model.setRowCount(0);

        for (WorkRequest appliedJob : userAccount.getWorkQueue().getWorkRequestList()) {

            if(appliedJob instanceof AppliedJobRequest)
            {
                Object[] row = new Object[8];
                row[0] = ((AppliedJobRequest)appliedJob).getAppliedJobRequest();
                row[1] = appliedJob.getRequestDate();
                row[2] = appliedJob.getStatus();
                row[3] = appliedJob.getJob().getJobLoc();
                row[4] = appliedJob.getJob().getJobType();
                row[5] = ((AppliedJobRequest)appliedJob).getEntName();
                row[6] = ((AppliedJobRequest)appliedJob).getTestResult();
                row[7] = ((AppliedJobRequest)appliedJob).getStream();

                model.addRow(row);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JobPostingtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appliedJobTable = new javax.swing.JTable();
        btnApply = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1295, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JobPostingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Msg", "Job Type", "Company name", "Location", "Coop adv"
            }
        ));
        jScrollPane1.setViewportView(JobPostingtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 106, 740, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Suggested Job Posting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 75, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Job Applied");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 281, -1, -1));

        appliedJobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "University", "Sent Date", "Status", "Location", "Job Type", "Company", "Result", "Stream"
            }
        ));
        jScrollPane2.setViewportView(appliedJobTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 313, 740, 101));

        btnApply.setText("Apply Job");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });
        add(btnApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 234, -1, -1));

        jButton1.setText("View Job Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 234, -1, -1));

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:

        int selectedjob = JobPostingtable.getSelectedRow();
        if (selectedjob >= 0) {

            WorkRequest jobselected = (WorkRequest) JobPostingtable.getValueAt(selectedjob, 0);
            String message = "AppliedJob";
            String name = ((JobResultWorkRequest)jobselected).getEnterpriseName();
            Date newDate= new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //Or whatever format fits best your needs.
            String dateStr = sdf.format(newDate);
            StudentRole s= (StudentRole) userAccount.getRole();
          
            AppliedJobRequest request = new AppliedJobRequest();
            request.setMessage(message);
            request.setJob(jobselected.getJob());
            request.setStatus("SentToCompany");
            request.setAppliedJobRequest(enterprise.getName());
            request.setSender(userAccount);
            request.setRequestDate(dateStr);
            request.setMessage(userAccount.getFirstName());
            request.setTestResult("InProcess");
            
            for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
                 if(userAccount.getUsername().equalsIgnoreCase(ua.getUsername())){
                     request.setStream(userAccount.getMajors());
                     System.out.println(userAccount.getUsername() + " " + ua.getUsername());
                 }
                 
            }
           
            
            
            request.setEntName(name);

            Organization org1 = null;
          
     outer:for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                if (enterprise instanceof CompanyEnterprise)
                {
                    if(enterprise.getName().equalsIgnoreCase(request.getEntName()))
                    {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
                    {
                        if (organization instanceof CompanyDeptOrganization) 
                        {
                            org1 = organization;
                            break outer ;
                        }
                    }
                }
            }
        }

        if (org1 != null) 
        {
           org1.getWorkQueue().getWorkRequestList().add(request);
           userAccount.getWorkQueue().getWorkRequestList().add(request);
           JOptionPane.showMessageDialog(null, "Applied Successfully");
           populateAppliedJob();

        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Please select any row ");
        }

    }
        



    }//GEN-LAST:event_btnApplyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedjob1 = JobPostingtable.getSelectedRow();
        if (selectedjob1 >= 0) {
         WorkRequest jobselected1 = (WorkRequest) JobPostingtable.getValueAt(selectedjob1, 0);    
            
        studentJobDetailsJpanel panel = new studentJobDetailsJpanel(userProcessContainer,business ,userAccount, jobselected1 );
        userProcessContainer.add("personWorkArea", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JobPostingtable;
    private javax.swing.JTable appliedJobTable;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
