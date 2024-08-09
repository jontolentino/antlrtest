package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonApiController {

    @GetMapping("/api/person")
    public ResponseEntity<?> personTest(){
        Map<String, String> personMap = new HashMap<>();
        personMap.put("firstName", "Jon");
        personMap.put("lastName", "Tolentino");
        Person jon = new Person();
        jon.setFirstName("Jon");
        jon.setLastName("Tolentino");
        System.out.println(jon.toString());
        return ResponseEntity.ok(jon);
    }
}
