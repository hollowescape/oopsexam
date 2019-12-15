import java.util.*;
class sin extends Thread{
	double deg,rad,val;
	sin(double deg)
	{
		this.deg=deg;
	}
	public void run()
	{
		rad=Math.toRadians(deg);
		val=Math.sin(rad);
	}
	public double get()
	{
		return val;
	}
}
class cos extends Thread{
	double deg,rad,val;
	cos(double deg)
	{
		this.deg=deg;
	}
	public void run()
	{
		rad=Math.toRadians(deg);
		val=Math.cos(rad);
	}
	public double get()
	{
		return val;
	}
}
class tan extends Thread{
	double deg,rad,val;
	tan(double deg)
	{
		this.deg=deg;
	}
	public void run()
	{
		rad=Math.toRadians(deg);
		val=Math.tan(rad);
	}
	public double get()
	{
		return val;
	}
}