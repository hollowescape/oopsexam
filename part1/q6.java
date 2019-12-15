class customer{
	int id;
	String name;
	int discount;

	customer(int id,String name,int discount)
	{
		this.id=id;
		this.name=name;
		this.discount=discount;

	}
	int getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}
	int getdiscount()
	{
		return discount;
	}
	void setdiscount(int discount)
	{
		this.discount=discount;
	}
	public String toString()
	{
		return "name of person is "+getname()+"and id is"+getid();
	}
}
class invoice{
	int id;
	customer c;
	double amount;

	invoice(int id,customer c,double amount)
	{
		this.id=id;
		this.c=c;
		this.amount=amount;
	}
	int getid()
	{
		return id;
	}
	customer getcustomer()
	{
		return c;
	}
	void setcustom(customer c)
	{
		this.c=c;
	}
	double getamount()
	{
		return amount;
	}
	void setamount(double amount)
	{
		this.amount=amount;
	}
	String getnamecus()
	{
		return c.name;
	}
	double getamountdis()
	{
		this.amount=this.amount - (double)((c.discount*amount)/100);
		return amount;
	}
}
