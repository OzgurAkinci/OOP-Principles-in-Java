package com.app.oop_principles.polymorphism;

import java.math.BigDecimal;

// Polymorphic class
abstract class Salary{
    private final BigDecimal salaryMultiplier = new BigDecimal(1.0); // ineffective element
    private final BigDecimal cleanSalary;

    protected Salary(BigDecimal cleanSalary){
        this.cleanSalary = cleanSalary;
    }

    public BigDecimal getSalaryMultiplier() {
        return this.salaryMultiplier;
    }

    public BigDecimal getCleanSalary() {
        return this.cleanSalary;
    }

    // Polymorphic method
    public BigDecimal getTotalSalary() {
        return this.cleanSalary.add(this.cleanSalary.multiply(getSalaryMultiplier()));
    }
}