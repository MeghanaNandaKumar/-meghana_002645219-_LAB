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
public class Address {
    String Streetname;
    String Aptno;
    String City;
    String Zip;
 

   public Address(){
        this.Streetname="";
        this.Aptno="";
        this.City="";
        this.Zip="";
        
        }

    public String getStreetname() {
        return Streetname;
    }

    public void setStreetname(String Streetname) {
        this.Streetname = Streetname;
    }

    public String getAptno() {
        return Aptno;
    }

    public void setAptno(String Aptno) {
        this.Aptno = Aptno;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String Zip) {
        this.Zip = Zip;
    }
    

}