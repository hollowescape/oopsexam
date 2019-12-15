import java.util.*;
 abstract class student{
	private String name;
	protected int id;
	Double grade;
	public int age;
	public void setname(String name)
	{
		this.name=name;
	}
	public void get()
	{
		System.out.println(" name of studen is"+name);
		System.out.println(" id of student is"+id);
		System.out.println(" age of student is "+age);
	}

	abstract boolean ispassed(Double grade);
}
class ungrad extends student{
	Scanner o=new Scanner(System.in);
	boolean ispassed(Double grade)
	{
		if(grade>70)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void set()
	{
		System.out.println(" enter the name of student");
		String name=o.next();
			setname(name);
		System.out.println(" enter the id of student");
		super.id=o.nextInt();
		System.out.println(" enter the age of student");
		super.age=o.nextInt();
	}

}
class grad extends student{
	Scanner o=new Scanner(System.in);
	boolean ispassed(Double grade)
	{
		if(grade>80)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void set()
	{
		System.out.println(" enter the name of student");
		String name=o.next();
		setname(name);
		System.out.println(" enter the id of student");
		super.id=o.nextInt();
		System.out.println(" enter the age of student");
		super.age=o.nextInt();
	}
}