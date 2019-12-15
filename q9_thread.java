class thread extends Thread{
	display t;
	int n;
	thread(display t,int n)
	{
		this.t=t;
		this.n=n;
	}

	public void run()
	{
		t.display(n);
	}
}