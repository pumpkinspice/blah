// APCS1 Lab Test Practice
//
// Prog05.java
//
// Swiss Cheese
//
// Points: 3
//
////////////////////////////////////////////////////////////////////////////////
// Write a program that will draw a piece of Swiss Cheese.
// To do this draw a yellow rectangle and then draw several white circles 
// on top of the rectangle to give the illusion of holes.
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog05.html in order to execute this file.
//
// ALSO: The sample exection of this file is on the back of your lab practice sheet.
//
// ALSO: On some computers, the output will not show up until you move the mouse.


import java.awt.*;
import java.applet.*;


public class Prog05 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(150,150,500,500);
		g.setColor(Color.white);
		g.fillOval(200,150,100,50);
		g.fillOval(300, 200, 175, 75);
		g.fillOval(375,500,150,150);
		g.fillOval(100, 400, 100, 100);
		g.fillOval(125,300,100,100);
		g.fillOval(450, 150, 25, 25);
		g.fillOval(175, 200, 150, 150);




	}
}

