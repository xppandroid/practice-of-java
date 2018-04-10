package java_awt_expl;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GridLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("计算器");
		Panel p1=new Panel();
		p1.add(new TextField(30));
		f.add(p1,BorderLayout.NORTH);
		
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(3,5,4,4));
		String[] name= {"0","1","2","3","4","5","6","7","8","9"
				,"+","-","*","/","."};
		for(int i=0;i<name.length;i++)
		{
			p2.add(new Button(name[i]));
		}
		
		f.add(p2);
		f.pack();
		f.setVisible(true);

		//**//GridLayout提供了两个构造器
		
		//1.GridLayout(int rows,int cols)
		//2.GridLayout(int rows,int cols,int hgap,int vgap)
		
		//**//
	}
}
