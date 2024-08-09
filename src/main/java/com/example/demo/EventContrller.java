package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class EventContrller {

    @Autowired
    private AntlerManager antlerManager;

    @GetMapping("/process-event")
    public ResponseEntity<?> processEvent() {
        Person testPerson = new Person("Jon", "Tolentino", 28, BigDecimal.valueOf(10_000));

        String eventString = "FROM " +
                testPerson.toString() +
                "SELECT firstName, lastName;";

        return ResponseEntity.ok(antlerManager.send(eventString));
    }
}
