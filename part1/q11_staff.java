package staff;
import java.util.*;
public class q11_staff{
	public String staffid;
	public String staffnames;
	public String[] subjects=new String[3];
	public String desi;
	Scanner o=new Scanner(System.in);
	public void put()
	{
		System.out.println(" enter the Staffid");
		staffid=o.next();
		System.out.println(" enter the name of staff");
		staffnames=o.next();
		System.out.println(" enter the name  of subject ");
		for(int i=0;i<3;i++)
		{
			subjects[i]=o.next();
		}
		System.out.println(" enter the designation");
		desi=o.next();
	}
	public void get()
	{
		System.out.println(" staffid of teacher is "+staffid);
		System.out.println(" name of staff is"+staffnames);
		System.out.println("Subjects habndled by staff are");
		for(int i=0;i<3;i++)
		{
			System.out.println(""+subjects[i]);
		}
		System.out.println(" designation of staff is"+desi);

	}
}