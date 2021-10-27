package com.codewithmosh;

public class TaxCalculator2018 extends AbstractTaxCalculator {
  private double taxableIncome;

  public TaxCalculator2018(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  @Override //not prompted by IDE but annotate methods with @ Override for methods being used in an interface// also public declaration in interface is redundant because the method would have to be public to be encapsulated in an interface and extended to other classes so we don't state it
  public double calculateTax() {
    return taxableIncome * 0.3;
  }
}
