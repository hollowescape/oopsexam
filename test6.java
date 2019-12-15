public class test6{
	public static void main(String argu[])
	{	double y;
		sin s=new sin(45);
		s.start();
		try{
		s.join();
		}
		catch(Exception e)
		{

		}
		cos c=new cos(45);
		c.start();
		try{
		c.join();
		}
		catch(Exception e)
		{
			
		}
		tan t=new tan(45);
		t.start();
		try{
		t.join();
		}
		catch(Exception e)
		{
			
		}
		y=s.get()+c.get()+t.get();
		System.out.println(" value is "+y);
	}
}