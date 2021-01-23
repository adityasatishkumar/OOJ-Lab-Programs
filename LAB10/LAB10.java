import java.awt.*;
import java.awt.event.*;

class SampleDialog extends Dialog implements ActionListener {
	LAB10 bld;
  SampleDialog(Frame parent, String title) {

 super(parent, title, false); 
  bld=(LAB10)parent;
 setLayout(new FlowLayout());
 setSize(300, 200);
 add(new Label(bld.msg1));
 Button b;
 add(b = new Button("OK"));
 b.addActionListener(this);
 }
  public void actionPerformed(ActionEvent ae) {
 dispose();
 }
 
}

public class LAB10 extends Frame implements ActionListener
{
	TextField num1,num2,result;
	
	String msg="",msg1="";
	Button divide;
	public LAB10()
	{
		setLayout(new FlowLayout());
		Label nnum1=new Label("Num1: ",Label.RIGHT);
		Label nnum2=new Label("Num2: ",Label.RIGHT);
		Label rresult=new Label("Result: ",Label.RIGHT);
		Button b=new Button("divide");
		
		num1=new TextField(8);
		num2=new TextField(8);
		result=new TextField(8);
		
		
		add(nnum1);
		add(num1);
		add(nnum2);
		add(num2);
		divide=(Button)add(b);
		add(rresult);
		add(result);
		

		num1.addActionListener(this);
		num2.addActionListener(this);
		divide.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		    if(ae.getSource()==divide)
			{
			try  
		            {
			        msg=""+Integer.parseInt(num1.getText())/Integer.parseInt(num2.getText());
					String c=""+msg;
					result.setText(c);
					msg1="";
	                
		            }catch(NumberFormatException e)
		            {
			        msg1="Entered number is not an integer "+e;
			        SampleDialog d = new SampleDialog(this, "Dialog");
					d.setVisible(true);
					
		            }
					catch(ArithmeticException e)
		            {
			         msg1="number 2 is zero "+e;
			         SampleDialog d = new SampleDialog(this, "Dialog");
					d.setVisible(true);
					 
		            }
				}
			}
				
	public static void main(String[] args)
	{
		LAB10 aa=new LAB10();
		aa.setSize(new Dimension(400,400));
		aa.setTitle("AWT Division");
		aa.setVisible(true);
	}
	
}
