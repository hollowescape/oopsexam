import java.util.*;
class record{
	int nor;
	String[] name=new String[30];
	int[] rank=new int[30];
	Scanner o=new Scanner(System.in);
	record(int nor)
	{
		this.nor=nor;
	}
	void read()
	{
		System.out.println(" enter the details");
		for(int i=0;i<nor;i++)
		{
			System.out.println(" enter the name and rank ");
			name[i]=o.next();
			rank[i]=o.nextInt();
		}
	}
	void display()
	{
		System.out.println(" record details are");
		for(int i=0;i<nor;i++)
		{
			System.out.println(" name is "+name[i]+" and rank is "+rank[i]);
		}
	}
	
}
class Rank extends record{
	int index;
	int max=0;
	Rank(int nor)
	{
		super(nor);
		index=0;
	}
	void highest()
	{	read();
		max=rank[0];
		for(int i=1;i<nor;i++)
		{
			if(rank[i]>=max)
			{
				index=i;
			}
		}
		
	}
	public String toString()
	{
		return " name is "+name[index]+" and rank is"+rank[index];
	}

}