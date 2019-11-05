package tableviewer;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import java.util.List;
import tutorial.Article;
import tutorial.DataModel;

public class TableViewer {

	protected Shell shell;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TableViewer window = new TableViewer();
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
		shell.setSize(348, 508);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		org.eclipse.jface.viewers.TableViewer tableViewer = new org.eclipse.jface.viewers.TableViewer(shell, SWT.BORDER | SWT.FULL_SELECTION);
		
		ArticleTableCLProvider provider = new ArticleTableCLProvider();;        
		tableViewer.setContentProvider(provider);        
		tableViewer.setLabelProvider(provider);  
		
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Arictel");
		
		TableColumn tblclmnAuthor = new TableColumn(table, SWT.NONE);
		tblclmnAuthor.setWidth(100);
		tblclmnAuthor.setText("Author");
		
		List<Article> articleList= DataModel.getArticles();
		tableViewer.setInput(articleList);


	}

}
