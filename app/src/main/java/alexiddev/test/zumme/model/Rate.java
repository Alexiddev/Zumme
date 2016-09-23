
package alexiddev.test.zumme.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static alexiddev.test.zumme.R.id.destination;
import static alexiddev.test.zumme.R.id.isMobile;


public class Rate  implements Parcelable{

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(registrationBonus);
        dest.writeString(messengerName);
        dest.writeDouble(connectionFee);
        dest.writeDouble(smsPrice);
        dest.writeDouble(rating);
        dest.writeDouble(callPrice);
        dest.writeInt(numberOfComments);
        dest.writeString(googleStoreLink);
    }

    public static final Parcelable.Creator<Rate> CREATOR = new Parcelable.Creator<Rate>() {
        public Rate createFromParcel(Parcel in) {
            return new Rate(in);
        }
        public Rate[] newArray(int size) {
            return new Rate[size];
        }
    };

    public Rate(Parcel in) {
        registrationBonus = in.readString();
        messengerName = in.readString();
        connectionFee = in.readDouble();
        smsPrice = in.readDouble();
        rating = in.readDouble();
        callPrice = in.readDouble();
        numberOfComments = in.readInt();
        googleStoreLink = in.readString();
    }
}
