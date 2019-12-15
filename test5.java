import java.util.*;
public class test5{
		static void checkname(String name) throws name
		{
			for(char c:name.toCharArray()){
			if(Character.isDigit(c))
			{
				throw new name();
			}
			}
			System.out.println(" name is correct");
		}
		static void checkage(int age) throws age
		{
				if(age>50)
				{
					throw new age();
				}
				else
				{
					System.out.println(" you are elgible to work");
				}			
		}
	public static void main(String argu[])
	{	Scanner o=new Scanner(System.in);
		try{
			System.out.println(" enter the name ");
			String name=o.next();
			checkname(name);		
		}
		catch(name e)
		{
			System.out.println(e);
		}
		try
		{
			System.out.println(" enter the age ");
			int age=o.nextInt();
			checkage(age);
		}
		catch(age a)
		{
			System.out.println(a);
		}

	}
}
