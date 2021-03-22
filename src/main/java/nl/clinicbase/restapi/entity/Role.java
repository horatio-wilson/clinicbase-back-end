package nl.clinicbase.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
public class Role extends AuditableEntity {

//    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
    //private EnumRole roleName;
    private String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role(LocalDateTime createdOn, String createdBy, LocalDateTime updatedOn, String updatedBy) {
        super(createdOn, createdBy, updatedOn, updatedBy);
    }

    public Role(LocalDateTime createdOn, String createdBy, LocalDateTime updatedOn, String updatedBy, String roleName) {
        super(createdOn, createdBy, updatedOn, updatedBy);
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
