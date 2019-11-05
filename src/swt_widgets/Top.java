package swt_widgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class Top extends Composite {
	private Text txtColumnWidth;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Top(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		
		Composite composite = new Composite(this, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 97);
		fd_composite.right = new FormAttachment(0, 450);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new FormLayout());
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		FormData fd_btnCheckButton = new FormData();
		fd_btnCheckButton.left = new FormAttachment(0, 10);
		btnCheckButton.setLayoutData(fd_btnCheckButton);
		btnCheckButton.setFont(SWTResourceManager.getFont("Open Sans", 12, SWT.NORMAL));
		btnCheckButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCheckButton.setText("Preferred Site");
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		fd_btnCheckButton.bottom = new FormAttachment(lblNewLabel, -1);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 33);
		fd_lblNewLabel.left = new FormAttachment(0, 14);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setFont(SWTResourceManager.getFont("Open Sans", 12, SWT.NORMAL));
		lblNewLabel.setText("Column Width");
		
		txtColumnWidth = new Text(composite, SWT.BORDER);
		FormData fd_txtColumnWidth = new FormData();
		fd_txtColumnWidth.top = new FormAttachment(lblNewLabel, 5);
		fd_txtColumnWidth.right = new FormAttachment(100, -266);
		fd_txtColumnWidth.left = new FormAttachment(0, 15);
		txtColumnWidth.setLayoutData(fd_txtColumnWidth);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
