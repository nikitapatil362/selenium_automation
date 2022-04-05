package testConstructor;

import java.util.Scanner;

import test.Rectangle;

public class Rectangle {
	
	double length,breadth ;
	
	void Area()
	{
		double area;
		area = this.length*this.breadth;
		System.out.print("Area of rectangle is: "+area);
	}


	Rectangle(int length, int breadth)
	{
		this length = length;
				
		this breadth = breadth;
	}
	
	//public double calculateArea(double length,double breadth)
	//{
		//return(length*breadth);
	//}
	//public double calculatePerimeter(double lenght,double breadth)
	//{
		//return(2*(length+breadth));
	//}
	

//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rectangle rectangle = new Rectangle();
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter length of rectangle: ");
		//length = sc.nextDouble();
		
		//System.out.println("Enter breadth of rectangle: ");
		//breadth = sc.nextDouble();
		
		//System.out.println("Area of rectangle is; "+ rectangle.calculateArea(length,breadth));
		//System.out.println("Perimeter of rectangle is: "+ rectangle.calculatePerimeter(length,breadth));


	}

}
