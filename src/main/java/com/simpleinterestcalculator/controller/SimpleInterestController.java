package com.simpleinterestcalculator.controller;

import com.simpleinterestcalculator.entity.SimpleInterest;
import com.simpleinterestcalculator.service.SimpleInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class SimpleInterestController {
    @Autowired
    SimpleInterestService simpleInterestService;

    @PostMapping()
    public String calculateSimpleInterest(@RequestBody(required = true) SimpleInterest SimpleInterest){
        System.out.println("Hit");
        return simpleInterestService.calculateSimpleInterest(SimpleInterest) ;
    }

}
