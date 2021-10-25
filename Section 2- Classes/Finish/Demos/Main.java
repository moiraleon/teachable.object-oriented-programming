package com.codewithmosh;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        //Procedural Programming
        int baseSalary = 50_000;
        int extraHours = 20;
        int hourlyRate = 10;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

//        var employee = new Employee(50_000, 20);
//        Employee.printNumberOfEmployees();
//        int wage = employee.calculateWage();
//        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary+(extraHours * hourlyRate);
    }
}
