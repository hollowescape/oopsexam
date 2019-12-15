import java.util.*;
public class q8{
	public static void main(String argu[])
	{
		Scanner o=new Scanner(System.in);
		String wd;
		System.out.println("enter the word");
		wd=o.next();
		for(char c:wd.toCharArray())
		{
			if(Character.isUpperCase(c))
		{
		wd=wd.toLowerCase();
		System.out.println(" word is "+wd);
		wd=wd.replace('a','b');
		wd=wd.replace('e','f');
		wd=wd.replace('i','j');
		wd=wd.replace('o','p');
		wd=wd.replace('u','v');
		System.out.println(" word is "+wd);
	}
	}
}
}