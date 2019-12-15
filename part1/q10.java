class faculty{
	String name;
	private int basic;
	faculty(String name,int basic)
	{
		this.name=name;
		this.basic=basic;
	}
	void getdetails()
	{
		System.out.println(" name of faculty is"+name+" and basic pay is"+basic);

	}
	double getsalary()
	{
		return basic;
	}
}
class assisprof extends faculty{
	int da;
	assisprof(int da,String name,int basic)
	{
		super(name,basic);
		this.da=da;
	}
	double getsalary()
	{
		double sal=super.getsalary();
		sal=sal+(double)((sal*da)/100);
		return sal;
	}
	void getdetails()
	{
		System.out.println("name of assisprof is  "+name+" and salary is "+getsalary());
	}
}
class assocaprof extends assisprof{
	int medal;
	assocaprof(int medal,int da,String name,int basic)
	{
		super(da,name,basic);
		this.medal=medal;
	}
	double getsalary()
	{
		double sal=super.getsalary();
		sal=sal+ medal;
		return sal;	
	}
	void getdetails()
	{
		System.out.println("name of assocatiateprof is "+name+"and salary is "+getsalary());
	}
}
class prof extends assocaprof{
	int otheral;
	prof(int otheral,int medal,int da,String name,int basic)
	{
		super(medal,da,name,basic);
		this.otheral=otheral;
	}
	double getsalary()
	{
		double sal=super.getsalary();
		sal=sal+ ((otheral*sal)/100);
		return sal;	
	}
	void getdetails()
	{
		System.out.println("name of prof is "+name+"and salary is "+getsalary());
	}
}
