package java_awt_expl;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f=new Frame("���Դ���");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
		
		for(int i=0; i<10; i++)
		{
			f.add(new Button("��ť"+i));
		}
		
		f.pack();
		f.setVisible(true);
		
		//**//FlowLayout���ֹ������ṩ����������
		
		//1.FlowLayout()
		//2.FlowLayout(int align)
		//3.FlowLayout(int align,int hgap,int vgap)
		
		//pack()��windows�ṩ�ķ���
		
		//**//
	}

}
