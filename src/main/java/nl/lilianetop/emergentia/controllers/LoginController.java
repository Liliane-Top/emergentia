package nl.lilianetop.emergentia.controllers;

import nl.lilianetop.emergentia.backingBeans.LoginUserParameters;
import nl.lilianetop.emergentia.dao.UserDao;
import nl.lilianetop.emergentia.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
@CrossOrigin(origins = "http://localhost:8081")
public class LoginController {
    private final UserDao userDao;

    @Autowired
    public LoginController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping({"/admin"})
    public String showLoginForm() {
        return "/admin";
    }


    @PostMapping("/login")
    public String checkLogin(@RequestBody LoginUserParameters pmUser) {
        User marielle;
        if(!userDao.existsUserByUsername(pmUser.getUsername())){
            return "User unknown";
        } else {
            marielle = userDao.findByUsername(pmUser.getUsername());
            if (!marielle.getPassword().equals(pmUser.getPassword()) ){
                return "Combination username password incorrect";
            } else return String.valueOf(marielle.getIdUser());
        }
    }


}
