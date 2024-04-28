package com.simpleintrestcalculater.service;

import com.simpleintrestcalculater.entity.SimpleInterest;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class SimpleInterestService {
    public String calculateSimpleInterest(SimpleInterest simpleInterest) {
        double principal = Double.parseDouble(String.valueOf(simpleInterest.getPrincipalAmount()));
        double rate = Double.parseDouble(String.valueOf(simpleInterest.getInterestRate()));
        double time = Double.parseDouble(String.valueOf(simpleInterest.getTimePeriod()));
        double interest = (principal * rate * time) / 100.0;
        double simpleInterestResult = Math.round(interest * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(simpleInterestResult);
    }
}
