package web.com.mivitestapp.di.components;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;
import web.com.mivitestapp.InitApplication;
import web.com.mivitestapp.di.modules.AppContextModule;
import web.com.mivitestapp.di.scopes.ApplicationScope;

@ApplicationScope
@Component(modules = {
        ActivityBuilder.class,
        AndroidSupportInjectionModule.class,
        AppContextModule.class
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {
    void inject(InitApplication initApplication);

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
