/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author hemantkamath
 */
public class StressManagementRequest extends WorkRequest{
    
    private String appointment;
    private String stressMessage;

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getStressMessage() {
        return stressMessage;
    }

    public void setStressMessage(String stressMessage) {
        this.stressMessage = stressMessage;
    }
    
    @Override
    public String toString()
    {
        return this.stressMessage;
    }
   
    
}
