import java.util.*;
public class q11{
	public static void main(String argu[])
	{
		char[] ch=new char[30];
		Scanner o=new Scanner(System.in);
		String str;
		System.out.println(" enter the string");
		str=o.next();
		str=str.toUpperCase();
		System.out.println(" string in uppercase is "+str);
		int count=0;
		int i=0;
		for(char c:str.toCharArray())
		{	
			ch[i]=c;
			i++;
		}
		for(int j=0;ch[j]!='\0';j++)
		{
			if(ch[j]==ch[j+1])
			{
				++count;
			}
		}
		System.out.println(" number of such "+count);
		
	}
}