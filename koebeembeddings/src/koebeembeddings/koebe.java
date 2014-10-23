package koebeembeddings;
import processing.core.*;
public class koebe extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4743866544731854829L;

	public void setup() 
	{
	  size(640, 360); 
	  noStroke();
	  rectMode(CENTER);
	}

	public void draw() 
	{   
	  background(51); 
	  fill(255, 204);
	  rect(mouseX, height/2, mouseY/2+10, mouseY/2+10);
	  fill(255, 204);
	  int inverseX = width-mouseX;
	  int inverseY = height-mouseY;
	  rect(inverseX, height/2, (inverseY/2)+10, (inverseY/2)+10);
	}

}
