package com.codewithmosh;

public class TextBox extends UIControl {
  private String text = "";

//  public TextBox() {
//    super(true);//super key word set to a boolean needs to be the first item in the constructor
//  }


  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  @Override//annotation
  public String toString() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
