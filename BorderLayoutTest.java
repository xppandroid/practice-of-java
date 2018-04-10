package java_awt_expl;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f=new Frame("测试窗口");
		f.setLayout(new BorderLayout(5,5));
		
		f.add(new Button("南"),BorderLayout.SOUTH);
		f.add(new Button("北"),BorderLayout.NORTH);
		
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		f.add(p);
		
//		f.add(new Button("中"),BorderLayout.CENTER);
		f.add(new Button("东"),BorderLayout.EAST);
		f.add(new Button("西"),BorderLayout.WEST);
		
		f.pack();
		f.setVisible(true);
		
		//**//BorderLayout的构造器
		
		//1.BorderLayout()
		//2.BorderLayout(int hgap,int vgap)
		//
		
		
		
	}

}
