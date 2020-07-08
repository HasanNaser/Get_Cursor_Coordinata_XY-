 
import java.awt.Point;
import java.awt.MouseInfo;

void setup(){
 size(500,250);

}
void draw(){ 
  background(0);
 Point mouse = MouseInfo.getPointerInfo().getLocation();   
 textSize(50);
 text("X: "+mouse.x+" Y: "+mouse.y,75  ,125);
 
}
 