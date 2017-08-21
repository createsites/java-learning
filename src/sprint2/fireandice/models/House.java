package sprint2.fireandice.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class House {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("coatOfArms")
    @Expose
    private String coatOfArms;
    @SerializedName("words")
    @Expose
    private String words;
    @SerializedName("titles")
    @Expose
    private List<String> titles = null;
    @SerializedName("seats")
    @Expose
    private List<String> seats = null;
    @SerializedName("currentLord")
    @Expose
    private String currentLord;
    @SerializedName("heir")
    @Expose
    private String heir;
    @SerializedName("overlord")
    @Expose
    private String overlord;
    @SerializedName("founded")
    @Expose
    private String founded;
    @SerializedName("founder")
    @Expose
    private String founder;
    @SerializedName("diedOut")
    @Expose
    private String diedOut;
    @SerializedName("ancestralWeapons")
    @Expose
    private List<String> ancestralWeapons = null;
    @SerializedName("cadetBranches")
    @Expose
    private List<String> cadetBranches = null;
    @SerializedName("swornMembers")
    @Expose
    private List<String> swornMembers = null;

    @Override
    public String toString() {
        return "House {" + "\n" +
                "url : " + url + "\n" +
                "name : " + name + "\n" +
                "region : " + region + "\n" +
                "coatOfArms : " + coatOfArms + "\n" +
                "words : " + words + "\n" +
                "titles : " + titles + "\n" +
                "seats : " + seats + "\n" +
                "currentLord : " + currentLord + "\n" +
                "heir : " + heir + "\n" +
                "overlord : " + overlord + "\n" +
                "founded : " + founded + "\n" +
                "founder : " + founder + "\n" +
                "diedOut : " + diedOut + "\n" +
                "ancestralWeapons : " + ancestralWeapons + "\n" +
                "cadetBranches : " + cadetBranches + "\n" +
                "swornMembers : " + swornMembers + "\n" +
                '}';
    }
}
