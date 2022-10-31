package shop.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import shop.Models.Role;
import shop.Models.Shop;
import shop.Models.User;
import shop.Repositories.RoleRepository;
import shop.Repositories.UserRepository;

@Controller
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {
        System.err.println("Loaded login page");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {
        System.err.println("Loaded register page");
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("registration");

        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView register(ModelAndView modelAndView, User user) {
        System.err.println(user);
        User userExists = userRepository.findByLogin(user.getLogin());
        if (userExists != null) {
            modelAndView.setViewName("registration");
        } else {
            user.setRole(roleRepository.findRoleByRoleId(1L));
            userRepository.save(user);
            System.err.println("User saved");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("login");
        }

        return modelAndView;
    }
}
