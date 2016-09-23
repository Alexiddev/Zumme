package alexiddev.test.zumme.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import alexiddev.test.zumme.R;
import alexiddev.test.zumme.api.RatesApi;
import alexiddev.test.zumme.model.RequestItem;
import alexiddev.test.zumme.model.UserInfo;
import alexiddev.test.zumme.util.Util;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RatesActivity extends AppCompatActivity {


    private static final String SAVE_INSTANCE = "instance";
    private Context context;
    private TextView destination;
    private TextView isMobile;
    private ProgressBar progressBar;
    private ListRatesAdapter listRatesAdapter;
    private RecyclerView recyclerView;
    private UserInfo userInfo;
    private Button buttonGetPrices;
    private RequestItem requestItem = new RequestItem("usd", "english", "38096589875", "android", 45);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rates_list);
        context = this;
        initFields();
       if (savedInstanceState != null && !savedInstanceState.isEmpty()){
           userInfo = (UserInfo) savedInstanceState.get(SAVE_INSTANCE);
           setItemsToList(userInfo);
       }
    }

    public void getPrices(final View view) {

        progressBar.setVisibility(ProgressBar.VISIBLE);
        recyclerView.setVisibility(ProgressBar.GONE);
        buttonGetPrices.setClickable(false);

        RatesApi.getInstance().getRates(requestItem).enqueue(new Callback<UserInfo>() {
            @Override
            public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                userInfo = response.body();
                setItemsToList(response.body());
                hideProgressBar();
            }

            @Override
            public void onFailure(Call<UserInfo> call, Throwable t) {
                Util.showSnackBar(view, t.getMessage());
                if (userInfo != null) setItemsToList(userInfo);
                hideProgressBar();
            }
        });
    }

    private void setItemsToList(UserInfo currentUser) {
       if (!recyclerView.isShown()) recyclerView.setVisibility(View.VISIBLE);
        destination.setText(currentUser.getDestination());
        isMobile.setText(getResources().getString(R.string.is_mobile).concat(String.valueOf(currentUser.getIsMobile())));
        listRatesAdapter = new ListRatesAdapter(currentUser.getRates());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(listRatesAdapter);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (userInfo != null) outState.putParcelable(SAVE_INSTANCE, userInfo);
    }

    private void hideProgressBar(){
        progressBar.setVisibility(ProgressBar.GONE);
        buttonGetPrices.setClickable(true);
    }

    private void initFields() {
        progressBar = (ProgressBar) findViewById(R.id.loadProgressBar);
        recyclerView = (RecyclerView) findViewById(R.id.rates_list_recycler_view);
        destination = (TextView) findViewById(R.id.destination);
        isMobile = (TextView) findViewById(R.id.isMobile);
        buttonGetPrices = (Button) findViewById(R.id.buttonGetPrices);
    }
}

