package nl.lilianetop.emergentia.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
public class HomepageController {

    @GetMapping(value = {"/", "", "/home", "/home.html", "/index", "/index.html"})
    public String homepageHandler() {
        return "/homepage";
    }

}
