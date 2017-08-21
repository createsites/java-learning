package sprint2.fireandice.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import sprint2.fireandice.Repository;

import java.util.List;

public class Root {

    private Book books;
    private Character characters;
    private House houses;

    public Root() {
        Gson gson = new GsonBuilder().create();

        books = gson.fromJson(Repository.book(1), Book.class);
        characters = gson.fromJson(Repository.characters(1), Character.class);
        houses = gson.fromJson(Repository.houses(1), House.class);
    }

    @Override
    public String toString() {
        return "Root {" + "\n" +
                "books : " + books + "\n" +
                "characters : " + characters + "\n" +
                "houses : " + houses + "\n" +
                '}';
    }
}
