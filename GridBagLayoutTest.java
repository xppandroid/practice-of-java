package java_awt_expl;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayoutTest {

	
	private Frame f=new Frame();
	private GridBagLayout gb=new GridBagLayout();
	private GridBagConstraints gbc=new GridBagConstraints();
	private Button[] btns=new Button[10];
	
	public void init(){
		
		f.setLayout(gb);
		for(int i=0; i<btns.length; i++)
		{
			btns[i]=new Button("°´Å¥"+i);	
		}
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1;
		addButton(btns[0]);
		addButton(btns[1]);
		addButton(btns[2]);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addButton(btns[3]);
		
		gbc.weightx=0;
		addButton(btns[4]);
		
		gbc.gridwidth=2;
		addButton(btns[5]);
		
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addButton(btns[6]);
		
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weighty=1;
		addButton(btns[7]);
		
		gbc.weighty=0;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbc.gridheight=1;
		addButton(btns[8]);
		addButton(btns[9]);
		
		f.pack();
		f.setVisible(true);		
	}
	
	
	private void addButton(Button button)
	{
		gb.setConstraints(button, gbc);
		f.add(button);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GridBagLayoutTest().init();
		

	}

}
