package com.kodilla.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    final private String peselId;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (peselId != null ? !peselId.equals(employee.peselId) : employee.peselId != null) return false;
        if (firstname != null ? !firstname.equals(employee.firstname) : employee.firstname != null) return false;
        if (lastname != null ? !lastname.equals(employee.lastname) : employee.lastname != null) return false;
        return baseSalary != null ? baseSalary.equals(employee.baseSalary) : employee.baseSalary == null;
    }

    @Override
    public int hashCode() {
        int result = peselId != null ? peselId.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (baseSalary != null ? baseSalary.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

