package swt_widgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;

public class BUTTON1 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public BUTTON1(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(0, 0, 450, 41);
		FillLayout fl_composite = new FillLayout(SWT.HORIZONTAL);
		fl_composite.spacing = 30;
		fl_composite.marginWidth = 50;
		composite.setLayout(fl_composite);
		
		org.eclipse.swt.widgets.Button btnNew = new org.eclipse.swt.widgets.Button(composite, SWT.NONE);
		btnNew.setText("New");
		
		org.eclipse.swt.widgets.Button btnDelete = new org.eclipse.swt.widgets.Button(composite, SWT.NONE);
		btnDelete.setText("Delete");
		
		org.eclipse.swt.widgets.Button btnClear = new org.eclipse.swt.widgets.Button(composite, SWT.NONE);
		btnClear.setText("Clear");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
