package sprint2.collections.interfaces;

import java.util.ArrayList;

public interface IDictionary {
    void add(String surname, Long number);
    ArrayList<Long> find(String surname);
}
