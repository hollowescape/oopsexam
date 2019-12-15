import java.util.*;
public class test9{
	public static void main(String argu[])
	{	boolean t;
		int y;
		Scanner o=new Scanner(System.in);
		System.out.println(" enter the choice");
		System.out.println(" 1. bus ticket \n 2. train ticket");
		int c=o.nextInt();
		if(c==1)
		{
			reservebus r=new reservebus(200);
			System.out.println(" enter the number of seats to reserve");
			int nc= o.nextInt();
			t=r.reserve(nc,56);
			if(t)
			{
				System.out.println(" seats booked");
			}
			else
			{
				System.out.println("seats are not avilable");
			}
			y=r.getstatus();
			System.out.println("seats remaining are"+y);
		}
		else if(c==2)
		{
			reservetrain tr=new reservetrain(200,200,200);
			System.out.println(" enter the type of seat");
			System.out.println("1. upper\n 2.lower\n 3. middle");
			int ch=o.nextInt();
			System.out.println(" enter the number of seat");
			int nu=o.nextInt();
			t=tr.reserve(nu,ch);
			if(t)
			{
				System.out.println(" seats booked");
			}
			else
			{
				System.out.println("seats are not avilable");
			}
		}
	}
}