import java.util.*;
public class test6{
	public static void main(String argu [])
	{
		Scanner o=new Scanner(System.in);
		customer c=new customer(1,"man",5);
		System.out.println(c);
		System.out.println(" enter the discount");
		int d=o.nextInt();
		c.setdiscount(d);
		invoice i=new invoice(1,c,3000);
		String name=i.getnamecus();
		System.out.println(" name of customer is "+name);
		System.out.println(" total amount after  discount");
		double ed=i.getamountdis();
		System.out.println(""+ed);
	}
}