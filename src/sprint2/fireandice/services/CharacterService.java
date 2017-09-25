package sprint2.fireandice.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sprint2.fireandice.models.Character;

public interface CharacterService {
    @GET("characters/{id}")
    Call<Character> getData(@Path("id") int id);
}
