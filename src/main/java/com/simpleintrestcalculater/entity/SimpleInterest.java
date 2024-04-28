package com.simpleintrestcalculater.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SimpleInterest {
    private long principalAmount;
    private int interestRate;
    private int timePeriod;
}