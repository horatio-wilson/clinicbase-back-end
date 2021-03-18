package nl.clinicbase.restapi.entity;

import javax.persistence.Entity;

@Entity(name = "Patients")
public class Patient extends User {

    private long patientFileNumber;

    public long getPatientFileNumber() {
        return patientFileNumber;
    }

    public void setPatientFileNumber(long patientFileNumber) {
        this.patientFileNumber = patientFileNumber;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
