package web.com.mivitestapp.ui.detail;

import android.content.Context;

import javax.inject.Inject;

import web.com.mivitestapp.InitApplication;
import web.com.mivitestapp.server.pojo.Response;
import web.com.mivitestapp.server.pojo.ResponseIncluded;
import web.com.mivitestapp.server.pojo.ResponseIncludedAttributes;

public class DetailPresenter implements DetailContract.Presenter {
    DetailContract.View mView;

    @Inject
    Context mContext;

    @Inject
    public DetailPresenter() {
    }

    @Override
    public void takeView(DetailContract.View view) {
        this.mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }

    @Override
    public void loadData(String accId) {
        getData(accId);
    }

    private void getData(String accId) {
        Response response = InitApplication.getApplication(mContext).getUserData(accId);
        String email = response.getData().getAttributes().getEmailAddress();
        String title = response.getData().getAttributes().getTitle();
        String firstName = response.getData().getAttributes().getFirstName();
        String lastName = response.getData().getAttributes().getLastName();
        String fullName = title + " " + firstName + " " + lastName;
        String dob = response.getData().getAttributes().getDateOfBirth();
        mView.showAccDetails(email, fullName, dob);

        ResponseIncluded[] array = response.getIncluded();
        for (ResponseIncluded responseIncluded : array) {
            String type = responseIncluded.getType();
            ResponseIncludedAttributes responseIncludedAttributes = responseIncluded.getAttributes();
            if(type.equalsIgnoreCase("subscriptions")){
                int dataBalance = responseIncludedAttributes.getIncludedDataBalance();
                String expiryDate = responseIncludedAttributes.getExpiryDate();
                mView.showSubscriptionDetails(dataBalance, expiryDate);
            }else if(type.equalsIgnoreCase("products")){
                String planName = responseIncludedAttributes.getName();
                int planPrice = responseIncludedAttributes.getPrice();
                boolean isUnlimitedText = responseIncludedAttributes.isUnlimitedText();
                boolean isUnlimitedTalk = responseIncludedAttributes.isUnlimitedTalk();
                mView.setProductDetails(planName, String.valueOf(planPrice),
                        String.valueOf(isUnlimitedTalk), String.valueOf(isUnlimitedText));
            }
        }

    }
}
