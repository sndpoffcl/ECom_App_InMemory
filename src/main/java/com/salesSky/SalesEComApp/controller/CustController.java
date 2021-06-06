package com.salesSky.SalesEComApp.controller;

import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/greetCustomer")
    public ResponseEntity greetCustomer(){
        return ResponseEntity.ok("Hello Customer");
    }

    @PostMapping("/customer")
    public ResponseEntity saveCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveCustomerDetails(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") int id){
        Customer savedCustomer = customerService.getCustomerDetails(id);
        return ResponseEntity.ok(savedCustomer);
    }
}
