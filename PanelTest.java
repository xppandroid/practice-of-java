package java_awt_expl;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame();
		Panel p=new Panel();
		
		p.add(new TextField(20));
		p.add(new Button("µ¥»÷ÎÒ"));
		
		f.add(p);
		
		f.setBounds(20, 30, 250, 200);
		f.setVisible(true);

	}

}
