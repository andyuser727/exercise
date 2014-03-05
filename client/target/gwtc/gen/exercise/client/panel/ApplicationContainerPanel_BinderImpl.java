package exercise.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationContainerPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, exercise.client.panel.ApplicationContainerPanel>, exercise.client.panel.ApplicationContainerPanel.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final exercise.client.panel.ApplicationContainerPanel owner) {

    exercise.client.panel.ApplicationContainerPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (exercise.client.panel.ApplicationContainerPanel_BinderImpl_GenBundle) GWT.create(exercise.client.panel.ApplicationContainerPanel_BinderImpl_GenBundle.class);
    exercise.client.panel.ApplicationContainerPanel_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Image addressLogo = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel headerPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.SimplePanel f_SimplePanel4 = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel3 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.SimplePanel contentWrapperPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel5 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel mainDockPanel = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);

    f_FlowPanel2.add(addressLogo);
    f_FlowPanel2.addStyleName("" + style.paddingImage() + "");
    headerPanel.add(f_FlowPanel2);
    f_DockLayoutPanel1.addNorth(headerPanel, 6.5);
    f_ScrollPanel3.add(f_SimplePanel4);
    f_DockLayoutPanel1.addLineStart(f_ScrollPanel3, 10);
    f_FlowPanel5.add(contentWrapperPanel);
    mainDockPanel.add(f_FlowPanel5);
    f_DockLayoutPanel1.add(mainDockPanel);



    owner.addressLogo = addressLogo;
    owner.contentWrapperPanel = contentWrapperPanel;
    owner.headerPanel = headerPanel;
    owner.mainDockPanel = mainDockPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
