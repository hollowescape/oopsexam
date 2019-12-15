
class thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			if(i%2!=0){
				System.out.println("odd number "+i);
			}
		}
	}
}
class thread2 extends Thread{
	int rev,r,n;
	thread2(int n)
	{
		this.n=n;
	}
	public void run()
	{
		while(n!=0)
		{	
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(" reverse of number is "+rev);

	}
}