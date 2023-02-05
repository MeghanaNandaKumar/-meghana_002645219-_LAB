/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author megha
 */
public class vitalsignhistory {
    ArrayList<observation> vitalSignHistory;
    
    public vitalsignhistory() {
        this.vitalSignHistory = new ArrayList<observation>();
        
    }

    public ArrayList<observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    
  
      public observation createObservation(int observationId, double bloodPressure,double temperature)
      {     observation observation = new observation();
            observation.setBloodPressure(bloodPressure);
            observation.setTemperature(temperature);
            observation.setObservationId(observationId);
            
            //add the objects into the ArrayList
            this.vitalSignHistory.add(observation);
            return observation;
      }
      
      public Boolean checkObservationIdUnique(int id){
          for(observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return false;
              }
          }
        return true;
      }
      
      public observation findObservation(int id){
          for(observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return o;
              }
          }
        return null;
      }
}
