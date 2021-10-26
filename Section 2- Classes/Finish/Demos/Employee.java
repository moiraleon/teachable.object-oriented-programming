package com.codewithmosh;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees;

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) { //constructor using setter methods to use data verification of methods
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees);
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (getHourlyRate() * extraHours);
  }

  public int calculateWage() {
    return calculateWage(0);
  }//this is considered method overloading - in java it is the only way to run the method with different types of parameteres and can be done but is encouraged to be used sparingly

  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less.");
    this.baseSalary = baseSalary;
  }

  private int getBaseSalary() {
    return baseSalary;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate <= 0)
      throw new IllegalArgumentException("Hourly rate cannot be 0 or a negative value.");
    this.hourlyRate = hourlyRate;
  }
}
