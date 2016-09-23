
package alexiddev.test.zumme.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserInfo implements Parcelable {

    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("isMobile")
    @Expose
    private Boolean isMobile;
    @SerializedName("rates")
    @Expose
    private List<Rate> rates = new ArrayList<>();

    /**
     * 
     * @return
     *     The destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The isMobile
     */
    public Boolean getIsMobile() {
        return isMobile;
    }

    /**
     * 
     * @param isMobile
     *     The isMobile
     */
    public void setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
    }

    /**
     * 
     * @return
     *     The rates
     */
    public List<Rate> getRates() {
        return rates;
    }

    /**
     * 
     * @param rates
     *     The rates
     */
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(destination);
        dest.writeByte((byte) (isMobile ? 1 : 0));
        dest.writeList(rates);
    }

    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        public UserInfo createFromParcel(Parcel in) {
            return new UserInfo(in);
        }
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };

    public UserInfo(Parcel in) {
        destination = in.readString();
        isMobile = in.readByte() != 0;
        in.readList(rates, null);
    }
}
