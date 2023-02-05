/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author megha
 */
public class application {
    vitalsignhistory history;
    medicinecatalog catalog;
    
    public application() {
        this.catalog = new medicinecatalog();
        this.history = new vitalsignhistory();
    }

    public vitalsignhistory getHistory() {
        return history;
    }

    public void setHistory(vitalsignhistory history) {
        this.history = history;
    }

    public medicinecatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(medicinecatalog catalog) {
        this.catalog = catalog;
    }
}

    

   