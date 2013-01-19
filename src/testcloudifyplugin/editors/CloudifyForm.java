package testcloudifyplugin.editors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class CloudifyForm extends FormPage {
    private Table table;
    private Text txtNewText;
    private Text txtAnonymous;
    private Text text;

    /**
     * Create the form page.
     * @param id
     * @param title
     */
    public CloudifyForm(String id, String title) {
        super(id, title);
    }

    /**
     * Create the form page.
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public CloudifyForm(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    /**
     * Create contents of the form.
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText("Cloudify");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        
        Section sctnNewSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection.setBounds(10, 10, 375, 264);
        managedForm.getToolkit().paintBordersFor(sctnNewSection);
        sctnNewSection.setText("Server information");
        sctnNewSection.setExpanded(true);
        
        Composite composite = managedForm.getToolkit().createComposite(sctnNewSection, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite);
        sctnNewSection.setClient(composite);
        
        Label lblNewLabel = new Label(composite, SWT.NONE);
        lblNewLabel.setBounds(10, 10, 76, 14);
        managedForm.getToolkit().adapt(lblNewLabel, true, true);
        lblNewLabel.setText("Cloudify URL:");
        
        txtNewText = managedForm.getToolkit().createText(composite, "New Text", SWT.NONE);
        txtNewText.setText("http://localhost:8100");
        txtNewText.setBounds(92, 7, 252, 19);
        
        Label lblLogin = new Label(composite, SWT.NONE);
        lblLogin.setText("Login:");
        lblLogin.setBounds(10, 43, 76, 14);
        managedForm.getToolkit().adapt(lblLogin, true, true);
        
        txtAnonymous = managedForm.getToolkit().createText(composite, "New Text", SWT.NONE);
        txtAnonymous.setText("anonymous");
        txtAnonymous.setBounds(92, 40, 252, 19);
        
        Label lblPassword = new Label(composite, SWT.NONE);
        lblPassword.setText("Password:");
        lblPassword.setBounds(10, 77, 76, 14);
        managedForm.getToolkit().adapt(lblPassword, true, true);
        
        text = managedForm.getToolkit().createText(composite, "New Text", SWT.NONE);
        text.setText("");
        text.setBounds(92, 74, 252, 19);
        
        Label lblStatus = new Label(composite, SWT.NONE);
        lblStatus.setText("Status:");
        lblStatus.setBounds(10, 114, 76, 14);
        managedForm.getToolkit().adapt(lblStatus, true, true);
        
        Label lblConnected = new Label(composite, SWT.NONE);
        lblConnected.setText("Connected");
        lblConnected.setBounds(92, 114, 76, 14);
        managedForm.getToolkit().adapt(lblConnected, true, true);
        
        Button btnConnect = managedForm.getToolkit().createButton(composite, "Disconnect", SWT.NONE);
        btnConnect.setEnabled(false);
        btnConnect.setBounds(272, 139, 72, 22);
        
        Button btnConnect_1 = managedForm.getToolkit().createButton(composite, "Connect", SWT.NONE);
        btnConnect_1.setBounds(193, 139, 72, 22);
        
        Section sctnServerStatus = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnServerStatus.setBounds(404, 10, 383, 264);
        managedForm.getToolkit().paintBordersFor(sctnServerStatus);
        sctnServerStatus.setText("Server status");
        sctnServerStatus.setExpanded(true);
        
        Composite composite_1 = managedForm.getToolkit().createComposite(sctnServerStatus, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnServerStatus.setClient(composite_1);
        
        Label lblHealth = new Label(composite_1, SWT.NONE);
        lblHealth.setText("Health:");
        lblHealth.setBounds(10, 10, 76, 14);
        managedForm.getToolkit().adapt(lblHealth, true, true);
        
        Label lblGood = new Label(composite_1, SWT.NONE);
        lblGood.setText("Good");
        lblGood.setBounds(127, 10, 76, 14);
        managedForm.getToolkit().adapt(lblGood, true, true);
        
        Label label = new Label(composite_1, SWT.NONE);
        label.setText("3");
        label.setBounds(127, 30, 76, 14);
        managedForm.getToolkit().adapt(label, true, true);
        
        Label lblHosts = new Label(composite_1, SWT.NONE);
        lblHosts.setText("Hosts:");
        lblHosts.setBounds(10, 30, 76, 14);
        managedForm.getToolkit().adapt(lblHosts, true, true);
        
        Label label_2 = new Label(composite_1, SWT.NONE);
        label_2.setText("3");
        label_2.setBounds(127, 50, 76, 14);
        managedForm.getToolkit().adapt(label_2, true, true);
        
        Label lblGsaInstances = new Label(composite_1, SWT.NONE);
        lblGsaInstances.setText("GSA instances:");
        lblGsaInstances.setBounds(10, 50, 99, 14);
        managedForm.getToolkit().adapt(lblGsaInstances, true, true);
        
        Label lblGsmInstances = new Label(composite_1, SWT.NONE);
        lblGsmInstances.setText("GSM instances:");
        lblGsmInstances.setBounds(10, 70, 99, 14);
        managedForm.getToolkit().adapt(lblGsmInstances, true, true);
        
        Label label_5 = new Label(composite_1, SWT.NONE);
        label_5.setText("1");
        label_5.setBounds(127, 70, 76, 14);
        managedForm.getToolkit().adapt(label_5, true, true);
        
        Label lblEsmInstances = new Label(composite_1, SWT.NONE);
        lblEsmInstances.setText("ESM instances:");
        lblEsmInstances.setBounds(10, 90, 99, 14);
        managedForm.getToolkit().adapt(lblEsmInstances, true, true);
        
        Label label_7 = new Label(composite_1, SWT.NONE);
        label_7.setText("1");
        label_7.setBounds(127, 90, 76, 14);
        managedForm.getToolkit().adapt(label_7, true, true);
        
        Label lblGscInstances = new Label(composite_1, SWT.NONE);
        lblGscInstances.setText("GSC instances:");
        lblGscInstances.setBounds(10, 110, 99, 14);
        managedForm.getToolkit().adapt(lblGscInstances, true, true);
        
        Label label_9 = new Label(composite_1, SWT.NONE);
        label_9.setText("1");
        label_9.setBounds(127, 110, 76, 14);
        managedForm.getToolkit().adapt(label_9, true, true);
        
        Label lblLusInstances = new Label(composite_1, SWT.NONE);
        lblLusInstances.setText("LUS instances:");
        lblLusInstances.setBounds(10, 130, 99, 14);
        managedForm.getToolkit().adapt(lblLusInstances, true, true);
        
        Label label_11 = new Label(composite_1, SWT.NONE);
        label_11.setText("5");
        label_11.setBounds(127, 130, 76, 14);
        managedForm.getToolkit().adapt(label_11, true, true);
        
        Section sctnAlerts = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnAlerts.setBounds(10, 280, 777, 149);
        managedForm.getToolkit().paintBordersFor(sctnAlerts);
        sctnAlerts.setText("Alerts");
        sctnAlerts.setExpanded(true);
        
        table = managedForm.getToolkit().createTable(sctnAlerts, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(table);
        sctnAlerts.setClient(table);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        
        TableColumn tblclmnStatus = new TableColumn(table, SWT.NONE);
        tblclmnStatus.setWidth(100);
        tblclmnStatus.setText("Status");
        
        TableColumn tblclmnType = new TableColumn(table, SWT.NONE);
        tblclmnType.setWidth(100);
        tblclmnType.setText("Type");
        
        TableColumn tblclmnDescription = new TableColumn(table, SWT.NONE);
        tblclmnDescription.setWidth(100);
        tblclmnDescription.setText("Description");
    }
}
