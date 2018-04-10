package java_awt_expl;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("测试窗口");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
		
		for(int i=0; i<10; i++)
		{
			f.add(new Button("按钮"+i));
		}
		
		f.pack();
		f.setVisible(true);
		
		//**//FlowLayout布局管理器提供三个构造器
		
		//1.FlowLayout()
		//2.FlowLayout(int align)
		//3.FlowLayout(int align,int hgap,int vgap)
		
		//pack()是windows提供的方法
		
		//**//
	}

}
