package sprint2.fireandice.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Character {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("culture")
    @Expose
    private String culture;
    @SerializedName("born")
    @Expose
    private String born;
    @SerializedName("died")
    @Expose
    private String died;
    @SerializedName("titles")
    @Expose
    private List<String> titles = null;
    @SerializedName("aliases")
    @Expose
    private List<String> aliases = null;
    @SerializedName("father")
    @Expose
    private String father;
    @SerializedName("mother")
    @Expose
    private String mother;
    @SerializedName("spouse")
    @Expose
    private String spouse;
    @SerializedName("allegiances")
    @Expose
    private List<String> allegiances = null;
    @SerializedName("books")
    @Expose
    private List<String> books = null;
    @SerializedName("povBooks")
    @Expose
    private List<String> povBooks = null;
    @SerializedName("tvSeries")
    @Expose
    private List<String> tvSeries = null;
    @SerializedName("playedBy")
    @Expose
    private List<String> playedBy = null;

    @Override
    public String toString() {
        return "Character {" + "\n" +
                "url : " + url + "\n" +
                "name : " + name + "\n" +
                "gender : " + gender + "\n" +
                "culture : " + culture + "\n" +
                "born : " + born + "\n" +
                "died : " + died + "\n" +
                "titles : " + titles + "\n" +
                "aliases : " + aliases + "\n" +
                "father : " + father + "\n" +
                "mother : " + mother + "\n" +
                "spouse : " + spouse + "\n" +
                "allegiances : " + allegiances + "\n" +
                "books : " + books + "\n" +
                "povBooks : " + povBooks + "\n" +
                "tvSeries : " + tvSeries + "\n" +
                "playedBy : " + playedBy + "\n" +
                '}';
    }
}
