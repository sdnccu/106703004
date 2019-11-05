package midterm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class com02 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public com02(Composite parent, int style) {
		super(parent, style);
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.justify = true;
		rowLayout.fill = true;
		rowLayout.center = true;
		rowLayout.spacing = 150;
		setLayout(rowLayout);
		
		Button btnRead = new Button(this, SWT.RADIO);
		btnRead.setLayoutData(new RowData(72, 28));
		btnRead.setText("Read");
		
		DateTime dateTime = new DateTime(this, SWT.BORDER);
		dateTime.setLayoutData(new RowData(110, SWT.DEFAULT));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
