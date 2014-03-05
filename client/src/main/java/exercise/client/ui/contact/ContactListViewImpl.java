package exercise.client.ui.contact;

import exercise.client.activity.contact.ContactListActivity;
import exercise.shared.dto.contact.ContactDetailDto;
import exercise.client.ui.BaseAbstractView;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.Button;

public class ContactListViewImpl extends BaseAbstractView {
    private static ContactListViewImplUiBinder uiBinder = GWT.create(ContactListViewImplUiBinder.class);

    interface ContactListViewImplUiBinder extends UiBinder<Widget, ContactListViewImpl> {
    }

    private Activity activity;

    @UiField
    protected SimplePanel contentWrapperPanel;

    @UiField
    protected SimplePager pager;

    @UiField
    protected FlowPanel tablePanel, searchPanel;

    private CellTable<ContactDetailDto> table;

    @UiField
    protected
    TextBox forename, surname, street, city, county, country, postalCode;

    public ContactListViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        tablePanel.setVisible(false);
    }

    public CellTable<ContactDetailDto> getTable() {
        return table;
    }

    public void setTable(CellTable<ContactDetailDto> table) {
        this.table = table;
    }

    public FlowPanel getTablePanel() {
        return tablePanel;
    }

    public SimplePager getPager() {
        return pager;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public TextBox getForename() {
        return forename;
    }

    public TextBox getSurname() {
        return surname;
    }

    public TextBox getStreet() {
        return street;
    }

    public TextBox getCity() {
        return city;
    }

    public TextBox getCounty() {
        return county;
    }

    public TextBox getCountry() {
        return country;
    }

    public TextBox getPostalCode() {
        return postalCode;
    }

    @UiHandler("btnAdd")
    protected void btnAdd(ClickEvent e) {
        ((ContactListActivity)getActivity()).doAddContact();
    }

    @UiHandler("btnSearch")
    protected void btnSearch(ClickEvent e) {
        ((ContactListActivity)getActivity()).doSearch();
    }

    @UiHandler("btnShowAll")
    protected void btnShowAll(ClickEvent e) {
        ((ContactListActivity)getActivity()).doLoadContacts();
    }
}
