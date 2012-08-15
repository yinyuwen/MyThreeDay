package ylkj.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloSWT {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(null);
		Text hello = new Text(shell, SWT.NULL);
		shell.setText("JavaӦ�ó���");
	
		shell.setSize(500,400);
		Color color = new Color(Display.getCurrent(), 255,255,255);
		shell.setBackground(color);
		hello.setText("Hello My Frist SWT World! ");
		hello.pack();//�Զ������ı���Ĵ�С
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
