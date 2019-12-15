/*
<applet code="q2" width=400 height=400>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends Applet implements ActionListener{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button B1,B2,B3,B4;
	public void init()
	{
	l1=new Label("enter first number");
	add(l1);
	t1=new TextField(20);
	add(t1);
	l2=new Label("enter second number\n");
	add(l2);
	t2=new TextField(20);
	add(t2);
	l3=new Label("the result is ");
	add(l3);
	t3=new TextField(20);
	add(t3);
	 B1= new Button("+");
	add(B1);

	B1.addActionListener(this);
	 B2= new Button("-");
	add(B2);
	B2.addActionListener(this);
	B3= new Button("*");
	add(B3);
	B3.addActionListener(this);
	 B4= new Button("/");
	add(B4);
	B4.addActionListener(this);
    }
	public void actionPerformed(ActionEvent ae)
	{	int c=0;
		String action=ae.getActionCommand();
		String a=t1.getText();
		String b=t2.getText();
		int m=Integer.parseInt(a);
		int n=Integer.parseInt(b);
		if(action.equals("+"))
		{	 c=m+n;
		}
		if(action.equals("-"))
		{
			c=m-n;
		}
		if(action.equals("*"))
		{
			c=m*n;
		}
		if(action.equals("/"))
		{
			c=m/n;
		}
		String p=String.valueOf(c);
		t3.setText(p);
	}
}

