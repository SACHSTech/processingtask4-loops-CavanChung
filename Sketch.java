/**
 * Name:Processing Task 4
 * Purpose:Loop quadrants
 * Author: Cavan Chung
 * Created:2022/03/30
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }
  
  public void setup() {
    background(255);
  }

  public void draw() {
    //Quad 1 - Draws ten by ten grid by drawing 10 x-lines and 10 y-lines, stopping at width/2 or half the window
    for (int lineXY = 0; lineXY <= width / 2; lineXY += (width / 20)) {
      stroke(0);
      line(lineXY, 0, lineXY, height / 2);
      line(0, lineXY, width / 2, lineXY);
    }
    //Quad 2 - Nested loop, draws a 5 rows of 5 circles
    for (int circleY = height / 2 / 6; circleY <= height / 2 - (height / 2 / 6); circleY += height / 2 / 6) {
      for (int circleX = (width / 2) + width / 2 / 6; circleX <= width - (width / 2 / 6); circleX += width / 2 / 6) {
        fill(255, 255, 224);
        ellipse(circleX, circleY, 20, 20);
      }
    }
    //Quad 3 - line colour and location is added by plus one every loop and stops at half the window size. This will create a gradual colour change from left to right.
    for (int lineX = 0; lineX <= width/2; lineX++) {
        line(lineX, height/2, lineX, height);  
        stroke(lineX);
    }
    //Quad 4 - Draw and rotate flower, while placing it in quadrant 4 and using f to convert to float

    stroke(0);
    translate(width / 2.1f + width / 4.1f, height / 2.1f + height / 4.1f);
    
    for (int i = 0; i <= 8; i += 1) {
      rotate(radians(45));
      fill(255, 255, 224);
      ellipse(0, 0, width/20, height/3);  
    }
      fill(0, 0, 0);
      ellipse(0, 0, width/6, height/6);
    }
  }
