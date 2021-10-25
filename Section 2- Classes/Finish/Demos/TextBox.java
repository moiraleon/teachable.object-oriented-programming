package com.codewithmosh;

public class TextBox {
  public String text = ""; //Fields are generally not public

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
