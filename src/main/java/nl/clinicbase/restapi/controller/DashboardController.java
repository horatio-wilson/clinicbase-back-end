package nl.clinicbase.restapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @GetMapping("/employee")
    public String getDashboardEmployee() {
        return "Dummy employee dashboard";
    }

    @GetMapping("/doctor")
    public String getDashboardDoctor() {
        return "Dummy doctor dashboard";
    }

    @GetMapping("/admin")
    public String getDashboardAdmin() {
        return "Dummy admin dashboard";
    }

    @GetMapping("/super-admin")
    public String getDashboardSuperAdmin() {
        return "Dummy super admin dashboard";
    }

}
