package web.com.mivitestapp.ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import web.com.mivitestapp.R;

public class DetailActivity extends DaggerAppCompatActivity implements DetailContract.View {

    private static final String TAG = "DetailActivity_mivi789";

    @Inject
    Context mContext;

    @Inject
    DetailContract.Presenter mDetailPresenter;

    @BindView(R.id.email)
    TextView mEmail;

    @BindView(R.id.firstName)
    TextView mFullName;

    @BindView(R.id.dob)
    TextView mDateOfBirth;

    @BindView(R.id.data_balance_value)
    TextView mDataBalanceValue;

    @BindView(R.id.expiryDateValue)
    TextView mExpiryDateValue;

    @BindView(R.id.productNameValue)
    TextView mProductNameValue;

    @BindView(R.id.priceValue)
    TextView mPriceValue;

    @BindView(R.id.unTalkValue)
    TextView mUnTalkValue;

    @BindView(R.id.unTextValue)
    TextView mUnTextValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        mDetailPresenter.takeView(this);
        mDetailPresenter.loadData("100");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDetailPresenter.dropView();
    }

    @Override
    public void showAccDetails(String email, String name, String dob) {
        mEmail.setText(email);
        mFullName.setText(name);
        mDateOfBirth.setText(dob);
    }

    @Override
    public void showSubscriptionDetails(int dataBalance, String expiryDate) {
        mDataBalanceValue.setText(String.valueOf(dataBalance));
        mExpiryDateValue.setText(expiryDate);
    }

    @Override
    public void setProductDetails(String planName, String price, String isUnlimitedTalk,
                                  String isUnlimitedText) {
        mProductNameValue.setText(planName);

        mPriceValue.setText(price);

        mUnTalkValue.setText(isUnlimitedTalk);

        mUnTextValue.setText(isUnlimitedText);
    }
}
