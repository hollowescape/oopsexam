package student;
import java.util.*;
public class q11_stud{
	public String usn;
	public String[] departnames=new String[3];
	public int[] grades=new int[3];
	public float sgpa;
	Scanner o=new Scanner(System.in);
	public void put()
	{
		System.out.println(" enter the usn");
		usn=o.next();
		System.out.println(" enter the three departnames");
		for(int i=0;i<3;i++)
		{
			departnames[i]=o.next();
		}
		System.out.println(" enter the three subject grades");
		for(int i=0;i<3;i++)
		{
			grades[i]=o.nextInt();
		}
		System.out.println(" enter the sgpa");
		sgpa=o.nextFloat();
	}
	public void get()
	{
		System.out.println(" usn of student is "+usn);
		System.out.println(" name of departments are");
		for(int i=0;i<3;i++)
		{
			System.out.println(""+departnames[i]);
		}
		System.out.println("grade of students are");
		for(int i=0;i<3;i++)
		{
			System.out.println(""+grades[i]);
		}
		System.out.println(" sgpa of student is"+sgpa);

	}
}