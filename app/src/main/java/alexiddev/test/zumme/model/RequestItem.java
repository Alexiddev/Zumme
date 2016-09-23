package alexiddev.test.zumme.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by v.aleksandrenko on 22.09.2016.
 */

public class RequestItem {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("user_id")
    @Expose
    private Integer userId;

    public RequestItem(String currency, String language, String phoneNumber, String platform, Integer userId) {
        this.currency = currency;
        this.language = language;
        this.phoneNumber = phoneNumber;
        this.platform = platform;
        this.userId = userId;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * @return
     * The phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     * The phone_number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     * The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     *
     * @param platform
     * The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     *
     * @return
     * The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}

