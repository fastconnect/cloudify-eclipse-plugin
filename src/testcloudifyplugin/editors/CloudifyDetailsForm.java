package testcloudifyplugin.editors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class CloudifyDetailsForm extends FormPage {
    private Text text;
    private Table table;
    private Text txtNewText;

    /**
     * Create the form page.
     * @param id
     * @param title
     */
    public CloudifyDetailsForm(String id, String title) {
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
    public CloudifyDetailsForm(FormEditor editor, String id, String title) {
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
        form.setText("Applications");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        
        Section sctnApplications = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnApplications.setBounds(10, 10, 375, 264);
        managedForm.getToolkit().paintBordersFor(sctnApplications);
        sctnApplications.setText("Applications");
        sctnApplications.setExpanded(true);
        
        Tree tree = managedForm.getToolkit().createTree(sctnApplications, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(tree);
        sctnApplications.setClient(tree);
        
        TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
        trtmNewTreeitem.setImage(ResourceManager.getPluginImage("org.eclipse.jst.server.ui", "/icons/obj16/ear.gif"));
        trtmNewTreeitem.setText("petclinic");
        
        TreeItem trtmTomcat = new TreeItem(trtmNewTreeitem, SWT.NONE);
        trtmTomcat.setImage(ResourceManager.getPluginImage("org.eclipse.mylyn.commons.ui", "/icons/etool16/web.png"));
        trtmTomcat.setText("tomcat");
        
        TreeItem trtmMongos = new TreeItem(trtmTomcat, SWT.NONE);
        trtmMongos.setImage(ResourceManager.getPluginImage("org.eclipse.datatools.connectivity.sqm.core.ui", "/icons/database.gif"));
        trtmMongos.setText("mongos");
        
        TreeItem trtmMongoconfig = new TreeItem(trtmMongos, SWT.NONE);
        trtmMongoconfig.setImage(ResourceManager.getPluginImage("org.eclipse.datatools.connectivity.sqm.core.ui", "/icons/database.gif"));
        trtmMongoconfig.setText("mongoConfig");
        
        TreeItem trtmMongod = new TreeItem(trtmMongos, SWT.NONE);
        trtmMongod.setImage(ResourceManager.getPluginImage("org.eclipse.datatools.connectivity.sqm.core.ui", "/icons/database.gif"));
        trtmMongod.setText("mongod");
        trtmMongos.setExpanded(true);
        trtmTomcat.setExpanded(true);
        trtmNewTreeitem.setExpanded(true);
        
        TreeColumn trclmnIcon = new TreeColumn(tree, SWT.NONE);
        trclmnIcon.setWidth(212);
        trclmnIcon.setText("Icon");
        
        Section sctnServiceDetails = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnServiceDetails.setBounds(418, 10, 375, 264);
        managedForm.getToolkit().paintBordersFor(sctnServiceDetails);
        sctnServiceDetails.setText("Service details");
        sctnServiceDetails.setExpanded(true);
        
        Composite composite = managedForm.getToolkit().createComposite(sctnServiceDetails, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite);
        sctnServiceDetails.setClient(composite);
        
        Label lblNewLabel = managedForm.getToolkit().createLabel(composite, "Instances:", SWT.NONE);
        lblNewLabel.setBounds(10, 10, 59, 14);
        
        Label lblNewLabel_1 = managedForm.getToolkit().createLabel(composite, "2 /", SWT.NONE);
        lblNewLabel_1.setBounds(78, 10, 28, 14);
        
        text = managedForm.getToolkit().createText(composite, "New Text", SWT.NONE);
        text.setText("2");
        text.setBounds(107, 7, 59, 19);
        
        Button btnSetInstances = managedForm.getToolkit().createButton(composite, "Set instances", SWT.NONE);
        btnSetInstances.setBounds(181, 5, 88, 22);
        
        table = managedForm.getToolkit().createTable(composite, SWT.NONE);
        table.setBounds(0, 45, 363, 196);
        managedForm.getToolkit().paintBordersFor(table);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        
        TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
        tblclmnNewColumn.setWidth(100);
        tblclmnNewColumn.setText("Name");
        
        TableColumn tblclmnCpu = new TableColumn(table, SWT.NONE);
        tblclmnCpu.setWidth(39);
        tblclmnCpu.setText("CPU");
        
        TableColumn tblclmnRam = new TableColumn(table, SWT.NONE);
        tblclmnRam.setWidth(80);
        tblclmnRam.setText("RAM");
        
        TableColumn tblclmnIp = new TableColumn(table, SWT.NONE);
        tblclmnIp.setWidth(92);
        tblclmnIp.setText("IP");
        
        TableItem tableItem = new TableItem(table, SWT.NONE);
        tableItem.setText(new String[] {"mongod-1", "50%", "256m (25%)", "192.168.57.23"});
        
        TableItem tableItem_1 = new TableItem(table, SWT.NONE);
        tableItem_1.setText(new String[] {"mongod-2", "25%", "256m (25%)", "192.168.57.24"});
        
        Section sctnLogs = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnLogs.setBounds(10, 285, 783, 144);
        managedForm.getToolkit().paintBordersFor(sctnLogs);
        sctnLogs.setText("Logs");
        sctnLogs.setExpanded(true);
        
        txtNewText = managedForm.getToolkit().createText(sctnLogs, "New Text", SWT.NONE);
        txtNewText.setText("01/11/13 22:48:41 -processSIGTERM_DA:       map -hosts /net\r\n01/11/13 22:48:41 -processSIGTERM_DA:    map auto_home /home\r\n01/11/13 22:48:41 -processSIGTERM_DA:     /dev/disk2s2 /Volumes/wd\r\n01/11/13 22:48:41 -processSIGTERM_DA:     /dev/disk0s4 /Volumes/BOOTCAMP\r\n01/11/13 22:48:42 -processSIGTERM_DA:     /dev/disk0s5 /Volumes/Data\r\n01/11/13 22:48:42 -processSIGTERM_DA:   /dev/disk1s0s2 /Volumes/WD SmartWare\r\n01/11/13 22:48:42 -processSIGTERM_DA: processing \"disk3\".\r\n\u0000");
        sctnLogs.setClient(txtNewText);
    }
}
