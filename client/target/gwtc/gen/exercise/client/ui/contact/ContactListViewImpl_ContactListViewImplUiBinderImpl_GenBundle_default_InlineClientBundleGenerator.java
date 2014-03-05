package exercise.client.ui.contact;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle {
  private static ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GMOK10PCKI{padding-bottom:" + ("20px")  + ";}.GMOK10PCJI{display:" + ("block")  + ";}.GMOK10PCII{float:" + ("right")  + ";}.GMOK10PCLI{padding-left:" + ("20px")  + ";}")) : ((".GMOK10PCKI{padding-bottom:" + ("20px")  + ";}.GMOK10PCJI{display:" + ("block")  + ";}.GMOK10PCII{float:" + ("left")  + ";}.GMOK10PCLI{padding-right:" + ("20px")  + ";}"));
      }
      public java.lang.String floatLeft(){
        return "GMOK10PCII";
      }
      public java.lang.String newLine(){
        return "GMOK10PCJI";
      }
      public java.lang.String paddingButton(){
        return "GMOK10PCKI";
      }
      public java.lang.String paddingLabel(){
        return "GMOK10PCLI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@exercise.client.ui.contact.ContactListViewImpl_ContactListViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
