import java.util.*;
public class test3{
	public static void main(String argu[])
	{	double g1;
		boolean p;
		Scanner o=new Scanner(System.in);
		grad g=new grad();
		g.set();
		System.out.println(" enter the grade of student (1-100)");
		g1=o.nextDouble();
		p=g.ispassed(g1);
		if(p)
		{
			System.out.println(" student details");
			g.get();
			System.out.println(" student has passed");
		}
		else
		{
		System.out.println(" student details");
			g.get();
			System.out.println(" student has failed");	
		}
	}
}