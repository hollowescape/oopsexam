import java.util.*;
interface add{
	int addition(int a,int b);
}
interface mul{
	int multiply(int a,int b);
}
public class q10{
	public static void main(String argu[])
	{	int x,y;
		Scanner o=new Scanner(System.in);
		add adm=(int a,int b)->(a+b);
		mul mk=(int a,int b)->(a*b);
		System.out.println(" enter the two numbers");
		x=o.nextInt();
		y=o.nextInt();
		System.out.println(" number adittion is "+adm.addition(x,y));
		System.out.println(" number multiplication is "+mk.multiply(x,y));
	}
}