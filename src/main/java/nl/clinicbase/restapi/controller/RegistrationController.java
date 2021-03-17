package nl.clinicbase.restapi.controller;

import nl.clinicbase.restapi.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("register")
    public void register(@RequestBody UserDto userDto) {

        //@TODO Actual implementation of method
        System.out.println("Registering user");

    }
}
