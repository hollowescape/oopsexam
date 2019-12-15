import advmath.q12_sin;
import advmath.q12_cos;
import advmath.q12_tan;
import advmath.q12_trip;
public class test12{
	public static void main(String argu[])
	{
		double y;
		q12_sin s=new q12_sin();
		q12_cos c=new q12_cos();
		q12_tan t=new q12_tan();
		y=s.getvalue(45)+c.getvalue(45)+t.getvalue(45);
		System.out.println("the value of operation is"+y);
		q12_trip te=new q12_trip();
		te.calculate();

	}
}