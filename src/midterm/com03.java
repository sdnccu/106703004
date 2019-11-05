package midterm;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class com03 extends Composite {
	private Composite SHOW;
	private Text text;
	private Text text_1;
	private Button btnNewButton;
	private Button btnNewButton_1;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public com03(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.VERTICAL));
		
		SHOW = new Composite(this, SWT.NONE);
		SHOW.setLayout(new StackLayout());
		
		text = new Text(SHOW, SWT.BORDER);
		text.setText("01");
		
		text_1 = new Text(SHOW, SWT.BORDER);
		text_1.setText("02");
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(null);
		
		btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			Show1();
			}
		});
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		btnNewButton.setBounds(27, 10, 117, 44);
		btnNewButton.setText("<BACK");
		
		btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			Show2();
			}
		});
		btnNewButton_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNewButton_1.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 16, SWT.BOLD));
		btnNewButton_1.setBounds(304, 10, 117, 44);
		btnNewButton_1.setText("NEXT>");

	}
	private void Show1() {
		StackLayout layout= (StackLayout) this.SHOW.getLayout();
		layout.topControl= this.text;
		this.SHOW.layout();
	}

	private void Show2() {
		StackLayout layout= (StackLayout) this.SHOW.getLayout();
		layout.topControl= this.text_1;
		this.SHOW.layout();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
