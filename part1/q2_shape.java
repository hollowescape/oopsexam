import java.util.*;
abstract class q2_shape{

	public String color;
	boolean filled;
	public q2_shape()
	{
		color="green";
		filled=true;
	}
	public q2_shape(String color, boolean e)
	{
		this.color=color;
		this.filled=e;
	}
	public String  getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public String XXX()
	{
		if(filled)
		{
			return " is filled";
		}

		else
		{
			return " is not filled";
		}
	}
	public  void setfill(boolean x)
	{
		this.filled=x;
	}
	public String toString()
	{
		return "A shape with color "+getcolor()+""+XXX();
	}
	abstract void getarea();
}
class circle extends q2_shape{
	int r;
	float a;
	Scanner o=new Scanner(System.in);
	circle(String color,boolean f)
	{
		super(color,f);
	}

	void getarea()
	{
		System.out.println(" enter the raidus of circle");
		r=o.nextInt();
		a=(float)3.14*r*r;
		System.out.println(" area of cirlce is "+a);

	}


}
final class rectangle extends q2_shape{
	public int l,b;
	float a;
	Scanner o=new Scanner(System.in);
	rectangle(String color,boolean f)
	{
		super(color,f);
	}

	void getarea()
	{
		System.out.println(" enter the length and breadth of rectangle");
		l=o.nextInt();
		b=o.nextInt();
		a=(float)l*b;
		System.out.println(" area of rectangle is "+a);

	}

}
/*class square extends rectangle{
	square(String color,boolean f)
	{
		super(color,f);
	}
}*/