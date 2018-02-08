/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Jerin
 */
public class JobDirectory {
    
    public ArrayList<JobPosting> jobDirectory;
    
    public JobDirectory(){
    
        this.jobDirectory = new ArrayList<>();
    }

    public ArrayList<JobPosting> getJobDirectory() {
        return jobDirectory;
    }

    public JobPosting AddJob(){
    
        JobPosting jp = new JobPosting();
        jobDirectory.add(jp);
        return jp;
    }
    
    public void deleteJob(JobPosting job)
    {
    jobDirectory.remove(job);
    }
    
    
}
