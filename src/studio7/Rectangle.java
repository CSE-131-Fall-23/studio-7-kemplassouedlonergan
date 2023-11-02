package studio7;

import edu.princeton.cs.introcs.StdDraw;
import java.util.Scanner;

public class Rectangle {
	
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Enter length: ");
	private int length = in.nextInt();
	
	System.out.println("Enter width: ");
	private int width = in.nextInt() ;
	
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getPerimeter() {
		return ((2 * length) + (2 * width));
	}

	public int getArea() {
		return length * width;
	}

	public boolean square() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSmaller(Rectangle a) {
		int aArea = a.getArea();
		if (aArea < this.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	public void draw() {
		StdDraw.filledRectangle(this.length, this.length, this.width, this.length);
		StdDraw.filledRectangle(this.length, this.length, this.width, this.length);
		
	}
}

