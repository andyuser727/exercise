package exercise.client.ui.contact;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ContactListViewImpl_ContactListViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, exercise.client.ui.contact.ContactListViewImpl>, exercise.client.ui.contact.ContactListViewImpl.ContactListViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final exercise.client.ui.contact.ContactListViewImpl owner) {

    exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle) GWT.create(exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle.class);
    exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button btnAdd = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button btnSearch = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button btnShowAll = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox forename = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox surname = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel6 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox street = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel8 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox city = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel10 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label13 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox county = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel12 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label15 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox country = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel14 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox postalCode = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel16 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel3 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.cellview.client.SimplePager pager = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.CENTER);
    com.google.gwt.user.client.ui.FlowPanel tablePanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel searchPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.SimplePanel contentWrapperPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    btnAdd.setText("Add Contact");
    f_FlowPanel2.add(btnAdd);
    btnSearch.setText("Search");
    f_FlowPanel2.add(btnSearch);
    btnShowAll.setText("Show All");
    f_FlowPanel2.add(btnShowAll);
    f_FlowPanel2.addStyleName("" + style.paddingButton() + "");
    searchPanel.add(f_FlowPanel2);
    f_Label5.addStyleName("" + style.newLine() + "");
    f_Label5.addStyleName("" + style.floatLeft() + "");
    f_Label5.setText("First Name");
    f_Label5.setWidth("100px");
    f_FlowPanel4.add(f_Label5);
    f_FlowPanel4.add(forename);
    f_FlowPanel3.add(f_FlowPanel4);
    f_Label7.addStyleName("" + style.newLine() + "");
    f_Label7.addStyleName("" + style.floatLeft() + "");
    f_Label7.setText("SurName");
    f_Label7.setWidth("100px");
    f_FlowPanel6.add(f_Label7);
    f_FlowPanel6.add(surname);
    f_FlowPanel3.add(f_FlowPanel6);
    f_Label9.addStyleName("" + style.newLine() + "");
    f_Label9.addStyleName("" + style.floatLeft() + "");
    f_Label9.setText("Street");
    f_Label9.setWidth("100px");
    f_FlowPanel8.add(f_Label9);
    f_FlowPanel8.add(street);
    f_FlowPanel3.add(f_FlowPanel8);
    f_Label11.addStyleName("" + style.newLine() + "");
    f_Label11.addStyleName("" + style.floatLeft() + "");
    f_Label11.setText("City");
    f_Label11.setWidth("100px");
    f_FlowPanel10.add(f_Label11);
    f_FlowPanel10.add(city);
    f_FlowPanel3.add(f_FlowPanel10);
    f_Label13.addStyleName("" + style.newLine() + "");
    f_Label13.addStyleName("" + style.floatLeft() + "");
    f_Label13.setText("County");
    f_Label13.setWidth("100px");
    f_FlowPanel12.add(f_Label13);
    f_FlowPanel12.add(county);
    f_FlowPanel3.add(f_FlowPanel12);
    f_Label15.addStyleName("" + style.newLine() + "");
    f_Label15.addStyleName("" + style.floatLeft() + "");
    f_Label15.setText("Country");
    f_Label15.setWidth("100px");
    f_FlowPanel14.add(f_Label15);
    f_FlowPanel14.add(country);
    f_FlowPanel3.add(f_FlowPanel14);
    f_Label17.addStyleName("" + style.newLine() + "");
    f_Label17.addStyleName("" + style.floatLeft() + "");
    f_Label17.setText("Post Code");
    f_Label17.setWidth("100px");
    f_FlowPanel16.add(f_Label17);
    f_FlowPanel16.add(postalCode);
    f_FlowPanel3.add(f_FlowPanel16);
    f_FlowPanel3.addStyleName("" + style.paddingButton() + "");
    searchPanel.add(f_FlowPanel3);
    tablePanel.add(pager);
    searchPanel.add(tablePanel);
    contentWrapperPanel.add(searchPanel);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(contentWrapperPanel, domId0Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.btnAdd(event);
      }
    };
    btnAdd.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.btnSearch(event);
      }
    };
    btnSearch.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.btnShowAll(event);
      }
    };
    btnShowAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    owner.city = city;
    owner.contentWrapperPanel = contentWrapperPanel;
    owner.country = country;
    owner.county = county;
    owner.forename = forename;
    owner.pager = pager;
    owner.postalCode = postalCode;
    owner.searchPanel = searchPanel;
    owner.street = street;
    owner.surname = surname;
    owner.tablePanel = tablePanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
