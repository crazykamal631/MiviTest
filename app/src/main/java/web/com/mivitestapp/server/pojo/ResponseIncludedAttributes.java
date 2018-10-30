package web.com.mivitestapp.server.pojo;

import com.google.gson.annotations.SerializedName;

public class ResponseIncludedAttributes {
    @SerializedName("data-usage-threshold")
    private boolean dataUsageThreshold;

    @SerializedName("credit-expiry")
    private String creditExpiry;

    private String msn;
    private int credit;

    @SerializedName("included-data-balance")
    private int includedDataBalance;

    @SerializedName("included-credit-balance")
    private int includedCreditBalance;

    @SerializedName("included-rollover-credit-balance")
    private int includedRolloverCreditBalance;

    @SerializedName("included-rollover-data-balance")
    private int includedRolloverDataBalance;

    @SerializedName("included-international-talk-balance")
    private int includedInternationalTalkBalance;

    @SerializedName("expiry-date")
    private String expiryDate;

    @SerializedName("auto-renewal")
    private boolean autoRenewal;

    @SerializedName("primary-subscription")
    private boolean primarySubscription;

    private String name;

    @SerializedName("included-data")
    private String includedData;

    @SerializedName("included-credit")
    private String includedCredit;

    @SerializedName("included-international-talk")
    private String includedInternationalTalk;

    @SerializedName("unlimited-text")
    private boolean unlimitedText;

    @SerializedName("unlimited-talk")
    private boolean unlimitedTalk;

    @SerializedName("unlimited-international-text")
    private boolean unlimitedInternationalText;

    @SerializedName("unlimited-international-talk")
    private boolean unlimitedInternationalTalk;

    private int price;


    public boolean isDataUsageThreshold() {
        return dataUsageThreshold;
    }

    public int getIncludedDataBalance() {
        return includedDataBalance;
    }

    public void setIncludedDataBalance(int includedDataBalance) {
        this.includedDataBalance = includedDataBalance;
    }

    public int getIncludedCreditBalance() {
        return includedCreditBalance;
    }

    public void setIncludedCreditBalance(int includedCreditBalance) {
        this.includedCreditBalance = includedCreditBalance;
    }

    public int getIncludedRolloverCreditBalance() {
        return includedRolloverCreditBalance;
    }

    public void setIncludedRolloverCreditBalance(int includedRolloverCreditBalance) {
        this.includedRolloverCreditBalance = includedRolloverCreditBalance;
    }

    public int getIncludedRolloverDataBalance() {
        return includedRolloverDataBalance;
    }

    public void setIncludedRolloverDataBalance(int includedRolloverDataBalance) {
        this.includedRolloverDataBalance = includedRolloverDataBalance;
    }

    public int getIncludedInternationalTalkBalance() {
        return includedInternationalTalkBalance;
    }

    public void setIncludedInternationalTalkBalance(int includedInternationalTalkBalance) {
        this.includedInternationalTalkBalance = includedInternationalTalkBalance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public boolean isPrimarySubscription() {
        return primarySubscription;
    }

    public void setPrimarySubscription(boolean primarySubscription) {
        this.primarySubscription = primarySubscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncludedData() {
        return includedData;
    }

    public void setIncludedData(String includedData) {
        this.includedData = includedData;
    }

    public String getIncludedCredit() {
        return includedCredit;
    }

    public void setIncludedCredit(String includedCredit) {
        this.includedCredit = includedCredit;
    }

    public String getIncludedInternationalTalk() {
        return includedInternationalTalk;
    }

    public void setIncludedInternationalTalk(String includedInternationalTalk) {
        this.includedInternationalTalk = includedInternationalTalk;
    }

    public boolean isUnlimitedText() {
        return unlimitedText;
    }

    public void setUnlimitedText(boolean unlimitedText) {
        this.unlimitedText = unlimitedText;
    }

    public boolean isUnlimitedTalk() {
        return unlimitedTalk;
    }

    public void setUnlimitedTalk(boolean unlimitedTalk) {
        this.unlimitedTalk = unlimitedTalk;
    }

    public boolean isUnlimitedInternationalText() {
        return unlimitedInternationalText;
    }

    public void setUnlimitedInternationalText(boolean unlimitedInternationalText) {
        this.unlimitedInternationalText = unlimitedInternationalText;
    }

    public boolean isUnlimitedInternationalTalk() {
        return unlimitedInternationalTalk;
    }

    public void setUnlimitedInternationalTalk(boolean unlimitedInternationalTalk) {
        this.unlimitedInternationalTalk = unlimitedInternationalTalk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getDataUsageThreshold() {
        return this.dataUsageThreshold;
    }

    public void setDataUsageThreshold(boolean dataUsageThreshold) {
        this.dataUsageThreshold = dataUsageThreshold;
    }

    public String getCreditExpiry() {
        return this.creditExpiry;
    }

    public void setCreditExpiry(String creditExpiry) {
        this.creditExpiry = creditExpiry;
    }

    public String getMsn() {
        return this.msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
