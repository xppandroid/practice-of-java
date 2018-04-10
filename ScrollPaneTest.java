package java_awt_expl;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

public class ScrollPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("测试窗口");
		
		ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//总是有进度条
		
		sp.add(new TextField(20));
		sp.add(new Button("单击我"));
		
		f.add(sp);
		f.setBounds(30,30,250,120);
		f.setVisible(true);	

	}

}
