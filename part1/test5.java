public class test5{
	public static void main(String argu[])
	{	float c;
		savingaccount saver1=new savingaccount(2000);
		saver1.setanuali(4);
		 c=saver1.calculate();
		System.out.println("monthly rate of interest is "+c);
		System.out.println(" balance in the account is "+saver1.get());
		saver1.setanuali(5);
		 c=saver1.calculate();
		System.out.println("monthly rate of interest is "+c);
		System.out.println(" balance in the account is "+saver1.get());
		savingaccount saver2=new savingaccount(3000);
		saver2.setanuali(4);
		 c=saver2.calculate();
		System.out.println("monthly rate of interest is "+c);
		System.out.println(" balance in the account is "+saver2.get());
		saver2.setanuali(5);
		 c=saver2.calculate();
		System.out.println("monthly rate of interest is "+c);
		System.out.println(" balance in the account is "+saver2.get());
	}
}