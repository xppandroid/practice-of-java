package java_awt_expl;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f=new Frame("���Դ���");
		f.setLayout(new BorderLayout(5,5));
		
		f.add(new Button("��"),BorderLayout.SOUTH);
		f.add(new Button("��"),BorderLayout.NORTH);
		
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("������"));
		f.add(p);
		
//		f.add(new Button("��"),BorderLayout.CENTER);
		f.add(new Button("��"),BorderLayout.EAST);
		f.add(new Button("��"),BorderLayout.WEST);
		
		f.pack();
		f.setVisible(true);
		
		//**//BorderLayout�Ĺ�����
		
		//1.BorderLayout()
		//2.BorderLayout(int hgap,int vgap)
		//
		
		
		
	}

}
