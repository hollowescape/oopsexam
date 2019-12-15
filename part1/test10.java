public class test10{
	public static void main(String argu[])
	{
		double sal;
		assisprof as =new assisprof(4,"simran",10000);
		sal=as.getsalary();
		as.getdetails();
		assocaprof ao =new assocaprof(5000,10,"simran",10000);
		sal=ao.getsalary();
		ao.getdetails();
		prof p =new prof(6,5000,10,"simran",10000);
		sal=p.getsalary();
		p.getdetails();
	}
}
