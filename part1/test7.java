import java.util.*;
public class test7{
	public static void main(String argu[])
	{	
		String co;
		int e=1,f=1;
		boolean t;
		Scanner o=new Scanner(System.in);
		String[] course=new String[30];
	    int[] grade=new int[30];
		student s=new student("mayan","msr nagar bangalore");
		s.acg(course,grade);
		System.out.println(" student courses are");
		s.printcourse();
		System.out.println(" average grade is"+s.avggrade());
		System.out.println(s);
		teacher t1=new teacher("abc ","bdjabidba");
		while(e==1)
		{
		System.out.println(" enter the course to be added");
		co=o.next();
		t=t1.addcourse(co);

		if(t)
		{
			System.out.println(" courses added successfully");
		}
		else
		{
			System.out.println(" cousrse already exists");
			e=0;
		}
		}
		while(f==1)
		{
		System.out.println(" enter the course name to deleted");
		co=o.next();
		t=t1.removecourse(co);
		if(t)
		{
			System.out.println(" courses removed successfully");
		}
		else
		{
			System.out.println(" cousrse do not exists");
			f=0;
		}
		}
		System.out.println(" course taken by teacher is");
		t1.cousers();
		System.out.println(t1);
	}
}