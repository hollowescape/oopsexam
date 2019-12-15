import java.util.*;
public class test1{
	public static void main(String argu[])
	{
		Scanner o =new Scanner(System.in);
		twowheeler t=new twowheeler(12,2015);
		t.putdata();
		t.getdata();
		fourwheeler t1=new fourwheeler(12,2015);
		t1.putdata();
		t1.getdata();
		System.out.println(" enter the name of owner");
		String name=o.next();
		mytwowheeler my=new mytwowheeler(13,2018);
		my.set(name);
		my.get();
	}
}