package alexiddev.test.zumme.api;

import alexiddev.test.zumme.model.RequestItem;
import alexiddev.test.zumme.model.UserInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by v.aleksandrenko on 22.09.2016.
 */

public interface RatesService {

        @POST("/api/v1/rates/get/bynumber")
        Call<UserInfo> getRates(@Body RequestItem requestItem);
}
