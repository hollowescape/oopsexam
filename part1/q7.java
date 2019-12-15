import java.util.*;
class person{
	String name;
	String address;

	person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	String getname()         //under cpnbkb
	{
		return name;
	}
	String getaddhress()
	{
		return address;
	}
	void setaddhress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "name of person is "+getname()+"and address is "+getaddhress();
	}
}
class student extends person{
	public int nc;
	double avg,sum=0;
	public String[] course=new String[30];
	public int[] grade=new int[30];
	Scanner o=new Scanner(System.in);
	student(String name,String address)
	{
		super(name,address);
	}
	void acg(String courses[],int grades[])
	{
		System.out.println(" enter the number of courses");
		nc=o.nextInt();
		for(int i=0;i<nc;i++){
		System.out.println(" enter the course and grade");
		course[i]=o.next();
		grade[i]=o.nextInt();
	}

	}
	void printcourse()
	{
		for(int i=0;i<nc;i++)
		{
			System.out.println(" courses taken are "+course[i]);
		}
	}
	void printgrade()
	{
		for(int i=0;i<nc;i++)
		{
			System.out.println(" \ngrades are"+grade[i]);
		}
	}
	double avggrade()
	{
		for(int i=0;i<nc;i++)
		{
			sum=sum+grade[i];
		}
		avg=(sum)/nc;
		return avg;
	}
	public String toString()
	{
		return "name of student is "+getname()+"and address is "+getaddhress();
	}

}
class teacher extends person{
	 static int i=0;
	String[] cou=new String[30];
	Scanner o=new Scanner(System.in);
	teacher(String name,String address)
	{
		super(name,address);	
	}
	
	boolean addcourse(String co)
	{		
		for(int j=0;j<=i;j++)
		{	System.out.println(""+i);
			if(co.equals(cou[j]))
			{	System.out.println(""+j);
				return false;

			}
		}
		cou[i]=co;
		System.out.println(""+cou[i]);
		i++;
	
		return true;
	}
		
	boolean removecourse(String co)
	{
		for(int i=0;i<5;i++)
		{
			if(co.equals(cou[i]))
			{
				cou[i]="";
				cou[i]=cou[i]+cou[i+1];
				cou[i+1]="";
				return true;
			}
		}
		return false;
	}
	void cousers()
	{	for(int j=0;j<i;j++)
		{
			if(cou[j].equals(""))
			continue;
		System.out.println(" course taken are "+cou[j]);
		}
	}
	public String toString()
	{
		return "name of teacher  is "+getname()+"and address is "+getaddhress();
	}
}