/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Jerin
 */
public class AppliedJobRequest extends WorkRequest {
    
    private String appliedJobRequest;
    private String entName;
    private String stream;
     private String testResult;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getAppliedJobRequest() {
        return appliedJobRequest;
    }

    public void setAppliedJobRequest(String appliedJobRequest) {
        this.appliedJobRequest = appliedJobRequest;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }
    
    
    
    
    
}
