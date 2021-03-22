package nl.clinicbase.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee extends User {

    @Column(name = "employee_id")
    private int employeeId;

    public Employee() {
    }

    public Employee(LocalDateTime createdOn, String createdBy, LocalDateTime updatedOn, String updatedBy, String firstName, String lastName, String password, String email, Set<Role> roles, int employeeId) {
        super(createdOn, createdBy, updatedOn, updatedBy, firstName, lastName, password, email, roles);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

}
