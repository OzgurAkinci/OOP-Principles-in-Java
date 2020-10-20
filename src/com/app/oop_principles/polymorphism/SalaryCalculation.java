package com.app.oop_principles.polymorphism;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

// Polymorphism
public class SalaryCalculation {
    private static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String args[]) {
        List<Salary> employeeSalaries = new ArrayList<>();
        employeeSalaries.add(new Officer(new BigDecimal(5000)));
        employeeSalaries.add(new Worker(new BigDecimal(5000)));
        employeeSalaries.forEach(language -> {
            System.out.println(language.getClass().getName() + ": Main Salary: " + df.format(language.getCleanSalary()) + ", Total Salary: " + df.format(language.getTotalSalary()));
        });
    }
}
