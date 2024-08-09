package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String getPerson(){
        return "JONJON";
    }

    public void notPerson(){
        var num = 1 + 1;

//        System.out.println(num);
    }

}
