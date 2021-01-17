import java.awt.event.*;
import java.awt.*;

public class ColorDemo extends Frame{
	public ColorDemo(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		Color c1 = new Color(255, 100, 100);
		Color c2 = new Color(100, 255, 100);
		Color c3 = new Color(100, 100, 255);
		
		g.setColor(c1);
		g.drawLine(20, 40, 100, 100);
		g.drawLine(20, 100, 100, 20);
		
		g.setColor(c2);
		g.fillRect(20, 160, 100, 40);
		g.drawLine(20, 200, 100, 20);
		
		g.setColor(c3);
		g.drawLine(20, 240, 100, 100);
		g.drawLine(20, 290, 100, 500);
		g.drawRect(20, 350, 100, 40);
		
		g.setColor(Color.cyan);
		g.drawOval(100, 40, 50, 50);
		g.fillOval(170, 90, 140, 100);
	}
	
	public static void main(String[]args){
		ColorDemo appwin = new ColorDemo();
		
		appwin.setSize(new Dimension(340, 260));
		appwin.setTitle("ColorDemo");
		appwin.setVisible(true);
	}
}
	
