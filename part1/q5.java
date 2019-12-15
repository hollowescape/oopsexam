class savingaccount{
	static int anuali;
	private int balance;
	static int modifyannuli;
	savingaccount(int balance)
	{
		this.balance=balance;
	}
	void setanuali(int inter)
	{
		this.anuali=inter;
	}
	float calculate ()
	{
		float mi=((balance*anuali)/12);
		this.balance=this.balance+(int)mi;
		return mi;
	}
	public int get()
	{
		return balance;
	}

}