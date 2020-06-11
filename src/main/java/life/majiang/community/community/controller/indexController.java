package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {


    @GetMapping("/")
    public String IndexCOntroller() {
        return "index";
    }
}
