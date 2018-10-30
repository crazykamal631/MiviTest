package web.com.mivitestapp.ui.detail;

public interface DetailContract {
    interface View {
        public void showAccDetails(String email, String name, String dob);

        void showSubscriptionDetails(int dataBalance, String expiryDate);

        void setProductDetails(String planName, String s, String s1, String s2);
    }

    interface Presenter {
        public void takeView(DetailContract.View view);

        public void dropView();

        public void loadData(String accId);

    }

    interface LoginModel {
        interface OnFinishedListener {
            void onFinished(boolean value);
        }

        public void doLogin(OnFinishedListener onFinishedListener, String email, String number);
    }
}
