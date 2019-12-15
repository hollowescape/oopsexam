 class car{
	public int speed;
	double rprice;
	String color;
	public car(int speed,double rprice,String color)
	{
		this.speed=speed;
		this.rprice=rprice;
		this.color=color;
	}

	 double getsaleprice()
	{
		return 0;
	}

}
class truck extends car{
	int weight;
	truck(int w,int speed,double rprice,String color)
	{
		super(speed,rprice,color);
		this.weight=w;
		

	}
	double getsaleprice()
	{
		if(weight>2000)
		{
			this.rprice=this.rprice-(0.1*rprice);
			return rprice;
		}
		else
		{
			this.rprice=this.rprice -(0.2*rprice);
			return rprice;
		}

	}
}
class ford extends car{
	int year;
	int manufd;

	ford(int year,int man,int speed,double rprice,String color)
	{
		super(speed,rprice,color);
		this.year=year;
		this.manufd=man;
		

	}
	void setman(int manufd)
	{
		this.manufd=manufd;
	}
	double getsaleprice()
	{
		this.rprice=this.rprice -((manufd*rprice)/100);
		return rprice;
	}
}
class sedan extends car{
	int length;
	sedan(int l,int speed,double rprice,String color)
	{
		super(speed,rprice,color);
		this.length=l;
		

	}
	double getsaleprice()
	{
		if(length>20)
		{
			this.rprice=this.rprice-(0.5*rprice);
			return rprice;
		}
		else
		{
			this.rprice=this.rprice-(0.1*rprice);
			return rprice;
		}
	}
}
