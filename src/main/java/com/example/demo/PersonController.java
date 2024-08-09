//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class PersonController {
//
//    @Autowired
//    private PersonService personService;
//
//
//
//    @GetMapping("/person")
//    public String getPerson(){
//
//        var jooni = "Stirng";
//        String asd = personService.getPerson();
//        System.out.println(asd);
//
//        Person bray = new Person("bray", "test");
//        bray.setLastName("test2");
//        System.out.println(bray);
//
//        personService.notPerson();
//
////        Model mode
//        return "person";
//    }
//}
