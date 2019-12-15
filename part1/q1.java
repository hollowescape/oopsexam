import java.util.*;
abstract class q1{
	public int hashemet;
	public int yom;
	public  q1(int hashemet,int yom)
	{
		this.hashemet=hashemet;
		this.yom=yom;
	}
	abstract void getdata();
	abstract void putdata();

};

class twowheeler extends q1{
	
	private String brand;
	protected int cost;
	int et;
	public String color;
	Scanner o=new Scanner(System.in);
	public twowheeler(int hashemet,int yom)
	{
		super(hashemet,yom);
	}
	void getdata()
	{
		System.out.println(" the brand of twowheeler is "+brand);
		System.out.println(" the cost of twowheeler is "+cost);
		System.out.println(" the engine type of 2 wheeler is"+et);
		System.out.println(" the color of two wheeler is"+color);

	}
	void putdata()
	{	
		System.out.println(" enter the brand of twowheeler  ");
		brand=o.next();
		System.out.println(" enter the cost of twowheeler  ");
		cost=o.nextInt();
		System.out.println(" enter the engine type of 2 wheeler(2-4) is");
		et=o.nextInt();
		System.out.println(" enter the color of two wheeler ");
		color=o.next();

		this.brand=brand;
		this.cost=cost;
		this.et=et;
		this.color=color;
	}
}
class mytwowheeler extends twowheeler{
	String name;
	protected int cost;
	int et;
	public String color;
	Scanner o=new Scanner(System.in);
	mytwowheeler(int hashemet,int yom)
	{
		super(hashemet,yom);
		name="abc";
		cost=super.cost;
		et=super.et;
		color=super.color;
	}
	void set(String name)
	{
		this.name=name;
		putdata();
	}
	void get()
	{
		System.out.println(" the name of owner is "+name);
		getdata();
	}
}
 final class fourwheeler extends q1{
	private String brand;
	protected int cost;
	int et;
	public String color;
	Scanner o=new Scanner(System.in);
	public fourwheeler(int hashemet,int yom)
	{
		super(hashemet,yom);
	}

	void getdata()
	{
      System.out.println(" the brand of twowheeler is "+brand);
		System.out.println(" the cost of twowheeler is "+cost);
		System.out.println(" the engine type of 2 wheeler is"+et);
		System.out.println(" the color of two wheeler is"+color);

	}
	void putdata()
	{	
		System.out.println(" enter the brand of fourwheeler  ");
		brand=o.next();
		System.out.println(" enter the cost of fourwheeler  ");
		cost=o.nextInt();
		System.out.println(" enter the engine type of 4 wheeler(2-4) is");
		et=o.nextInt();
		System.out.println(" enter the color of four wheeler ");
		color=o.next();

		this.brand=brand;
		this.cost=cost;
		this.et=et;
		this.color=color;
	}

}