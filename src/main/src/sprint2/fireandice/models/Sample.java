package sprint2.fireandice.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aleksejskrobot on 15.08.17.
 */
public class Sample {

    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("phrase")
    @Expose
    public String phrase;
    @SerializedName("lexical_reduplication")
    @Expose
    public String lexicalReduplication;

    @Override
    public String toString() {
        return "Sample{" +
                "slug=" + slug +
                ", phrase='" + phrase + '\'' +
                ", lexicalReduplication='" + lexicalReduplication + '\'' +
                '}';
    }
}
