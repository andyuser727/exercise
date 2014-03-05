package exercise.client.ioc;

import exercise.client.mvp.*;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Singleton;

public class InjectionModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
        bind(PlaceController.class).to(InjectablePlaceController.class).in(Singleton.class);
        bind(AppPlaceFactory.class).in(Singleton.class);

        // bind the mapper
        bind(ActivityMapper.class).to(AppActivityMapper.class).in(Singleton.class);
    }


}