package alexiddev.test.zumme.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import alexiddev.test.zumme.R;
import alexiddev.test.zumme.model.Rate;

/**
 * Created by v.aleksandrenko on 22.09.2016.
 */

public class ListRatesAdapter extends RecyclerView.Adapter<ListRatesAdapter.ListItemsHolder> {


    private List<Rate> usersInfoItems;

    public class ListItemsHolder extends RecyclerView.ViewHolder {

        public TextView registrationBonus;
        public TextView messengerName;
        public TextView connectionFee;
        public TextView smsPrice;
        public TextView rating;
        public TextView callPrice;
        public TextView numberOfComments;
        public TextView googleStoreLink;

        public ListItemsHolder(View view) {
            super(view);
            registrationBonus = (TextView) view.findViewById(R.id.registration_bonus);
            messengerName = (TextView) view.findViewById(R.id.messenger_name);
            connectionFee = (TextView) view.findViewById(R.id.connection_fee);
            smsPrice = (TextView) view.findViewById(R.id.sms_price);
            rating = (TextView) view.findViewById(R.id.rating);
            callPrice = (TextView) view.findViewById(R.id.call_price);
            numberOfComments = (TextView) view.findViewById(R.id.number_of_comments);
            googleStoreLink = (TextView) view.findViewById(R.id.google_store_link);
        }
    }

    public ListRatesAdapter(List<Rate> usersRateItems) {
        this.usersInfoItems = usersRateItems;
    }

    @Override
    public ListItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rate, parent, false);
        return new ListItemsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListRatesAdapter.ListItemsHolder holder, int position) {
        Rate rate = usersInfoItems.get(position);
        holder.registrationBonus.setText(rate.getRegistrationBonus());
        holder.messengerName.setText(rate.getMessengerName());
        holder.connectionFee.setText(String.valueOf(rate.getConnectionFee()));
        holder.smsPrice.setText(String.valueOf(rate.getSmsPrice()));
        holder.rating.setText(String.valueOf(rate.getRating()));
        holder.callPrice.setText(String.valueOf(rate.getCallPrice()));
        holder.numberOfComments.setText(String.valueOf(rate.getNumberOfComments()));
        holder.googleStoreLink.setText(rate.getGoogleStoreLink());
    }

    @Override
    public int getItemCount() {
        return usersInfoItems.size();
    }

}