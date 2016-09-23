package alexiddev.test.zumme.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by v.aleksandrenko on 22.09.2016.
 */

public class RatesApi {

    private static String BASE_URL = "https://zumme.net";
    private static RatesService service;
    private static  Retrofit retrofit;

    public static RatesService getInstance() {
        if (service == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(RatesService.class);
            return service;
        } else {
            return service;
        }
    }
}

