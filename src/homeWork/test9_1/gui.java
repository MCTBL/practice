package homeWork.test9_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class gui extends JFrame{
	JTextField jtf1;
	JButton jb1;
	JLabel jl1,jl2,jl3,jl4,jl5;
	JPanel jp1;
//	JTextArea jta1;
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi1,jmi2,jmi3;
	JComboBox<String> jcb;
	
	private static String difficulty="easy";//mid,hard
	private static int temp1,temp2;
	
	public gui(){
		changeRadom();
		jtf1=new JTextField(5);
		jb1=new JButton("确认");
//		jl1=new JLabel("+");
		jcb=new JComboBox<String>();
		jcb.addItem("+");
		jcb.addItem("-");
		jcb.addItem("*");
		jcb.addItem("/");
		jl2=new JLabel("=");
		jl3=new JLabel(""+temp1);
		jl4=new JLabel(""+temp2);
		jl4.setPreferredSize(new Dimension(35,25));
		jl3.setPreferredSize(new Dimension(35,25));
		jp1=new JPanel();
//		jta1=new JTextArea();
		jl5=new JLabel();
		jmb=new JMenuBar();
		jm=new JMenu("胎教");
		jmi1=new JMenuItem("胎教");
		jmi2=new JMenuItem("高中");
		jmi3=new JMenuItem("研究生");
		
		jmb.add(jm);
		jm.add(jmi1);
		jm.add(jmi2);
		jm.add(jmi3);
		jp1.setLayout(new FlowLayout());
		jp1.add(jl3);
//		jp1.add(jl1);
		jp1.add(jcb);
		jp1.add(jl4);
		jp1.add(jl2);
		jp1.add(jtf1);
		jp1.add(jb1);
		
		this.add(jp1,BorderLayout.CENTER);
		this.add(jl5,BorderLayout.SOUTH);
		this.setJMenuBar(jmb);
		
		
		jmi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				difficulty="easy";
				jm.setText("胎教");
				changeRadom();
				jl3.setText(""+temp1);
				jl4.setText(""+temp2);
			}
		});
		
		jmi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				difficulty="mid";
				jm.setText("高中");
				changeRadom();
				jl3.setText(""+temp1);
				jl4.setText(""+temp2);
			}
		});
		
		jmi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				difficulty="hard";
				jm.setText("研究生");
				changeRadom();
				jl3.setText(""+temp1);
				jl4.setText(""+temp2);
			}
		});
		
		
		
//		jb1.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent a) {
//					if(a.getSource()==jb1) {
//						String temp=jtf1.getText(),ans = null;
//						if(jcb.getSelectedIndex()==0) {//+
//							ans=""+(temp1+temp2);
//						}else if(jcb.getSelectedIndex()==1) {//-
//							ans=""+(temp1-temp2);
//						}else if(jcb.getSelectedIndex()==2) {//* 
//							ans=""+(temp1*temp2);
//						}else if(jcb.getSelectedIndex()==3) {//除法
//							ans=""+(temp1/temp2);
//						}
//						if(temp.equals(ans)) {
////							jta1.append("正确\n");
//							jl5.setText("                                                         正确");
//						}else {
////							jta1.append("错误\n");
//							jl5.setText("                                                         错误");
//						}
//					}
//				}
//			}
//		);
		jb1.addActionListener(new tempActionListener());
		
		
		this.setTitle("小学数学考试");
		this.setSize(400,150);
		this.setLocation(600,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void changeRadom() {
		if(difficulty.equals("easy")) {
			temp1=(int) ((Math.random()*10)+1);
			temp2=(int) ((Math.random()*10)+1);
		}else if(difficulty.equals("mid")) {
			temp1=(int) ((Math.random()*50)+1);
			temp2=(int) ((Math.random()*50)+1);
		}else if(difficulty.equals("hard")) {
			temp1=(int) ((Math.random()*10000)+1);
			temp2=(int) ((Math.random()*10000)+1);
		}
	}
	class tempActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jb1) {
				String temp=jtf1.getText(),ans = null;
				if(jcb.getSelectedIndex()==0) {//+
					ans=""+(temp1+temp2);
				}else if(jcb.getSelectedIndex()==1) {//-
					ans=""+(temp1-temp2);
				}else if(jcb.getSelectedIndex()==2) {//* 
					ans=""+(temp1*temp2);
				}else if(jcb.getSelectedIndex()==3) {//除法
					ans=""+(temp1/temp2);
				}
				if(temp.equals(ans)) {
//					jta1.append("正确\n");
					jl5.setText("                                                         正确");
				}else {
//					jta1.append("错误\n");
					jl5.setText("                                                         错误");
				}
			}
		}		
	}
}
