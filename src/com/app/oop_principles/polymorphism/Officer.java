package com.app.oop_principles.polymorphism;

import java.math.BigDecimal;

class Officer extends Salary{
    public Officer(BigDecimal cleanSalary){
        super(cleanSalary);
    }

    public BigDecimal getSalaryMultiplier(){
        return new BigDecimal(0.20);
    }
}