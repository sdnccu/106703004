package midterm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;

public class com01 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public com01(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.VERTICAL));
		
		Button btnYes = new Button(this, SWT.CHECK);
		btnYes.setText("Yes");
		
		Button btnNo = new Button(this, SWT.CHECK);
		btnNo.setText("No");
		
		Button btnNotSure = new Button(this, SWT.CHECK);
		btnNotSure.setText("Not Sure");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
