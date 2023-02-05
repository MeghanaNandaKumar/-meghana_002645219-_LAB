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
public class medicinecatalog {
    ArrayList<medicine> medicineList;
    
    public medicinecatalog(){
        this.medicineList = new ArrayList<medicine>();
    }

    public ArrayList<medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<medicine> medicineList) {
        this.medicineList = medicineList;
    }

    
    
    public medicine createMedicine(String name, double dosage){
        medicine medicine = new medicine();
        medicine.setDosage(dosage);
        medicine.setMedicineName(name);
        
        this.medicineList.add(medicine);
        return medicine;
        
    }
    
    //check if medicine exists
    public Boolean checkIfMedicineUnique(String name){
          for(medicine m: this.medicineList){
              if(m.getMedicineName().equals(name)){
                  return false;
              }
          }
        return true;
      }
    
    public void removeMedicine(String name){
          for(medicine m: this.medicineList){
              if(m.getMedicineName().equals(name)){
                  this.medicineList.remove(m);
                  break;
              }
          }
    }
    
}
