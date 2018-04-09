package java_awt_expl;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("测试窗口");
		f.setBounds(30, 30, 250, 200);//同时设置组件的位置和大小
		f.setVisible(true);
		
		//**//Component类常用方法
		
		Panel p=new Panel();
		
		p.setLocation(30,100);//设置组件的位置
		p.setSize(200, 200);//设置组件的大小
		p.setVisible(true);//设置组件是否可见
		f.add(p);//向容器中添加Component
		
		Component comp=f.getComponentAt(20, 50);//指定位置的组件
		String comp_name=comp.getName();
		int comp_num=f.getComponentCount();//指定容器内组件数量
		Component[] comps=f.getComponents();
		
		
		//**//测试结果
		
		System.out.println(comp_name+"   "+comp_num);//指定位置的组件名称
		int i=0;
		int num=comps.length;
		while (num!=0)
		{
			System.out.println(comps[i].getName());
			num--;
		}
		
	}

}
