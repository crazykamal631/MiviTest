package web.com.mivitestapp.server.pojo;

import com.google.gson.annotations.SerializedName;

public class ResponseDataAttributes {
    @SerializedName("first-name")
    private String firstName;

    @SerializedName("last-name")
    private String lastName;

    @SerializedName("next-billing-date")
    private Object nextBillingDate;

    @SerializedName("email-address")
    private String emailAddress;

    @SerializedName("email-address-verified")
    private boolean emailAddressVerified;

    @SerializedName("contact-number")
    private String contactNumber;

    @SerializedName("email-subscription-status")
    private boolean emailSubscriptionStatus;

    @SerializedName("date-of-birth")
    private String dateOfBirth;

    @SerializedName("unbilled-charges")
    private Object unbilledCharges;

    private String title;

    @SerializedName("payment-type")
    private String paymentType;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getNextBillingDate() {
        return this.nextBillingDate;
    }

    public void setNextBillingDate(Object nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean getEmailAddressVerified() {
        return this.emailAddressVerified;
    }

    public void setEmailAddressVerified(boolean emailAddressVerified) {
        this.emailAddressVerified = emailAddressVerified;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean getEmailSubscriptionStatus() {
        return this.emailSubscriptionStatus;
    }

    public void setEmailSubscriptionStatus(boolean emailSubscriptionStatus) {
        this.emailSubscriptionStatus = emailSubscriptionStatus;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getUnbilledCharges() {
        return this.unbilledCharges;
    }

    public void setUnbilledCharges(Object unbilledCharges) {
        this.unbilledCharges = unbilledCharges;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
