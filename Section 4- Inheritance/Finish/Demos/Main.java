package com.codewithmosh;

public class Main {
//println method already calls the to string method
    public static void main(String[] args) {
       UIControl[] controls = { new TextBox(), new CheckBox() };
       for (var control : controls)
           control.render();
    }
}
