package web.com.mivitestapp.ui.login;

import android.content.Context;

import web.com.mivitestapp.InitApplication;

public class LoginModelImpl implements LoginContract.LoginModel {
    private Context mContext;

    LoginModelImpl(Context context) {
        this.mContext = context;
    }

    @Override
    public void doLogin(OnFinishedListener onFinishedListener, String email, String number) {
        InitApplication initApplication = InitApplication.getApplication(mContext);
        onFinishedListener.onFinished(initApplication.authenticateUser(email, number));
    }
}
