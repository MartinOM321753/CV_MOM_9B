package mx.edu.utez.cv_mom_9b.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin(origins = "*")
public class User2Controller {

    @GetMapping("/")
    public String getData() {
        return "Hola desde User1Controller 2";
    }

}
