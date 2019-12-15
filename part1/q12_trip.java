package advmath;
public class q12_trip{
	public int a,b,c=0;
	public void calculate()
	{	int m=2;
		while(c<10){
		for(int n=1;n<m;n++)
		{	
			a=m*m-n*n;
			b=2*m*n;
			c=m*m+n*n;

			if(c>10)
			{
				break;
			}
			
			System.out.println(""+a+""+b+""+c);
		}
		m++;
	}
	}
}