package com.codewithmosh;

public final class CheckBox extends UIControl { //declaring a class as final prevent sit from being extended -not often used- final classes also can not be overridden
//  UIControl[] controls =  {new TextBox(),new CheckBox()};
//  for(var control: controls){
//    ///code
  // control.render();
//    render check box
//  }



  @Override
  public void render() {
    System.out.println("Render CheckBox");
  }
}
