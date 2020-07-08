import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.awt.Point; 
import java.awt.MouseInfo; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Get_Cursor_Coordinate_XY extends PApplet {

 



public void setup(){
 

}
public void draw(){ 
  background(0);
 Point mouse = MouseInfo.getPointerInfo().getLocation();   
 textSize(50);
 text("X: "+mouse.x+" Y: "+mouse.y,75  ,125);
 
}
 
  public void settings() {  size(500,250); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Get_Cursor_Coordinate_XY" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
