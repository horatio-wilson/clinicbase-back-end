package nl.clinicbase.restapi.repository;

import nl.clinicbase.restapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Boolean existsByFirstName(String firstName);

    Boolean existsByLastName(String lastName);

    Boolean existsByEmail(String email);

}
