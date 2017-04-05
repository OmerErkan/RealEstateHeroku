package com.realestate.controller;

import com.realestate.model.User;
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

/**
 * Created by omererkan on 3/24/17.
 */

@Controller
public class AppController {
    @Autowired
    UserService userService;
    static Logger logger = LoggerFactory.getLogger(AppController.class);


    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String index(User user) {
        logger.error("Eror1");
        System.out.println("Erro2");

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String addNewPost(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {

            logger.error("Eror1");
            return "index";
        }
      if (user.getUsername().equals("omer")){
            if (user.getPassword().equals("1234")){
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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {

        if (error != null) {
            model.addAttribute("error", "Your username and password is invalid");
        }

        if (logout != null) {
            model.addAttribute("message", "You have logout successfully");

        }
        return "login";

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String enroll(@Valid User user, BindingResult bindingResult, Model model) {


        model.addAttribute("username", user.getUsername());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("emailAddress", user.getEmailAddress());

        return "index";
    }

}
