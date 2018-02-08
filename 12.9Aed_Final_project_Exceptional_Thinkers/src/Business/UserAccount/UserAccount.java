/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Role.StudentRole;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author hemantkamath
 */
public class UserAccount {
    
    private String username;
    private String entpriseName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String major;
    private String firstName;
    private String lastName;
    private String dob;
    private String phoneNumber;
    private String email;
    private String ssn;
    private String state;
    private String city;
    private String workexperienxe;
    private String majors;
    private String skill1;
    private String skill2;
    private String skill3;
    private String projectSummary;
    private String interestedJob;
    private String github;
    private String awards;
    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWorkexperienxe() {
        return workexperienxe;
    }

    public void setWorkexperienxe(String workexperienxe) {
        this.workexperienxe = workexperienxe;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }

    public String getInterestedJob() {
        return interestedJob;
    }

    public void setInterestedJob(String interestedJob) {
        this.interestedJob = interestedJob;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getEntpriseName() {
        return entpriseName;
    }

    public void setEntpriseName(String entpriseName) {
        this.entpriseName = entpriseName;
    }
    
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}