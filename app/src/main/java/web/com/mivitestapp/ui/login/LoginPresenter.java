package web.com.mivitestapp.ui.login;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;

public class LoginPresenter implements LoginContract.Presenter,
        LoginContract.LoginModel.OnFinishedListener {

    private LoginContract.View mView;

    private static final String WRONG_EMAIL = "Wrong email";

    private static final String WRONG_NUMBER = "Wrong number";

    private static final String WRONG_CREDENTIALS = "Wrong credentials";

    private static final String LOGIN_SUCCESS = "Login Success";

    @Inject
    LoginContract.LoginModel mModel;

    @Inject
    Context mContext;

    @Inject
    public LoginPresenter() {
    }

    @Override
    public void takeView(LoginContract.View view) {
        this.mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }

    @Override
    public void login(String email, String contactNumber) {
        if (email != null && email.trim().equals("")) {
            mView.loginError(WRONG_EMAIL);
            return;
        }

        if (contactNumber != null && contactNumber.trim().equals("")) {
            mView.loginError(WRONG_NUMBER);
            return;
        }

        mModel.doLogin(this, email, contactNumber);
    }

    @Override
    public void onFinished(boolean value) {
        if (value) {
            mView.loginResult(LOGIN_SUCCESS);
            Intent intent = new Intent();
            intent.setClass(mContext, SplashActivity.class);
            mView.loadDetailView(intent);
        } else {
            mView.loginError(WRONG_CREDENTIALS);
        }
    }
}
