package exercise.client.ioc;

import com.google.gwt.core.client.GWT;

public class InjectorImpl implements exercise.client.ioc.Injector {
  public exercise.client.mvp.AppActivityMapper getActivityMapper() {
    return get_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$();
  }
  
  public exercise.client.mvp.AppPlaceFactory getAppPlaceFactory() {
    return get_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$();
  }
  
  public exercise.client.panel.ApplicationContainerPanel getApplicationContainerPanel() {
    return get_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$();
  }
  
  public com.google.gwt.event.shared.EventBus getEventBus() {
    return get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.google.gwt.place.shared.PlaceController getPlaceController() {
    return get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$();
  }
  
  
  /**
   * Binding for exercise.client.activity.contact.ContactListActivity declared at:
   *   Implicit binding for Key[type=exercise.client.activity.contact.ContactListActivity, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$(exercise.client.activity.contact.ContactListActivity injectee) {
    
  }
  
  private exercise.client.activity.contact.ContactListActivity exercise$client$activity$contact$ContactListActivity_ContactListActivity_methodInjection(com.google.gwt.event.shared.EventBus _0, exercise.client.ui.contact.ContactListViewImpl _1, com.google.gwt.place.shared.PlaceController _2, exercise.shared.AppServiceAsync _3, com.google.inject.Provider _4) {
    return new exercise.client.activity.contact.ContactListActivity(_0, _1, _2, _3, _4);
  }
  
  private exercise.client.activity.contact.ContactListActivity create_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$() {
    exercise.client.activity.contact.ContactListActivity result = exercise$client$activity$contact$ContactListActivity_ContactListActivity_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$(), get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$(), get_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$(), get_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$());
    memberInject_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.activity.contact.ContactListActivity declared at:
   *   Implicit binding for Key[type=exercise.client.activity.contact.ContactListActivity, annotation=[none]]
   */
  private exercise.client.activity.contact.ContactListActivity get_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$() {
    return create_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.event.shared.EventBus declared at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:15)
   */
  private com.google.gwt.event.shared.EventBus create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    return get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  private com.google.gwt.event.shared.EventBus singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:15)
   */
  private com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$;
  }
  
  
  /**
   * Binding for exercise.client.ui.contact.ContactListViewImpl declared at:
   *   Implicit binding for Key[type=exercise.client.ui.contact.ContactListViewImpl, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$(exercise.client.ui.contact.ContactListViewImpl injectee) {
    
  }
  
  private exercise.client.ui.contact.ContactListViewImpl create_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$() {
    Object created = GWT.create(exercise.client.ui.contact.ContactListViewImpl.class);
    assert created instanceof exercise.client.ui.contact.ContactListViewImpl;
    exercise.client.ui.contact.ContactListViewImpl result = (exercise.client.ui.contact.ContactListViewImpl) created;
    
    memberInject_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.ui.contact.ContactListViewImpl declared at:
   *   Implicit binding for Key[type=exercise.client.ui.contact.ContactListViewImpl, annotation=[none]]
   */
  private exercise.client.ui.contact.ContactListViewImpl get_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$() {
    return create_Key$type$exercise$client$ui$contact$ContactListViewImpl$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.inject.Provider<exercise.client.place.ContactListPlace> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<exercise.client.place.ContactListPlace>, annotation=[none]]
   */
  private com.google.inject.Provider<exercise.client.place.ContactListPlace> create_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$() {
    return new com.google.inject.Provider<exercise.client.place.ContactListPlace>() { 
      public exercise.client.place.ContactListPlace get() { 
        return get_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$();
      }
    };
  }
  
  
  /**
   * Binding for com.google.inject.Provider<exercise.client.place.ContactListPlace> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<exercise.client.place.ContactListPlace>, annotation=[none]]
   */
  private com.google.inject.Provider<exercise.client.place.ContactListPlace> get_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.activity.contact.ContactDetailActivity declared at:
   *   Implicit binding for Key[type=exercise.client.activity.contact.ContactDetailActivity, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$(exercise.client.activity.contact.ContactDetailActivity injectee) {
    
  }
  
  private exercise.client.activity.contact.ContactDetailActivity exercise$client$activity$contact$ContactDetailActivity_ContactDetailActivity_methodInjection(com.google.gwt.event.shared.EventBus _0, exercise.client.ui.contact.ContactDetailViewImpl _1, com.google.gwt.place.shared.PlaceController _2, exercise.shared.AppServiceAsync _3, com.google.inject.Provider _4) {
    return new exercise.client.activity.contact.ContactDetailActivity(_0, _1, _2, _3, _4);
  }
  
  private exercise.client.activity.contact.ContactDetailActivity create_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$() {
    exercise.client.activity.contact.ContactDetailActivity result = exercise$client$activity$contact$ContactDetailActivity_ContactDetailActivity_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$(), get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$(), get_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$(), get_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$());
    memberInject_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.activity.contact.ContactDetailActivity declared at:
   *   Implicit binding for Key[type=exercise.client.activity.contact.ContactDetailActivity, annotation=[none]]
   */
  private exercise.client.activity.contact.ContactDetailActivity get_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$() {
    return create_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.panel.ApplicationContainerPanel declared at:
   *   Implicit binding for Key[type=exercise.client.panel.ApplicationContainerPanel, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$(exercise.client.panel.ApplicationContainerPanel injectee) {
    
  }
  
  private exercise.client.panel.ApplicationContainerPanel exercise$client$panel$ApplicationContainerPanel_ApplicationContainerPanel_methodInjection() {
    return new exercise.client.panel.ApplicationContainerPanel();
  }
  
  private exercise.client.panel.ApplicationContainerPanel create_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$() {
    exercise.client.panel.ApplicationContainerPanel result = exercise$client$panel$ApplicationContainerPanel_ApplicationContainerPanel_methodInjection();
    memberInject_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$(result);
    return result;
  }
  
  private exercise.client.panel.ApplicationContainerPanel singleton_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=exercise.client.panel.ApplicationContainerPanel, annotation=[none]]
   */
  private exercise.client.panel.ApplicationContainerPanel get_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$() {
    if (singleton_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$ == null) {
      singleton_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$ = create_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$();
    }
    return singleton_Key$type$exercise$client$panel$ApplicationContainerPanel$_annotation$$none$$;
  }
  
  
  /**
   * Binding for exercise.client.mvp.AppActivityMapper declared at:
   *   Implicit binding for Key[type=exercise.client.mvp.AppActivityMapper, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$(exercise.client.mvp.AppActivityMapper injectee) {
    
  }
  
  private exercise.client.mvp.AppActivityMapper create_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$() {
    Object created = GWT.create(exercise.client.mvp.AppActivityMapper.class);
    assert created instanceof exercise.client.mvp.AppActivityMapper;
    exercise.client.mvp.AppActivityMapper result = (exercise.client.mvp.AppActivityMapper) created;
    
    memberInject_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.mvp.AppActivityMapper declared at:
   *   Implicit binding for Key[type=exercise.client.mvp.AppActivityMapper, annotation=[none]]
   */
  private exercise.client.mvp.AppActivityMapper get_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$() {
    return create_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.place.shared.PlaceController declared at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:16)
   */
  private com.google.gwt.place.shared.PlaceController create_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$() {
    return get_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$();
  }
  
  private com.google.gwt.place.shared.PlaceController singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:16)
   */
  private com.google.gwt.place.shared.PlaceController get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ = create_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactDetailPlace$Tokenizer declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactDetailPlace$Tokenizer, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$(exercise.client.place.ContactDetailPlace.Tokenizer injectee) {
    
  }
  
  private exercise.client.place.ContactDetailPlace.Tokenizer exercise$client$place$ContactDetailPlace$Tokenizer_Tokenizer_methodInjection(com.google.inject.Provider _0) {
    return new exercise.client.place.ContactDetailPlace.Tokenizer(_0);
  }
  
  private exercise.client.place.ContactDetailPlace.Tokenizer create_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$() {
    exercise.client.place.ContactDetailPlace.Tokenizer result = exercise$client$place$ContactDetailPlace$Tokenizer_Tokenizer_methodInjection(get_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$());
    memberInject_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactDetailPlace$Tokenizer declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactDetailPlace$Tokenizer, annotation=[none]]
   */
  private exercise.client.place.ContactDetailPlace.Tokenizer get_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$() {
    return create_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.activity.shared.ActivityMapper declared at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:20)
   */
  private com.google.gwt.activity.shared.ActivityMapper create_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$() {
    return get_Key$type$exercise$client$mvp$AppActivityMapper$_annotation$$none$$();
  }
  
  private com.google.gwt.activity.shared.ActivityMapper singleton_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:20)
   */
  private com.google.gwt.activity.shared.ActivityMapper get_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$ = create_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$activity$shared$ActivityMapper$_annotation$$none$$;
  }
  
  
  /**
   * Binding for exercise.shared.AppServiceAsync declared at:
   *   Implicit binding for Key[type=exercise.shared.AppServiceAsync, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$(exercise.shared.AppServiceAsync injectee) {
    
  }
  
  private exercise.shared.AppServiceAsync create_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$() {
    Object created = GWT.create(exercise.shared.AppService.class);
    assert created instanceof exercise.shared.AppServiceAsync;
    exercise.shared.AppServiceAsync result = (exercise.shared.AppServiceAsync) created;
    
    memberInject_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$(result);
    return result;
  }
  
  private exercise.shared.AppServiceAsync singleton_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   Implicit binding for Key[type=exercise.shared.AppServiceAsync, annotation=[none]]
   */
  private exercise.shared.AppServiceAsync get_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$() {
    if (singleton_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$ == null) {
      singleton_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$ = create_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$();
    }
    return singleton_Key$type$exercise$shared$AppServiceAsync$_annotation$$none$$;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactDetailPlace declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactDetailPlace, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$(exercise.client.place.ContactDetailPlace injectee) {
    
  }
  
  private exercise.client.place.ContactDetailPlace exercise$client$place$ContactDetailPlace_ContactDetailPlace_methodInjection(exercise.client.activity.contact.ContactDetailActivity _0) {
    return new exercise.client.place.ContactDetailPlace(_0);
  }
  
  private exercise.client.place.ContactDetailPlace create_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$() {
    exercise.client.place.ContactDetailPlace result = exercise$client$place$ContactDetailPlace_ContactDetailPlace_methodInjection(get_Key$type$exercise$client$activity$contact$ContactDetailActivity$_annotation$$none$$());
    memberInject_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactDetailPlace declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactDetailPlace, annotation=[none]]
   */
  private exercise.client.place.ContactDetailPlace get_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$() {
    return create_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.SimpleEventBus create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.ui.contact.ContactDetailViewImpl declared at:
   *   Implicit binding for Key[type=exercise.client.ui.contact.ContactDetailViewImpl, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$(exercise.client.ui.contact.ContactDetailViewImpl injectee) {
    
  }
  
  private exercise.client.ui.contact.ContactDetailViewImpl create_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$() {
    Object created = GWT.create(exercise.client.ui.contact.ContactDetailViewImpl.class);
    assert created instanceof exercise.client.ui.contact.ContactDetailViewImpl;
    exercise.client.ui.contact.ContactDetailViewImpl result = (exercise.client.ui.contact.ContactDetailViewImpl) created;
    
    memberInject_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.ui.contact.ContactDetailViewImpl declared at:
   *   Implicit binding for Key[type=exercise.client.ui.contact.ContactDetailViewImpl, annotation=[none]]
   */
  private exercise.client.ui.contact.ContactDetailViewImpl get_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$() {
    return create_Key$type$exercise$client$ui$contact$ContactDetailViewImpl$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.place.ContactListPlace$Tokenizer declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactListPlace$Tokenizer, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$(exercise.client.place.ContactListPlace.Tokenizer injectee) {
    
  }
  
  private exercise.client.place.ContactListPlace.Tokenizer exercise$client$place$ContactListPlace$Tokenizer_Tokenizer_methodInjection(com.google.inject.Provider _0) {
    return new exercise.client.place.ContactListPlace.Tokenizer(_0);
  }
  
  private exercise.client.place.ContactListPlace.Tokenizer create_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$() {
    exercise.client.place.ContactListPlace.Tokenizer result = exercise$client$place$ContactListPlace$Tokenizer_Tokenizer_methodInjection(get_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$());
    memberInject_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactListPlace$Tokenizer declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactListPlace$Tokenizer, annotation=[none]]
   */
  private exercise.client.place.ContactListPlace.Tokenizer get_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$() {
    return create_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.mvp.InjectablePlaceController declared at:
   *   Implicit binding for Key[type=exercise.client.mvp.InjectablePlaceController, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$(exercise.client.mvp.InjectablePlaceController injectee) {
    
  }
  
  private exercise.client.mvp.InjectablePlaceController exercise$client$mvp$InjectablePlaceController_InjectablePlaceController_methodInjection(com.google.gwt.event.shared.EventBus _0) {
    return new exercise.client.mvp.InjectablePlaceController(_0);
  }
  
  private exercise.client.mvp.InjectablePlaceController create_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$() {
    exercise.client.mvp.InjectablePlaceController result = exercise$client$mvp$InjectablePlaceController_InjectablePlaceController_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.mvp.InjectablePlaceController declared at:
   *   Implicit binding for Key[type=exercise.client.mvp.InjectablePlaceController, annotation=[none]]
   */
  private exercise.client.mvp.InjectablePlaceController get_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$() {
    return create_Key$type$exercise$client$mvp$InjectablePlaceController$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.inject.Provider<exercise.client.place.ContactDetailPlace> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<exercise.client.place.ContactDetailPlace>, annotation=[none]]
   */
  private com.google.inject.Provider<exercise.client.place.ContactDetailPlace> create_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$() {
    return new com.google.inject.Provider<exercise.client.place.ContactDetailPlace>() { 
      public exercise.client.place.ContactDetailPlace get() { 
        return get_Key$type$exercise$client$place$ContactDetailPlace$_annotation$$none$$();
      }
    };
  }
  
  
  /**
   * Binding for com.google.inject.Provider<exercise.client.place.ContactDetailPlace> declared at:
   *   Implicit binding for Key[type=com.google.inject.Provider<exercise.client.place.ContactDetailPlace>, annotation=[none]]
   */
  private com.google.inject.Provider<exercise.client.place.ContactDetailPlace> get_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.place.ContactListPlace declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactListPlace, annotation=[none]]
   */
  private void memberInject_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$(exercise.client.place.ContactListPlace injectee) {
    
  }
  
  private exercise.client.place.ContactListPlace exercise$client$place$ContactListPlace_ContactListPlace_methodInjection(exercise.client.activity.contact.ContactListActivity _0) {
    return new exercise.client.place.ContactListPlace(_0);
  }
  
  private exercise.client.place.ContactListPlace create_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$() {
    exercise.client.place.ContactListPlace result = exercise$client$place$ContactListPlace_ContactListPlace_methodInjection(get_Key$type$exercise$client$activity$contact$ContactListActivity$_annotation$$none$$());
    memberInject_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for exercise.client.place.ContactListPlace declared at:
   *   Implicit binding for Key[type=exercise.client.place.ContactListPlace, annotation=[none]]
   */
  private exercise.client.place.ContactListPlace get_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$() {
    return create_Key$type$exercise$client$place$ContactListPlace$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for exercise.client.mvp.AppPlaceFactory declared at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:17)
   */
  private native void exercise$client$mvp$AppPlaceFactory_contactListPlaceTokenizer_fieldInjection(exercise.client.mvp.AppPlaceFactory injectee, exercise.client.place.ContactListPlace.Tokenizer value) /*-{
    injectee.@exercise.client.mvp.AppPlaceFactory::contactListPlaceTokenizer = value;
  }-*/;
  
  private native void exercise$client$mvp$AppPlaceFactory_contactListPlaceProvider_fieldInjection(exercise.client.mvp.AppPlaceFactory injectee, com.google.inject.Provider value) /*-{
    injectee.@exercise.client.mvp.AppPlaceFactory::contactListPlaceProvider = value;
  }-*/;
  
  private native void exercise$client$mvp$AppPlaceFactory_contactDetailPlaceProvider_fieldInjection(exercise.client.mvp.AppPlaceFactory injectee, com.google.inject.Provider value) /*-{
    injectee.@exercise.client.mvp.AppPlaceFactory::contactDetailPlaceProvider = value;
  }-*/;
  
  private native void exercise$client$mvp$AppPlaceFactory_contactDetailPlaceTokenizer_fieldInjection(exercise.client.mvp.AppPlaceFactory injectee, exercise.client.place.ContactDetailPlace.Tokenizer value) /*-{
    injectee.@exercise.client.mvp.AppPlaceFactory::contactDetailPlaceTokenizer = value;
  }-*/;
  
  private void memberInject_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$(exercise.client.mvp.AppPlaceFactory injectee) {
    exercise$client$mvp$AppPlaceFactory_contactListPlaceTokenizer_fieldInjection(injectee, get_Key$type$exercise$client$place$ContactListPlace$Tokenizer$_annotation$$none$$());
    exercise$client$mvp$AppPlaceFactory_contactListPlaceProvider_fieldInjection(injectee, get_Key$type$com$google$inject$Provider$exercise$client$place$ContactListPlace$$_annotation$$none$$());
    exercise$client$mvp$AppPlaceFactory_contactDetailPlaceProvider_fieldInjection(injectee, get_Key$type$com$google$inject$Provider$exercise$client$place$ContactDetailPlace$$_annotation$$none$$());
    exercise$client$mvp$AppPlaceFactory_contactDetailPlaceTokenizer_fieldInjection(injectee, get_Key$type$exercise$client$place$ContactDetailPlace$Tokenizer$_annotation$$none$$());
    
  }
  
  private exercise.client.mvp.AppPlaceFactory create_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$() {
    Object created = GWT.create(exercise.client.mvp.AppPlaceFactory.class);
    assert created instanceof exercise.client.mvp.AppPlaceFactory;
    exercise.client.mvp.AppPlaceFactory result = (exercise.client.mvp.AppPlaceFactory) created;
    
    memberInject_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$(result);
    return result;
  }
  
  private exercise.client.mvp.AppPlaceFactory singleton_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   exercise.client.ioc.InjectionModule.configure(InjectionModule.java:17)
   */
  private exercise.client.mvp.AppPlaceFactory get_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$() {
    if (singleton_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$ == null) {
      singleton_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$ = create_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$();
    }
    return singleton_Key$type$exercise$client$mvp$AppPlaceFactory$_annotation$$none$$;
  }
  
  public InjectorImpl() {
    
  }
  
}
