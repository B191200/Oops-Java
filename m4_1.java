abstract class shape
{
abstract	void getArea();
abstract void getPerimeter();
}
class circle extends shape
{
	double radius;

	circle(double radius)
	{
		this.radius=radius;
	}
		void getArea()
		{
			System.out.println("Area of circle = "+3.141*radius*radius);
		}
		void getPerimeter()
		{
			System.out.println("Perimeter of circle = "+2*3.141*radius);
		}
}
class square extends shape
{
	double side;
	
	square(double side)
	{
		this.side=side;
	}
		void getArea()
		{
			System.out.println("Area of square = "+side*side);
		}
		void getPerimeter()
		{
			System.out.println("Perimeter of square = "+4*side);
		}
}
class rectangle extends shape
{
	double length,breadth;
	
	rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void getArea()
	{
		System.out.println("Area of rectangle = "+length*breadth);
	}
	void getPerimeter()
	{
		System.out.println("Area of rectangle = "+2*(length+breadth));
	}
}
class m4_1
{
	public static void main(String args[])
	{
		circle c=new circle(5.5);
		square s=new square(8.5);
		rectangle r=new rectangle(2.8,9.5);
		c.getArea();
		c.getPerimeter();
		s.getArea();
		s.getPerimeter();
		r.getArea();
		r.getPerimeter();
	}
}

			

	   
