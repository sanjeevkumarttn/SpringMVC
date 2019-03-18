package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

// Question1

/*public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return  modelAndView;
    }
}*/

// Question2

/*public class StudentController extends MultiActionController {

    public ModelAndView dummy(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void dummy2(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }
}*/

// Question3

/*
@Controller
public class StudentController {

    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
*/

// Question 4

/*@Controller

public class StudentController {

    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("hello")
    String hello() {
        return "Hello World!!!";
    }
}*/

// Question5

/*@Controller
public class StudentController {
    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("modelIndex");
        modelAndView.addObject("msg", "Hello World!!");
        return modelAndView;
    }
}*/

// Question 6

/*@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/usernameAndPassword/{username}/{password}")
    @ResponseBody
    String returnVariables(@PathVariable("username") String uname, @PathVariable("password") String pword) {
        return "Username: " + uname + " Password: " + pword;
    }
}*/


// Question 7
/*
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/firstnameAndLastname/{firstname}/{lastname}")
    @ResponseBody
    String returnNames(@PathVariable Map<String, String> requestMap) {
        return "Firstname: " + requestMap.get("firstname") + " Lastname: " + requestMap.get("lastname");
    }
}*/

// Question 8

/*@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("indexForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstname") String username,
                      @RequestParam("lastname") String password) {
        return "Firstname: " + username + " Lastname: " + password;
    }
}*/

// Question 9

/*@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("indexForm");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO studentCO) {
        return "Firstname: " + studentCO.getFirstname() + " <br>Lastname: " + studentCO.getLastname();
    }
}*/

// Question 10

@Controller
@RequestMapping("/student")
public class StudentController {
    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }
    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index2");
        return modelAndView;
    }
    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute("studentCO") StudentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("submittedData");
        return modelAndView;
    }
}
