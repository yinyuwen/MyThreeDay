package ylkj.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LableSWT {
	private static Label lb;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		// shell.setLayout(null);
		shell.setText("��ǩʵ�� ");
		shell.setBounds(50, 50, 400, 400);
		Label ab1 = new Label(shell, SWT.BORDER | SWT.CENTER);
		ab1.setText("��ǩ1");
		ab1.setBounds(10, 10, 100, 22);
		ab1.setFont(new Font(display, "����", 14, SWT.BOLD));
		ab1.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));

		Label lb2 = new Label(shell, SWT.CENTER);
		lb2.setBounds(110, 10, 70, 30);
		lb2.setText("��ǩ2");
		lb2.setFont(new Font(display, "����", 14, SWT.NORMAL));
		Label lb3 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL | SWT.BORDER);
		lb3.setBounds(10, 50, 70, 30);
		Label lb4 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL// ��ֱ
				| SWT.BORDER);
		lb4.setBounds(90, 50, 70, 30);
		// �ı�
		Text t = new Text(shell, SWT.NONE | SWT.BORDER);
		t.setBounds(190, 10, 180, 22);

		Text t1 = new Text(shell, SWT.PASSWORD | SWT.BORDER);
		t1.setBounds(190, 40, 180, 22);
		// ��ѡ��
		final List list = new List(shell, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER);
		list.setBounds(10, 90, 80, 80);

		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] str=list.getItems();
				for (int i = 0; i < str.length; i++) {
					
					lb.setText(list.getItem(i));
				}
				
			}
		});

		// ������
		final Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(10, 190, 100, 30);
		lb = new Label(shell, SWT.WRAP);
		lb.setBounds(150, 190, 100, 30);
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.setBounds(10, 230, 80, 30);
		btn1.setText("��ֵ");
		btn1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {// �����¼�
				combo.removeAll();
				for (int i = 0; i < 5; i++) {
					combo.add("��" + i + "ҳ");
				}
				combo.select(0);

				list.removeAll();
				for (int j = 0; j < 8; j++) {
					list.add("��" + j + "ҳ");
				}
				list.select(0);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		Button btn2 = new Button(shell, SWT.NONE);
		btn2.setBounds(100, 230, 80, 30);
		btn2.setText("ȡֵ");
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {// �����¼�
				lb.setText("��ѡ�����:" + combo.getText());
			}
		});

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {// �����¼�
				lb.setText("��ѡ�����:" + combo.getText());
			}
		});
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
