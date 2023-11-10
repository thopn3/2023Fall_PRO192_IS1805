
package Ex;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    // Khai bao cac data fields: Chua du lieu cua doi tuong
    private String id;
    private String firtName;
    private String lastName;
    private Date dateOfBirth; // dd/MM/yyyy
    private boolean gender;
    
    // Cac ham khoi tao

    public Student() {
    }

    public Student(String id, String firtName, String lastName, Date dateOfBirth, boolean gender) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    
    // Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + "\t" + lastName + " " + firtName + "\t" + getAge() + "\t" + getGender();
    }
    
    private int getAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }
    
    private String getGender(){
        return gender==true ? "male" : "female";
    }
}
