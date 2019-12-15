public class q12{
	 public static void main(String[] args) {
		Thread t1=new Thread();
		Thread t3=new Thread();
		Thread t2=new Thread();
		Thread t4=new Thread();
		Thread t5=new Thread();
		t1.setName("t1");
		t1.setPriority(9);
		t2.setName("t2");
		t2.setPriority(8);
		t3.setName("t3");
		t3.setPriority(7);
		t4.setName("t4");
		t4.setPriority(6);
		t5.setName("t5");
		t5.setPriority(5);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		try{
			t1.sleep(1000);
			t2.sleep(1000);
		}
		catch(Exception e)
		{

		}	
		try{
			System.out.println("alive staus of t1"+t1.isAlive());
			System.out.println("alive staus of t2"+t2.isAlive());
			System.out.println("alive staus of t3"+t3.isAlive());
			System.out.println("alive staus of t4"+t4.isAlive());
			System.out.println("alive staus of t5"+t5.isAlive());
		}
		catch(Exception e)
		{

		}
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();	

	}
}