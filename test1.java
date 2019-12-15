import java.util.*;
public class test1{
	 public static void main(String[] args) {
	 	Scanner o=new Scanner(System.in);
		thread1 t1=new thread1();
		System.out.println("enter the number to find reverse");
		int n=o.nextInt();
		thread2 t2=new thread2(n);
		t1.start();
		t2.start();

	}
}