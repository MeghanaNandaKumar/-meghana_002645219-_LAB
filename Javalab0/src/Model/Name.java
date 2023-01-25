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
public class Name {
    String NUID;
    private String firstname;
    private String lastname;
    private String collegename;
    Address Currentaddress;
    Address Permanentaddress;
    Contact office;
    Contact personal;
    
    public Name(){
        this.NUID="";
        this.firstname="";
        this.lastname="";
        this.collegename="";
        this.Currentaddress=new Address();
        this.Permanentaddress=new Address();
        this.personal=new Contact();
        this.office=new Contact();
        
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public Address getCurrentaddress() {
        return Currentaddress;
    }

    public void setCurrentaddress(Address Currentaddress) {
        this.Currentaddress = Currentaddress;
    }

    public Address getPermanentaddress() {
        return Permanentaddress;
    }

    public void setPermanentaddress(Address Permanentaddress) {
        this.Permanentaddress = Permanentaddress;
    }

    public Contact getOffice() {
        return office;
    }

    public void setOffice(Contact office) {
        this.office = office;
    }

    public Contact getPersonal() {
        return personal;
    }

    public void setPersonal(Contact personal) {
        this.personal = personal;
    }

    
    
}
