package web.com.mivitestapp.ui.login;

import android.content.Intent;

public interface LoginContract {
    interface View {
        void loginResult(String value);

        void loginError(String value);

        void loadDetailView(Intent intent);
    }

    interface Presenter {
        public void takeView(LoginContract.View view);

        public void dropView();

        void login(String email, String contactNumber);
    }

    interface LoginModel {
        interface OnFinishedListener {
            void onFinished(boolean value);
        }

        public void doLogin(OnFinishedListener onFinishedListener, String email, String number);
    }
}
