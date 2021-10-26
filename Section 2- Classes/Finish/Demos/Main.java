package com.codewithmosh;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee(50_000, 20); //cmd +p shows the parameters of the method
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }

}
