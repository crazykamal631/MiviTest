package web.com.mivitestapp.di.modules;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import web.com.mivitestapp.di.scopes.ApplicationScope;

@Module
public abstract class AppContextModule {

    @ApplicationScope
    @Binds
    abstract Context bindContext(Application application);
}
