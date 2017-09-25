package sprint2.fireandice;

import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import sprint2.fireandice.models.Book;
import sprint2.fireandice.models.Character;
import sprint2.fireandice.models.House;
import sprint2.fireandice.services.BookService;
import sprint2.fireandice.services.CharacterService;
import sprint2.fireandice.services.HouseService;

import java.io.IOException;

public class RemoteRepository {

    private final String API_URL = "https://anapioficeandfire.com/api/";

    private Retrofit retrofit;

    public RemoteRepository() {
        retrofit = new Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }

    public Book book(int id) {

        try {
            Response<Book> response = retrofit.create(BookService.class).getData(id).execute();
            return response.body();

        } catch(IOException | NullPointerException $e) {
            return new Book();
        }
    }

    public Character character(int id) {

        try {
            Response<Character> response = retrofit.create(CharacterService.class).getData(id).execute();
            return response.body();
        } catch(IOException | NullPointerException $e) {
            return new Character();
        }
    }

    public House house(int id) {

        try {
            Response<House> response = retrofit.create(HouseService.class).getData(id).execute();
            return response.body();
        } catch(IOException | NullPointerException $e) {
            return new House();
        }
    }
}
