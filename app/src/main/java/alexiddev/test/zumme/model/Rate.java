
package alexiddev.test.zumme.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Rate {

    @SerializedName("registration_bonus")
    @Expose
    private String registrationBonus;
    @SerializedName("messenger_name")
    @Expose
    private String messengerName;
    @SerializedName("connection_fee")
    @Expose
    private Double connectionFee;
    @SerializedName("sms_price")
    @Expose
    private Double smsPrice;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("call_price")
    @Expose
    private Double callPrice;
    @SerializedName("number_of_comments")
    @Expose
    private Integer numberOfComments;
    @SerializedName("google_store_link")
    @Expose
    private String googleStoreLink;

    /**
     * 
     * @return
     *     The registrationBonus
     */
    public String getRegistrationBonus() {
        return registrationBonus;
    }

    /**
     * 
     * @param registrationBonus
     *     The registration_bonus
     */
    public void setRegistrationBonus(String registrationBonus) {
        this.registrationBonus = registrationBonus;
    }

    /**
     * 
     * @return
     *     The messengerName
     */
    public String getMessengerName() {
        return messengerName;
    }

    /**
     * 
     * @param messengerName
     *     The messenger_name
     */
    public void setMessengerName(String messengerName) {
        this.messengerName = messengerName;
    }

    /**
     * 
     * @return
     *     The connectionFee
     */
    public Double getConnectionFee() {
        return connectionFee;
    }

    /**
     * 
     * @param connectionFee
     *     The connection_fee
     */
    public void setConnectionFee(Double connectionFee) {
        this.connectionFee = connectionFee;
    }

    /**
     * 
     * @return
     *     The smsPrice
     */
    public Double getSmsPrice() {
        return smsPrice;
    }

    /**
     * 
     * @param smsPrice
     *     The sms_price
     */
    public void setSmsPrice(Double smsPrice) {
        this.smsPrice = smsPrice;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The callPrice
     */
    public Double getCallPrice() {
        return callPrice;
    }

    /**
     * 
     * @param callPrice
     *     The call_price
     */
    public void setCallPrice(Double callPrice) {
        this.callPrice = callPrice;
    }

    /**
     * 
     * @return
     *     The numberOfComments
     */
    public Integer getNumberOfComments() {
        return numberOfComments;
    }

    /**
     * 
     * @param numberOfComments
     *     The number_of_comments
     */
    public void setNumberOfComments(Integer numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    /**
     * 
     * @return
     *     The googleStoreLink
     */
    public String getGoogleStoreLink() {
        return googleStoreLink;
    }

    /**
     * 
     * @param googleStoreLink
     *     The google_store_link
     */
    public void setGoogleStoreLink(String googleStoreLink) {
        this.googleStoreLink = googleStoreLink;
    }

}
