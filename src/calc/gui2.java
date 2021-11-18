package calc;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class gui2 extends JFrame implements ActionListener{

	JPanel jp1;
	JTextField jtf1,jtf2;
	JComboBox<String> jcb1;
	JTextArea jta1;
	JScrollPane jsp1;
	JButton jb1;
	
	gui2(){
		jb1=new JButton("=");
		jtf1=new JTextField(10);
		jtf2=new JTextField(10);
		jcb1=new JComboBox<String>();
		jcb1.addItem("+");
		jcb1.addItem("-");
		jcb1.addItem("*");
		jcb1.addItem("/");
		jsp1=new JScrollPane();
		jta1=new JTextArea();
		
		jp1=new JPanel();
		
		jp1.setLayout(new FlowLayout());
		jp1.add(jtf1);
		jp1.add(jcb1);
		jp1.add(jtf2);
		jp1.add(jb1);
		
//		jsp1.add(jta1);
		jta1.add(jsp1);
		
		jb1.addActionListener(this);
		
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jta1,BorderLayout.CENTER);
		
		this.setTitle("º∆À„∆˜");
		this.setVisible(true);
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		try {
			Double x=Double.valueOf(jtf1.getText());
			Double y=Double.valueOf(jtf2.getText());
			if(jcb1.getSelectedIndex()==0) {
				jta1.append(x+"+"+y+"="+(x+y)+"\n");
			}else if(jcb1.getSelectedIndex()==1) {
				jta1.append(x+"-"+y+"="+(x-y)+"\n");
			}else if(jcb1.getSelectedIndex()==2) {
				jta1.append(x+"*"+y+"="+(x*y)+"\n");
			}else {
				jta1.append(x+"/"+y+"="+(x/y)+"\n");
			}
		}catch(Exception a) {
			jta1.append("«Î ‰»Î ˝◊÷\n");
		}
	}
}