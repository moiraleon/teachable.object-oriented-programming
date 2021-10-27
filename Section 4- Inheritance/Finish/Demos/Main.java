package com.codewithmosh;

public class Main {
//println method already calls the to string method
    //inheritancce represents and is a relationship - if a method takes an instance of a class type any other classes that inherit the parent class ->those instances are also valid-- this is called upcasting
    public static void main(String[] args) {
       UIControl[] controls = { new TextBox(), new CheckBox() };
       for (var control : controls)
           control.render();
    }
}
