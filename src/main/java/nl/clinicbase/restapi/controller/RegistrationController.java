package nl.clinicbase.restapi.controller;

import javax.validation.Valid;

import nl.clinicbase.restapi.dto.MessageResponseDto;
import nl.clinicbase.restapi.dto.RegistrationRequestDto;
import nl.clinicbase.restapi.entity.EnumRole;
import nl.clinicbase.restapi.entity.Role;
import nl.clinicbase.restapi.entity.User;
import nl.clinicbase.restapi.repository.RoleRepository;
import nl.clinicbase.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody @Valid RegistrationRequestDto registrationRequestDto) {
        if (userRepository.existsByEmail(registrationRequestDto.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponseDto("Error: Username is already taken!"));
        }

        if (userRepository.existsByEmail(registrationRequestDto.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponseDto("Error: Email is already in use!"));
        }

        // Create new user's account
        User user = new User(registrationRequestDto.getFirstName(),
                registrationRequestDto.getLastName(),
                encoder.encode(registrationRequestDto.getPassword()),
                registrationRequestDto.getEmail());

        Set<String> strRoles = registrationRequestDto.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            System.out.println(EnumRole.ROLE_EMPLOYEE.name());
            Role userRole = roleRepository.findByRoleName(EnumRole.ROLE_EMPLOYEE.name())
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        Role adminRole = roleRepository.findByRoleName(EnumRole.ROLE_ADMIN.name())
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);

                        break;
                    case "super-admin":
                        Role saRole = roleRepository.findByRoleName(EnumRole.ROLE_SUPER_ADMIN.name())
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(saRole);

                        break;
                    case "doctor":
                        Role docRole = roleRepository.findByRoleName(EnumRole.ROLE_DOCTOR.name())
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(docRole);

                        break;
                    default:
                        Role userRole = roleRepository.findByRoleName(EnumRole.ROLE_EMPLOYEE.name())
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(userRole);
                }
            });
        }

        user.setRoles(roles);
        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponseDto("User registered successfully!"));
    }
}
