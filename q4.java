/*
<applet code="q4" width=200 height=200>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class q4 extends Applet implements MouseListener{
	String message;
	int mx=0;
	int my=0;
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		mx=me.getX();
		mx=me.getY();
		message="WELCOME";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{

	}
	public void mouseExited(MouseEvent me)
	{

	}
	public void mousePressed(MouseEvent me)
	{

	}
	public void mouseReleased(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		message="GOOD BYE";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(message,mx,my);
	}
}