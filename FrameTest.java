package java_awt_expl;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("���Դ���");
		f.setBounds(30, 30, 250, 200);//ͬʱ���������λ�úʹ�С
		f.setVisible(true);
		
		//**//Component�ೣ�÷���
		
		Panel p=new Panel();
		
		p.setLocation(30,100);//���������λ��
		p.setSize(200, 200);//��������Ĵ�С
		p.setVisible(true);//��������Ƿ�ɼ�
		f.add(p);//�����������Component
		
		Component comp=f.getComponentAt(20, 50);//ָ��λ�õ����
		String comp_name=comp.getName();
		int comp_num=f.getComponentCount();//ָ���������������
		Component[] comps=f.getComponents();
		
		
		//**//���Խ��
		
		System.out.println(comp_name+"   "+comp_num);//ָ��λ�õ��������
		int i=0;
		int num=comps.length;
		while (num!=0)
		{
			System.out.println(comps[i].getName());
			num--;
		}
		
	}

}
