package web.com.mivitestapp.ui.login;

import android.content.Context;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import web.com.mivitestapp.di.scopes.ActivityScope;
import web.com.mivitestapp.ui.detail.DetailContract;
import web.com.mivitestapp.ui.detail.DetailPresenter;

@Module
public abstract class MainActivityModule {
    @ActivityScope
    @Binds
    abstract LoginContract.Presenter provideLoginPresenter(LoginPresenter loginPresenter);

    @ActivityScope
    @Provides
    static LoginContract.LoginModel provideCategoryAdapter(Context context) {
        return new LoginModelImpl(context);
    }

    @ActivityScope
    @Binds
    abstract DetailContract.Presenter provideDetailPresenter(DetailPresenter detailPresenter);
}
