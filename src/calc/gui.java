package calc;
import java.awt.*;
import javax.swing.*;

public class gui extends JFrame{
	JButton num[]=new JButton[10];
	JButton fc1,fc2,fc3,fc4,fc5,fc6,fc7,fc8,fc9,fc10;
	JTextField jtf1;
	JPanel jp1;
	JTextArea jta1;
	
	public gui() {
		
		for(Integer i=0;i<num.length;i++) {
			num[i]=new JButton(i.toString());
		}
		fc1=new JButton("+");
		fc2=new JButton("-");
		fc3=new JButton("¡Á");
		fc4=new JButton("¡Â");
		fc5=new JButton("=");
		fc6=new JButton("C");
		fc7=new JButton("CE");
		fc8=new JButton("¡û");
		fc9=new JButton(".");
		fc10=new JButton("Æ½·½");
		
		jta1=new JTextArea();
		
		jtf1=new JTextField();
		jp1=new JPanel();
		
		jp1.setLayout(new GridLayout(5,4,2,2));
		jp1.add(fc7);
		jp1.add(fc6);
		jp1.add(fc8);
		jp1.add(fc4);
		jp1.add(num[7]);
		jp1.add(num[8]);
		jp1.add(num[9]);
		jp1.add(fc3);
		jp1.add(num[4]);
		jp1.add(num[5]);
		jp1.add(num[6]);
		jp1.add(fc2);
		jp1.add(num[1]);
		jp1.add(num[2]);
		jp1.add(num[3]);
		jp1.add(fc1);
		jp1.add(fc10);
		jp1.add(num[0]);
		jp1.add(fc9);
		jp1.add(fc5);
		
		this.add(jta1, BorderLayout.CENTER);
		this.add(jp1,BorderLayout.SOUTH);
		
		
		this.setTitle("¼ÆËãÆ÷");
		this.setResizable(false);
		this.setSize(350,450);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
}
