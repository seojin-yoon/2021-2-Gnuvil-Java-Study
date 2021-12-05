    import java.util.*;
import java.text.*;


class Main{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String color = input.next();
		boolean filled = input.nextBoolean(); 
		
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		DecimalFormat format = new DecimalFormat("#.###");
		double data = triangle.getArea();
		double data2 = Math.floor(data*1000)/1000;
		String ret = format.format(data2);
		
		System.out.println("Triangle: side = " + triangle.getSide1() + " side2 = " + triangle.getSide2() + " side3 = " + triangle.getSide3() );
		System.out.println("area of Triangle: " + ret );
		System.out.println("perimeter of Triangle: " + triangle.getPerimeter() );
		System.out.println("color of Triangle: " + triangle.getColor() );
		System.out.println("is Filled that Triangle: " + triangle.isFilled() );
	}
}


abstract class GeometricObject {
	private String color = " white ";
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
	
	public String toString() {
		return "Created on " + dateCreated + "\n color: " + color + " and filled ";
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}


class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = 1 / 4.0 * Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3) * (side1 + side3 - side2) * (side2 + side3 - side1)) ;
		return s;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	
	public String toString() {
		return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3;
	}
}



    
