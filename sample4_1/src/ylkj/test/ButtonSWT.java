package ylkj.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ButtonSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(null);
		shell.setText("°´Å¥ÊµÀý");
		shell.setSize(300, 300);
		shell.setBackground(new Color(display, 255, 255, 255));
		Button button = new Button(shell, SWT.NULL);
		  button.setText("NUll");
		  button.setBounds(10, 10, 50, 20);
		  
		  Button button1 = new Button(shell, SWT.PUSH);
		  button1.setText("PUSH");
		  button1.setBounds(70, 10, 50, 20);
		  
		  Button button2 = new Button(shell, SWT.CHECK);
		  button2.setText("CHECK");
		  button2.setBounds(130, 10, 50, 20);
		  
		  Button button3 = new Button(shell, SWT.BORDER|SWT.CHECK);
		  button3.setText("BORDER|CHECK");
		  button3.setBounds(190, 10, 50, 20);
		  
		  Button button4 = new Button(shell, SWT.RADIO);
		  button4.setText("RADIO");
		  button4.setBounds(10, 40, 50, 20);
		  
		  
		  Button button5 = new Button(shell, SWT.ARROW|SWT.RIGHT);
		  button5.setText("ARROW");
		  button5.setBounds(70, 40, 50, 20);
		  Button button6 = new Button(shell, SWT.ARROW|SWT.LEFT);
		  button6.setText("ARROW");
		  button6.setBounds(120, 40, 50, 20);
		  
		  
		  
		  
		  
		  
		shell.setVisible(true);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
