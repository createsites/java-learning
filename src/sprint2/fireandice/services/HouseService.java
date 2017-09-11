package sprint2.fireandice.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sprint2.fireandice.models.House;

public interface HouseService {
    @GET("houses/{id}")
    Call<House> getData(@Path("id") int id);
}
