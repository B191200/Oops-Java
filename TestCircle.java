import java.util.Scanner;

class Circle
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea(double radius)
	{
		return 3.141*radius*radius;
	}
	public double getPerimeter(double radius)
	{
		return 2*3.141*radius;
	}
}
	class TestCircle
	{	
	 public static void main(String[] args)
	 {
	 System.out.print("enter the radius of circle:");
	 Scanner input=new Scanner(System.in);
	 double radius=input.nextInt();
	 	Circle c1=new Circle(radius);	 	
	 	System.out.println("Area of circle = "+c1.getArea(radius));
	 	System.out.println("Perimeter of circle = "+c1.getPerimeter(radius));
	 }
	} 

	   
