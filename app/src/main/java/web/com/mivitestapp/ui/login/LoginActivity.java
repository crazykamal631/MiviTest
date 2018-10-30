package web.com.mivitestapp.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;
import web.com.mivitestapp.R;

public class LoginActivity extends DaggerAppCompatActivity implements LoginContract.View {

    private static final String TAG = "LoginActivity_mivi789";

    @BindView(R.id.email)
    EditText mEmail;

    @BindView(R.id.password)
    EditText mContactNumber;

    @BindView(R.id.error_msg)
    TextView mErrorMsg;

    @Inject
    LoginContract.Presenter mPresenter;

    @Inject
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.takeView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.dropView();
    }

    @OnClick(R.id.btnLogin)
    void doLogin() {
        String email = mEmail.getText().toString();
        String contactNumber = mContactNumber.getText().toString();
        mPresenter.login(email, contactNumber);
    }

    @Override
    public void loginResult(String value) {
        Toast.makeText(mContext, "Login Success", Toast.LENGTH_SHORT).show();
    }



    @Override
    public void loginError(String value) {
        mErrorMsg.setText(value);
    }

    @Override
    public void loadDetailView(Intent intent) {
        startActivity(intent);
        mEmail.setText("");
        mContactNumber.setText("");
    }
}
