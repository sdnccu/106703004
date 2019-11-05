package midterm;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class Midterm_Window {

	protected Shell Midterm_Window;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Midterm_Window window = new Midterm_Window();
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
		Midterm_Window.open();
		Midterm_Window.layout();
		while (!Midterm_Window.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		Midterm_Window = new Shell();
		Midterm_Window.setToolTipText("");
		Midterm_Window.setSize(497, 316);
		Midterm_Window.setText("Midterm Window");
		
		com01 com01_ = new com01(Midterm_Window, SWT.NONE);
		com01_.setBounds(10, 50, 91, 141);
		
		com02 com02_ = new com02(Midterm_Window, SWT.NONE);
		com02_.setBounds(107, 10, 346, 34);
		
		text = new Text(Midterm_Window, SWT.BORDER);
		text.setBounds(107, 50, 346, 152);
		
		Button button = new Button(Midterm_Window, SWT.NONE);
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		button.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		button.setBounds(107, 221, 113, 34);
		button.setText("<BACK");
		
		Button btnNext = new Button(Midterm_Window, SWT.NONE);
		btnNext.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNext.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		btnNext.setText("NEXT>");
		btnNext.setBounds(340, 221, 113, 34);
		
		Label lblNextPage = new Label(Midterm_Window, SWT.CENTER);
		lblNextPage.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 10, SWT.NORMAL));
		lblNextPage.setBounds(10, 21, 66, 23);
		lblNextPage.setText("Next Page");

	}
}
