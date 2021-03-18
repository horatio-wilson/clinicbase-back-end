package nl.clinicbase.restapi.entity;

import javax.persistence.Entity;

@Entity(name = "Employees")
public class Employee extends User {

    private String workEmail;

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
