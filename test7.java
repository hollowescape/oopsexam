import java.util.*;
import java.lang.Math;
public class test7{
	static void check(int a,int b,int c) throws validatetriangle{
		if((a<b+c)&&(b<c+a)&&(c<a+b))
		{	float d;
			double s,ar;
			s=((a+b+c)/2.0);
			d=(float)(s*(s-a)*(s-b)*(s-c));
			ar=Math.sqrt(d);
			System.out.println(" valid triangle");
			System.out.println(" area of triangle is "+ar);
		}
		else
		{
			throw new validatetriangle();
		}

	}
	public static void main(String argu[])
	{	int a,b,c;
		Scanner o=new Scanner(System.in);
		try{
			System.out.println(" enter the sides of triangle");
			a=o.nextInt();
			b=o.nextInt();
			c=o.nextInt();
			check(a,b,c);
		}
		catch(validatetriangle v)
		{
			System.out.println(v);
		}

	}
}