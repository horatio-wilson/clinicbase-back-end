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
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec sapien nulla. Proin varius est a dignissim vulputate. Nam ante dui, accumsan a felis et, vulputate imperdiet ante. Integer pellentesque eleifend dictum. Proin at orci pellentesque, pharetra ipsum sed, placerat purus. Donec gravida pharetra ante tempus lacinia. Aenean malesuada libero est, vitae tincidunt risus rutrum ac. Donec a lorem in lorem lacinia vulputate a sit amet elit. Pellentesque non commodo odio, vel convallis ligula.\n" +
                "\n" +
                "Sed fringilla est aliquet, sollicitudin massa non, dignissim justo. Nullam porta vulputate felis. Praesent vel augue purus. Donec fermentum vitae est sit amet ultrices. Fusce iaculis tempus elit, vel vestibulum nunc rhoncus nec. Nullam ipsum elit, condimentum id maximus a, tincidunt sed erat. Maecenas mollis enim purus, nec semper purus molestie id. Proin est risus, tincidunt non fermentum et, fermentum vitae tellus. Sed a convallis arcu.\n" +
                "\n" +
                "Morbi semper posuere tellus. Aliquam erat volutpat. Fusce accumsan tellus in leo luctus, ac tincidunt odio volutpat. Mauris lorem dolor, egestas varius ipsum in, sollicitudin blandit odio. Duis luctus scelerisque viverra. Donec non maximus tellus, vel egestas risus. Fusce placerat odio et luctus malesuada. Sed interdum bibendum elit elementum cursus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin in risus leo. Aenean tristique lobortis tempor. Mauris lorem eros, sollicitudin eget ante quis, pretium facilisis nisi.\n" +
                "\n" +
                "Duis gravida odio vitae lorem mollis, ut fermentum lorem egestas. Phasellus sit amet facilisis mi. Duis ut sapien leo. Proin lobortis, massa at finibus convallis, enim nisi rutrum elit, id rhoncus nisl metus sed est. Proin et accumsan ligula, at tristique ligula. Curabitur molestie turpis elit, a faucibus felis placerat sed. Morbi dignissim nec nibh ut bibendum. Mauris at elit ut odio pellentesque consectetur.\n" +
                "\n" +
                "Duis ut quam a nunc laoreet condimentum sit amet vel odio. Morbi ex dolor, volutpat facilisis tincidunt eu, scelerisque in orci. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas pharetra faucibus maximus. Praesent porttitor vulputate lorem, sed posuere urna pretium non. Mauris ut ullamcorper lectus. Aliquam odio ipsum, luctus vel elit sit amet, accumsan imperdiet est. Nullam iaculis ut neque eget ultrices. Aliquam vestibulum erat lacus, sit amet gravida nunc sagittis eu. Aliquam sed ante pretium, tempor felis eu, imperdiet purus. Maecenas quis dolor sit amet sem rhoncus auctor sed a libero.";
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
