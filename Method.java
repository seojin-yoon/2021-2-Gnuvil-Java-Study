package JavaTest;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "public static void main(String[] args) {}" is default.  
		int result = plus(1,3);
		System.out.println(result);
		
		printTwice("OOH-AHH");
	}
	
	static void printTwice(String text){
		// No return value.
		System.out.println(text);
		System.out.println(text);
	}
	
	static int plus(int x, int y) {
		return x+y;
	}

}


import java.util.*;
import java.text.*;

class Main {
	public static void main(String[] args) {
		double radius,edge1,edge2,side1,side2,side3;
		String c,r,t;
		
		Scanner sc = new Scanner(System.in);
		c = sc.next();
		radius = sc.nextDouble();
		Circle c1 = new Circle(radius); 
		r = sc.next();
		edge1 = sc.nextDouble();
		edge2 = sc.nextDouble();
		Rectangle r1 = new Rectangle(edge1, edge2); 
		t = sc.next();
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		Triangle t1 = new Triangle(side1, side2, side3);
		
		DecimalFormat format=new DecimalFormat("0.0##");
		double data=c1.getArea();
		double data2=Math.floor(data*1000)/1000;
		String ret=format.format(data2);
		
		double data3=r1.getArea();
		double data4=Math.floor(data3*1000)/1000;
		String ret2=format.format(data4);
		
		double data5=t1.getArea();
		double data6=Math.floor(data5*1000)/1000;
		String ret3=format.format(data6);
		
		
		System.out.println("The Area of Circle: "+ret);
		System.out.println("The Area of Rectangle: "+ret2);
		System.out.println("The Area of Triangle: "+ret3);
		if (c1.compareTo(r1)==-1 && c1.compareTo(t1)==-1 && r1.compareTo(t1)==1){
			System.out.println("The Rectangle has largest area.");
			System.out.println("The Triangle has second largest area.");
		}
		else if (c1.compareTo(r1)==-1 && c1.compareTo(t1)==-1 && r1.compareTo(t1)==-1){
			System.out.println("The Triangle has largest area.");
			System.out.println("The Rectangle has second largest area.");
		}
		else if (c1.compareTo(r1)==1 && c1.compareTo(t1)==1 && r1.compareTo(t1)==1){
			System.out.println("The Circle has largest area.");
			System.out.println("The Rectangle has second largest area.");
		}
		else if (c1.compareTo(r1)==-1 && c1.compareTo(t1)==1 && r1.compareTo(t1)==-1){
			System.out.println("The Rectangle has largest area.");
			System.out.println("The Circle has second largest area.");
		}
		else if (c1.compareTo(r1)==1 && c1.compareTo(t1)==1 && r1.compareTo(t1)==-1){
			System.out.println("The Circle has largest area.");
			System.out.println("The Triangle has second largest area.");
		}
		else {
			System.out.println("The Triangle has largest area.");
			System.out.println("The Circle has second largest area.");
		}
	}
}

abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	@Override 
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}
	public abstract double getArea();

	public abstract double getPerimeter();
}

class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override 
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override 
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
			"\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
	}
}

class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(
		double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this. width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	@Override 
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override 
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}

class Triangle extends GeometricObject {
	private double side1; 
	private double side2; 
	private double side3;

	public Triangle(){
	} 

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, 
		String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled); 
	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Set side1 to a new lentgh */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Set side2 to a new lentgh */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}

	/** Set side3 to a new lentgh */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override 
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override 
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}

