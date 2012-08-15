package ylkj.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MenuSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setBounds(50, 50, 500, 500);
		shell.setText("菜单实例");
		Menu mainMenu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(mainMenu);

		// Menu mainMenu=new Menu(shell,SWT.POP_UP); //创建弹出式菜单
		// shell.setMenu(mainMenu);
		{
			MenuItem menuItem = new MenuItem(mainMenu, SWT.CASCADE);
			menuItem.setText("&File");

			Menu menu = new Menu(shell, SWT.DROP_DOWN);
			menuItem.setMenu(menu);
			{
				MenuItem newFileItem = new MenuItem(menu, SWT.CASCADE);
				newFileItem.setText("&New");
				Menu newFileMenu = new Menu(shell, SWT.DROP_DOWN);
				newFileItem.setMenu(newFileMenu);
				{
					MenuItem newProjectItem = new MenuItem(newFileMenu,
							SWT.PUSH);
					newProjectItem.setText("项目\tCtrl+Shift+N");
					newProjectItem.setAccelerator(SWT.CTRL + SWT.SHIFT + 'N');
					newProjectItem.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							Text text = new Text(shell, SWT.MULTI | SWT.BORDER
									| SWT.WRAP);
							text.setBounds(70, 10, 100, 30);
							text.setText("New Project");
						}
					});
					new MenuItem(newFileMenu, SWT.SEPARATOR);
					new MenuItem(newFileMenu, SWT.PUSH).setText("Package");
					new MenuItem(newFileMenu, SWT.PUSH).setText("Class");
				}
				MenuItem openFileItem = new MenuItem(menu, SWT.CASCADE);
				openFileItem.setText("Open&O");
				MenuItem exitItem = new MenuItem(menu, SWT.CASCADE);
				exitItem.setText("&Exit");
			}
			MenuItem helpItem = new MenuItem(mainMenu, SWT.CASCADE);
			helpItem.setText("&Help");
		}

		shell.open();
		shell.setVisible(true);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}
