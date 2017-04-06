package com.realestate.controller;

import com.realestate.model.Country;
import com.realestate.model.User;
import com.realestate.repository.UserRepository;
import com.realestate.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by omererkan on 3/24/17.
 */

@Controller
public class AppController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository  userRepository;
    static Logger logger = LoggerFactory.getLogger(AppController.class);


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index(User user) {
        logger.error("Eror1");
        System.out.println("Erro2");

        return "login";
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String listProperties(Model model) {
//
//        List<String> operators = new ArrayList<>();
//        Country country = new Country();
//        Country country2 = new Country();
//        Country country3 = new Country();
//        country.setCountryName("Spain");
//        country2.setCountryName("Germany");
//        country3.setCountryName("US");
//        operators.add(country.getCountryName());
//        operators.add(country2.getCountryName());
//        operators.add(country3.getCountryName());
//        model.addAttribute("operators", operators);
//
//        return "list-property";
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String addNewPost(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {

            logger.error("Eror1");
            return "index";
        }
        if (user.getUsername().equals("omererkan")) {
            if (user.getPassword().equals("1234")) {

                List<String> operators = new ArrayList<>();
                Country country = new Country();
                Country country2 = new Country();
                Country country3 = new Country();
                country.setCountryName("Spain");
                country2.setCountryName("Germany");
                country3.setCountryName("US");
                operators.add(country.getCountryName());
                operators.add(country2.getCountryName());
                operators.add(country3.getCountryName());
                model.addAttribute("operators", operators);

                return "list-property";
            }
        }

        return "404";
    }


//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index() {
//        return "alerts";
//    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/logsin", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {

        if (error != null) {
            model.addAttribute("error", "Your username and password is invalid");
        }

        if (logout != null) {
            model.addAttribute("message", "You have logout successfully");

        }
        return "login";

    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String viewRegistration(User user,Model model){
        model.addAttribute("name",user.getName());
        //model.addAttribute("middleName",user.getMiddleName());
        model.addAttribute("surname",user.getSurname());
        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("confirmPassword",user.getConfirmPassword());
        model.addAttribute("emailAddress", user.getEmailAddress());
        return "login";

    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String enroll(@Valid User user, BindingResult bindingResult, Model model) {


        userRepository.save(user);
        return "login";
    }

}
