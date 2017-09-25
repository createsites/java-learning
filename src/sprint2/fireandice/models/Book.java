package sprint2.fireandice.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import sprint2.fireandice.Repository;

import java.util.List;

public class Book {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("authors")
    @Expose
    private List<String> authors = null;
    @SerializedName("numberOfPages")
    @Expose
    private int numberOfPages;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("mediaType")
    @Expose
    private String mediaType;
    @SerializedName("released")
    @Expose
    private String released;
    /*@SerializedName("characters")
    @Expose
    private List<String> characters = null;*/

    private Character character;

    @SerializedName("povCharacters")
    @Expose
    private List<String> povCharacters = null;

    public Book() {
        character = new GsonBuilder().create().fromJson(Repository.characters(1), Character.class);
    }

    @Override
    public String toString() {
        return "Book {" + "\n" +
                "url : " + url + "\n" +
                "name : " + name + "\n" +
                "isbn : " + isbn + "\n" +
                "authors : " + authors + "\n" +
                "numberOfPages : " + numberOfPages + "\n" +
                "publisher : " + publisher + "\n" +
                "country : " + country + "\n" +
                "mediaType : " + mediaType + "\n" +
                "released : " + released + "\n" +
                "character : " + character + "\n" +
                "povCharacters : " + povCharacters + "\n" +
                '}';
    }
}
