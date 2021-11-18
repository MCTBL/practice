package parctice.test;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public  class test extends JFrame {
  static JTextField jt=new JTextField(10);
  static JLabel jl=new JLabel();
  static JButton jb=new JButton("确定");
  public static void main(String[] args) {
	  test a=new test();
	  a.setTitle("bbb");
	  a.setBounds(100,100,500,500);
	  a.setLayout(new BorderLayout());
	  a.add(BorderLayout.NORTH,jt);
	  a.add(BorderLayout.SOUTH,jb);
	  a.add(BorderLayout.CENTER,jl);  
	  myActionListener A=new myActionListener (); 
	  A.set(jt, jl, jb);
	  jt.addActionListener( A);
	  jb.addActionListener( A);
	  a.setVisible(true);
  }
}
  class myActionListener implements ActionListener{
    JTextField jt;
    JLabel jl;
     JButton jb;
     void set(JTextField jt,JLabel jl,JButton jb) {
      this.jt=jt;this.jb=jb;this.jl=jl;
     }     
     public void actionPerformed(ActionEvent e) {
    	 String str=jt.getText();
    	 int len=str.length();
    	 String s=null;
    	 if(len==-0)s="长度为0，请重新输入";
    	 else s=str.format("%s,它的长度为：%d",str,len);
    	 jl.setText(s);
     }
   }