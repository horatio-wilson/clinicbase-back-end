package nl.clinicbase.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient extends User {

    @Column(name="patient_file_number")
    private long patientFileNumber;

    public long getPatientFileNumber() {
        return patientFileNumber;
    }

    public void setPatientFileNumber(long patientFileNumber) {
        this.patientFileNumber = patientFileNumber;
    }

    public Patient(LocalDateTime createdOn, String createdBy, LocalDateTime updatedOn, String updatedBy, String firstName, String lastName, String password, String email, Set<Role> roles, long patientFileNumber) {
        super(createdOn, createdBy, updatedOn, updatedBy, firstName, lastName, password, email, roles);
        this.patientFileNumber = patientFileNumber;
    }

}
