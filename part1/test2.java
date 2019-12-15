import java.util.*;
public class test2{
	public static void main(String argu[])
	{
		Scanner o=new Scanner(System.in);
		circle c=new circle("blue",true);
		System.out.println("area calulation");
		c.getarea();
		System.out.println(" enter the color");
		String color=o.next();
		c.setcolor(color);
		System.out.println(c);
		rectangle c1=new rectangle("blue",true);
		System.out.println("area calulation");
		c1.getarea();
		System.out.println(" enter the color");
		String col=o.next();
		c1.setcolor(col);
		System.out.println(c1);
	}
}