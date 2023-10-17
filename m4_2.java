
 class person
{
	public String name;
	public String address;
	
	public person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return name + "(" + address + ")";
	}
	
}
 class Student extends person
{
	public int count;
	public String[] courses;
	public int[] grades;
	public static final int MAX_COURSES = 30; 
	
	public Student(String name, String address) 
	{
	super(name, address);
	count = 0;
	courses = new String[MAX_COURSES];
	grades = new int[MAX_COURSES];
	}
	
	public String toString() 
	{
	return "Student: " + super.toString();
	}
	
	public void addCourseGrade(String course,int grade)
	{
		
	courses[count]=course;
	grades[count]=grade;
	count++;
	}
	public void printGrades()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	
	public int getAverage()
	{
	int s=0;
		for(int i=0;i<count;i++)
		{
			s+=grades[i];
		}
	return s/count;
	}
}

 class Teacher extends person
{
	public int count1;
	public String[] courses;
	public static final int MAXCOURSES = 5; 
	
	public Teacher(String name, String address) 
	{
	super(name, address);
	count1 = 0;
	courses = new String[MAXCOURSES];
	}
	public String toString() 
	{
	return "Teacher: " + super.toString();
	}
	
	public boolean addCourse(String course)
	{
		for(int i=0;i<count1;i++)
		{
			if(courses[i].equals(course))
			   return false;
		}
			
			courses[count1]=course;
			count1++;	
			return true;	
	}
	public boolean removeCourse(String course) 
	{
		int index=count1;
		for (int i=0;i<count1;i++) 
		{
			if (courses[i].equals(course)) 
			{
				index = i;
				break;
			}
		}
		if (index == count1)
		{
			return false;
		} 
		else 
		{
			for (int i=index;i<count1-1;i++) 
			{
				courses[i] = courses[i+1];
			}
				count1--;
				return true;
		}
	}
}

class m4_2
{
	public static void main(String args[])
	{
		Student s = new Student("Pavan","Canada");
		s.addCourseGrade("OOPS",95);
		s.addCourseGrade("FLAT",98);
		s.addCourseGrade("OS",99);
		s.printGrades();
		System.out.println("Average is " + s.getAverage());
		Teacher t1 = new Teacher("Sujoy", "USA");
	     System.out.println(t1);
	     String[] courses = {"FLAT", "OOPS", "OS","DSA","DAA"};
	     for (String course: courses) 
	     {
	     	 if (t1.addCourse(course)) 
	    		 {
	        		System.out.println(course + " added.");
	     	 } 
	    		else 
	   		 {
				System.out.println(course + " cannot be added.");
	   		 }
		}
		for (String course: courses) 
		{
			if (t1.removeCourse(course)) 
			{
				System.out.println(course + " removed.");
			} 
		    else
			{
				System.out.println(course + " cannot be removed.");
			}
		}
	}
}
		
		

































