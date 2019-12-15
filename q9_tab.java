class display{
	synchronized public void display(int num)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				System.out.println(""+num+"*"+i+"="+num*i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{

			} 
		}
	}
}