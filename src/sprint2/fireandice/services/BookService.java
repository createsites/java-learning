package sprint2.fireandice.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sprint2.fireandice.models.Book;

import java.util.List;

public interface BookService {
    @GET("books/{id}")
    Call<Book> getData(@Path("id") int id);
}
