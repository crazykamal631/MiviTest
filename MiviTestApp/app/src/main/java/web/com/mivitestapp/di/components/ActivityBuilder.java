package web.com.mivitestapp.di.components;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import web.com.mivitestapp.di.scopes.ActivityScope;
import web.com.mivitestapp.ui.detail.DetailActivity;
import web.com.mivitestapp.ui.login.LoginActivity;
import web.com.mivitestapp.ui.login.MainActivityModule;
import web.com.mivitestapp.ui.login.SplashActivity;

@Module
abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract LoginActivity bindMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract DetailActivity bindDetailActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract SplashActivity bindSplashActivity();
}
