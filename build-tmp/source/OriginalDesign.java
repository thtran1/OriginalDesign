import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

float x = 1;

public void setup()
{
	size(400,400);
	background(255, 183, 0);
	noLoop();
}
public void draw()
{
	//ground
	fill(255,183,0);
	rect(0,0,400,200);
	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(10, 97, 2);
    ellipse(-50+1*x,100+1*x, 5*x, 1.999f*x);
	}
	//road
	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(0, 0, 0);
    ellipse(-50+1*x, 150+1*x, 0.1f*x, 1.5f*x);
	}

	for (int a = 0; a < 1000; a = a + 1) {
    int x = a * 1;
    noStroke();
    fill(255,255,0);
    ellipse(-65+2*x, 150+1*x, 0.05f*x, 0.1f*x);
	}
	
	//house
	fill(255,255,255);
	rect(150*x,75*x,200*x,100*x);
	int b = 35;
	while (b<200) {
	    fill(0, 118, 173);
	    rect((b+150)*x,100*x,25*x,25*x);
	    b+=100;
	}
	fill(0);
	rect(235*x,130*x,25*x,45*x);
	fill(0);
	triangle(150*x,75*x,250*x,25*x,350*x,75*x);
	fill(0,0,0,100);
	triangle(350*x,175*x,350*x,125*x,400*x,125*x);
	//fence
	for (int a = 0; a < 50; a = a + 5) {
    int x = a * 1;
    noStroke();
    fill(117, 41, 0);
    rect(-50+10*x, 145+1*x, 0.25f*x, 1.5f*x);
    fill(0,0,0,100);
    triangle(-50+10*x+0.25f*x,145+1*x+1.5f*x,-50+10*x+0.25f*x,140+1*x+1.5f*x,-35+10*x+0.25f*x,140+1*x+1.5f*x);
	}
	for (int a = 0; a < 1000; a += 1) {
    int x = a * 1;
    noStroke();
    fill(117, 41, 0);
    ellipse(-50+10*x, 145+1*x, 2*x, 0.1f*x);
	}
}

public void mousePressed() 
{
	x = x+0.01f;
	redraw();
}

public void print()
{
	print("program started");
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
