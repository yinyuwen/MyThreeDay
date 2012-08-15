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
		shell.setText("Java应用程序");
	
		shell.setSize(500,400);
		Color color = new Color(Display.getCurrent(), 255,255,255);
		shell.setBackground(color);
		hello.setText("Hello My Frist SWT World! ");
		hello.pack();//自动调节文本框的大小
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
