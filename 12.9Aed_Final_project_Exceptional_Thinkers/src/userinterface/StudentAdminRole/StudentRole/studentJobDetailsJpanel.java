/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentAdminRole.StudentRole;

import Business.EcoSystem;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.UniversityEnterprise;
import Business.Network.Network;
import Business.Organization.CompanyDeptOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.Role.StudentRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppliedJobRequest;
import Business.WorkQueue.JobResultWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sangh
 */
public class studentJobDetailsJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StudentOrganization organization;
    private EcoSystem business;
    private  UserAccount userAccount;
    private WorkRequest jobselected1;
    private ArrayList<String> salesName3;
    private ArrayList<String> salesName4;
    private String companyname;
    private String jobType;

    /**
     * Creates new form studentJobDetailsJpanel
     */
    public studentJobDetailsJpanel() {
        initComponents();
    }

    

    
    studentJobDetailsJpanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, WorkRequest jobselected1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.salesName3= new ArrayList<String>();
        this.salesName4= new ArrayList<String>();
        this.jobselected1 = jobselected1;
        this.userAccount = userAccount;
        this.business = business;//To change body of generated methods, choose Tools | Templates.
        populate();
    }
    public void populate(){
        
        
        companyTxtField.setText(((JobResultWorkRequest)jobselected1).getEnterpriseName());
        jobType = jobselected1.getJob().getJobType();
        idTxtField.setText(jobselected1.getJob().getJobType());
        descriptionTxtField.setText(jobselected1.getJob().getJobDesc());
        companyname = ((JobResultWorkRequest)jobselected1).getEnterpriseName().toString();
        System.out.println(companyname);
        
        
        
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        descriptionTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        companyTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1190, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(idTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 400, -1));

        jLabel1.setText("JOB TYPE:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton1.setText("Others");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));
        add(descriptionTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 400, -1));

        jLabel2.setText("DESCRIPTION:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel4.setText("COMPANY :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        add(companyTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 400, -1));

        jButton2.setText("SKILL SET ANALYSIS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jButton3.setText("PREVIOUS YEAR ANALYSIS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jButton4.setText("<< BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Detailed Job Decription");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 400, -1));

        jLabel3.setText("GET DETAILED ANALYSIS ABOUT THE PREVIOUS RECORDS :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String enterpriseName = ""; 
        
         for (Network net : business.getNetworkList()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent instanceof UniversityEnterprise) {
                    for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof StudentOrganization) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (ua.getUsername().equals(userAccount.getUsername())) {
                                    enterpriseName = ent.getName();
                                }
                            }
                        }

                    }
                }
            }
        }
        
        
        
        for(Network net : business.getNetworkList()){
            for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
                if(ent instanceof CompanyEnterprise){
                for(Organization org : ent.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof CompanyDeptOrganization){
                           for(WorkRequest req : org.getWorkQueue().getWorkRequestList()){
                               if(req instanceof AppliedJobRequest){
                                   
                                   if(((AppliedJobRequest) req).getAppliedJobRequest().equalsIgnoreCase(enterpriseName)){
                                       if(((AppliedJobRequest) req).getEntName().equalsIgnoreCase(companyname)){
                                       //System.out.println(((AppliedJobRequest) req).getEntName()+""+companyname);
                                         salesName3.add(((AppliedJobRequest) req).getStream());
                                          // System.out.println(salesName3.size());
                                       
                                       }
                                  }
                                        
                                 
                                 
                                     
                               }
                           }
                    }
                }
            }
        }
        System.out.println(salesName3.size());
           Map<String, Long> map = salesName3.stream()
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

     List<Map.Entry<String, Long>> result = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        
        .collect(Collectors.toList());
        for(int i=0; i<result.size() ; i++){
            System.out.println(result.get(i).getValue() + "  " + result.get(i).getKey());
        }
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(int i=0; i<result.size() ; i++){
            pieDataset.setValue(result.get(i).getKey(), new Long(result.get(i).getValue()));
        }
       
        JFreeChart chart = ChartFactory.createPieChart3D("Parameter Pie chart", pieDataset, true, true, true);
        //jfreeChart = ChartFactory.createPieChart("Parameter Pie chart", pieDataset, true, true, true);
        PiePlot3D p =(PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie chart",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
        
    }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String skill =  userAccount.getSkill1();        
        
                for(Network net : business.getNetworkList()){
            for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
                if(ent instanceof CompanyEnterprise){
                for(Organization org : ent.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof CompanyDeptOrganization){
                           for(WorkRequest req : org.getWorkQueue().getWorkRequestList()){
                               if(req instanceof AppliedJobRequest){
                                   

                                       if(((AppliedJobRequest) req).getEntName().equalsIgnoreCase(companyname)){
                                           
                                           if(req.getJob().getJobType().equalsIgnoreCase(jobType))
                                           {
                                                 if(((AppliedJobRequest) req).getTestResult().equalsIgnoreCase("hired")){
                                                     
                                                                            System.out.println(((AppliedJobRequest) req).getSender()+" "+((AppliedJobRequest) req).getSender().getSkill1());
                                                                               salesName4.add(((AppliedJobRequest) req).getSender().getSkill1());
                                                                        }
                                                                        
                                               
                                           }
                                           
                                       
                                       }
                                   
                                   
                               }
         
                               }
                           }
                    }
                }
            }
                                            }
                
              Map<String, Long> map = salesName4.stream()
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

     List<Map.Entry<String, Long>> result = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        
        .collect(Collectors.toList());
        for(int i=0; i<result.size() ; i++){
            System.out.println(result.get(i).getValue() + "  " + result.get(i).getKey());
        }   
        
         DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(int i=0; i<result.size() ; i++){
            pieDataset.setValue(result.get(i).getKey(), new Long(result.get(i).getValue()));
        }
                
                
                JFreeChart chart = ChartFactory.createPieChart3D("Parameter Pie chart", pieDataset, true, true, true);
        //jfreeChart = ChartFactory.createPieChart("Parameter Pie chart", pieDataset, true, true, true);
        PiePlot3D p =(PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie chart",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        // TODO add your handling code here:
            SkillSetAnalysis panel = new SkillSetAnalysis(userProcessContainer,business ,userAccount, jobselected1 );
        userProcessContainer.add("personWorkArea", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField companyTxtField;
    private javax.swing.JTextField descriptionTxtField;
    private javax.swing.JTextField idTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}