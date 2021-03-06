package com.codewithmosh;

public abstract class UIControl { //abstract classes keep from being able to instantiate classes- methods can be declared abstract for reinforcement
  private boolean isEnabled = true;//other keywords such as protected can be used but are considered bad practice-- protected members are public within their own packages

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//    System.out.println("UIControl"); Constructors & Inheritance
//
//  }

  public abstract void render();//for polymorphism ex

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
