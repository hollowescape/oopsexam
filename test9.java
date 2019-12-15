public class test9{
	public static void main(String argu[])
	{
		display t=new display();
		thread t1=new thread(t,8);
		thread t2=new thread(t,9);
		t1.start();
		t2.start();

	}
}