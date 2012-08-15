package ylkj.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class CompositeSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Composite and Group");
		shell.setBounds(100, 50, 500, 400);

		TabFolder folder = new TabFolder(shell, SWT.NONE);
		folder.setBounds(5, 5, 400, 250);

		TabItem item = new TabItem(folder, SWT.NONE);
		item.setText("选项卡1");
		{

			Group group1 = new Group(folder, SWT.NONE);
			group1.setText("录入信息2");
			item.setControl(group1);
			Label lb3 = new Label(group1, SWT.NONE); // 在分组框中加入组件
			lb3.setText("姓名：");
			lb3.setBounds(10, 20, 100, 20);
			Text text1 = new Text(group1, SWT.BORDER);
			text1.setBounds(110, 20, 150, 20);
			Label lb2 = new Label(group1, SWT.NONE);
			lb2.setText("地址：");
			lb2.setBounds(10, 50, 100, 20);
			Text text2 = new Text(group1, SWT.BORDER);
			text2.setBounds(110, 50, 150, 20);

		}
		TabItem tabItem2 = new TabItem(folder, SWT.NONE); // 声明第2个选项页
		tabItem2.setText("选项2");
		{

			Composite com = new Composite(folder, SWT.BORDER);
			tabItem2.setControl(com);
			Label lb1 = new Label(com, SWT.NONE);
			lb1.setText("面板1");
			lb1.pack();
		}

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
