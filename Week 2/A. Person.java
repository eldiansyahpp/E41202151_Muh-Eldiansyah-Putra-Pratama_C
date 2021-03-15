/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
public class Person {

    String fName, lName, stuId, stuStatus;

    public Person (String fName, String lName, String stuId, String stuStatus) {

        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;        
        this.stuStatus = stuStatus;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getStuId() {
        return stuId;
    }    
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public String getStuStatus() {
        return stuStatus;
    }
    
    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }
    
    public static void main(String[] args) {

        Person student = new Person("Lisa", "Palambo", "123456789", "Active");
        System.out.println("#### Student Data ####");
        System.out.println("Student  Name   : " + student.fName + " " + student.lName);
        System.out.println("Student  ID     : " + student.stuId);
        System.out.println("Student  Status : " + student.stuStatus);
    }
}
