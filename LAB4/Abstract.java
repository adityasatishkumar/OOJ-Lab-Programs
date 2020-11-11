import java.util.*;
import java.lang.*;

abstract class Shape{
	
	Scanner in = new Scanner(System.in);
	int x1, x2;
	Shape(){
		
		System.out.println("Enter two numbers:");
		System.out.println("");
		x1=in.nextInt();
		x2=in.nextInt();
		
	}
	abstract void printarea();
	
}

class Rectangle extends Shape{
	
	void printarea(){
		
		System.out.println("Area of Rectangle: " + (x1 * x2));
		
	}
	
}

class Triangle extends Shape{
	
	void printarea(){
		
		System.out.println("Area of Triangle: " + (x1 * x2)/2);
		
	}
	
}

class Circle extends Shape{
	
	void printarea(){
		
		System.out.println("Area of Circle 1: " + (3.14 * x1 * x1));
		System.out.println("Area of Circle 2: " + (3.14 * x2 * x2));
		
	}
	
}

class Abstract{
	
	public static void main(String[]args){
		
		Shape s;
		
		s = new Rectangle();
		s.printarea();
		
		s = new Triangle();
		s.printarea();
		
		s = new Circle();
		s.printarea();
		
	}
	
}