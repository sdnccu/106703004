package swt_widgets;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class combine {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			combine window = new combine();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(734, 483);
		shell.setText("SWT Application");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(122, 25, 450, 352);
		
		Top top = new Top(composite, SWT.NONE);
		top.setBounds(0, 0, 450, 97);
		
		BUTTON1 n1 = new BUTTON1(composite, SWT.NONE);
		n1.setBounds(0, 94, 450, 41);
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(10, 150, 430, 192);

	}
}
