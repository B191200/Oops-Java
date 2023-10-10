import java.util.*;

class Tv
{
	int Channel;
	int Volume;
	boolean on;
	Tv()
	{
		this.Channel=0;
		this.Volume=0;
		this.on=false;
	}
	void turnOn()
	{
		this.on=true;
	}
	void turnOff()
	{
		this.on=false;
	}
	void setChannel(int newChannel)
	{
		if(newChannel>=40)
		this.Channel=40;
		this.Channel=newChannel;
	}
	void setVolume(int newVolume)
	{
		if(newVolume>=7)
		this.Volume=7;
		this.Volume=newVolume;
	}
	void channelUp()
	{
	if(this.Channel>=40)
	this.Channel=1;
		this.Channel+=1;
	}
	void channelDown()
	{
	if(this.Channel<=1)
	     this.Channel=40;
		this.Channel-=1;
	}
	void volumeUp()
	{
		this.Volume+=1;
	}
	void volumeDown()
	{
		this.Volume-=1;
	}
	void getStatus()
	{
		System.out.println("channel no:"+this.Channel);
		System.out.println("volume no:"+this.Volume);
		if(this.on==true)
		System.out.println("TV is On");
		else
		System.out.println("TV is Off");
		}
}

   class TestTv
   {
   	public static void main(String[] args)
   	{
   	Tv t1=new Tv();
   	t1.turnOn();
   	//t1.turnOff();
   	t1.channelUp();
   	t1.channelDown();
   	t1.setChannel(6);
   	t1.setVolume(3);
   	t1.volumeUp();
   	t1.volumeDown();
   	t1.getStatus();
   	
     }
   }
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
