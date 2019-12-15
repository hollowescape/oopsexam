public class test4{
	public static void main(String argu [])
	{
		sedan s=new sedan(15,220,200000,"red");
		ford f1= new ford(2000,20,230,300000,"black");
		ford f2=new ford(2002,10,250,400000,"green");
		car c=new car(250,500000,"pink");
		double d;
		d=s.getsaleprice();
		System.out.println(" sale price of sedan is "+d);
		d=f1.getsaleprice();
		System.out.println(" sale price of ford is "+d);
		d=f2.getsaleprice();
		System.out.println(" sale price of ford is "+d);
		d=s.getsaleprice();
		System.out.println(" sale price of sedan is "+d);
	}
}