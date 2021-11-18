package gui;
import java.awt.*;
import javax.swing.*;

import calc.gui;


class gui1 extends gui{
	
}




public class Main extends JFrame{

	JButton jb1=null,jb2=null,jb3=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main=new Main();
		
	}
	
	public Main() {
		
		jb1=new JButton();
		jb2=new JButton();
		jb3=new JButton();
		
		jb1.setText("傻逼qx");
		jb2.setText("我是你爹");
		
		
		this.add(jb1);
		this.add(jb2);
		
		this.setSize(400,400);
		this.setTitle("我是你爹");
		this.setLocation(300,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
