package com.kodilla.adapter.company;

import com.kodilla.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.adapter.company.newhrsystem.Employee;
import com.kodilla.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
