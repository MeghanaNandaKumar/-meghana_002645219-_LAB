/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author megha
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistoryy;
    
    public VitalSignHistory(){
        this.vitalSignHistoryy = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHHistory() {
        return vitalSignHistoryy;
    }

    public void setVitalSignHHistory(ArrayList<Observation> vitalSignHHistory) {
        this.vitalSignHistoryy = vitalSignHHistory;
    }
    
    //fetch or find obs based on ID
    public Observation findObservation(int id){
        for(Observation o: this.vitalSignHistoryy){
            if(o.getObservationId() == id){
                return o;
            }
        }
        return null;
    }
    
    
    public Observation createObservation(int ObservationId, double bloodPressure, double temperature){
        Observation observation = new Observation();
        
        observation.setObservationId(ObservationId);
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(temperature);
        
        
        
        this.vitalSignHistoryy.add(observation);
        return observation;
    }
    
    public Boolean checkObservationIdUnique(int id){
        for (Observation o: this.vitalSignHistoryy){
            if(o.getObservationId() == id){
                return false;
            }
        }
        return true;
    }
}
