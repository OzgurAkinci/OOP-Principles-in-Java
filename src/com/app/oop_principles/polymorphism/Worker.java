package com.app.oop_principles.polymorphism;

import java.math.BigDecimal;

class Worker extends Salary{
    public Worker(BigDecimal cleanSalary){
        super(cleanSalary);
    }

    public BigDecimal getSalaryMultiplier(){
        return new BigDecimal(0.25);
    }
}