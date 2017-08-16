package sprint2.collections;

import sprint2.collections.interfaces.IDictionary;

import java.util.HashMap;
import java.util.Map;

public class PhoneDictionary implements IDictionary {

    private final Map<String, Long> phones = new HashMap<String, Long>();

    public PhoneDictionary() {
        fill();
    }

    public void add() {
        // TODO: impelementation
    }

    public int find(String sirname) {
        // TODO: impelementation
        return 0;
    }

    private void fill() {
        phones.put("Jones", generatePhones());
        phones.put("Hadson", generatePhones());
        phones.put("Aims", generatePhones());
        phones.put("Freeman", generatePhones());
        phones.put("Trudies", generatePhones());
        phones.put("Zigmunds", generatePhones());
    }

    private Long generatePhones() {
        // TODO: Реализовать генерацию номера телефона, т.е. номер из 11 цифр, начинающийся с 7
        return 0L;
    }
}
