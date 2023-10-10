import java.util.*;

class Lamp
{
	
	String lampType;
	boolean isOn;
	Lamp(String lampType,boolean isOn)
	{
		this.isOn=isOn;
		this.lampType=lampType;
	}
     String turnOn()
	{
		if(this.isOn==true)
		{
		return "already lamp isOn";
		}
		this.isOn=true;
		return "lamp is on";
	}
     String turnOff()
	{
		this.isOn=false;
		return "isOff";
	}
}
		
	class TestLamp
	{
		public static void main(String[] args)
		{
           
		 Lamp l1= new Lamp("led",true);
		 System.out.println("status = "+l1.turnOn());
		 System.out.println("status = "+l1.turnOff());
		 Lamp l2=new Lamp("halogn",false);
		 System.out.println("status = "+l2.turnOn());
		 System.out.println("status = "+l2.turnOff());
		}
	}
		 
		 
			
		
