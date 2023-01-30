/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author megha
 */
public class Customer {
    String name;
    int customerId;
    
    public Customer(){
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public int getCustomerId() {
        return customerId;
    }

    
    public void setCustomerId(int customerId) {
    this.customerId = customerId;
    }
    
}

