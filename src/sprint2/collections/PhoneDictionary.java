package sprint2.collections;

import sprint2.collections.interfaces.IDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDictionary implements IDictionary {

    private final Map<String, ArrayList<Long>> phones = new HashMap<>();

    public PhoneDictionary() {
        fill();
    }

    public void add(String surname, Long number) {
        // находим телефоны по добавляемой фамилии либо получаем пустой лист
        ArrayList<Long> phonesList = find(surname);
        phonesList.add(number);
        phones.put(surname, phonesList);
    }

    public ArrayList<Long> find(String surname) {
        if (! phones.containsKey(surname)) {
            return new ArrayList<>();
        }

        return phones.get(surname);
    }

    private void fill() {
        String[] names = new String[] {"Jones", "Hadson", "Aims", "Freeman", "Trudies", "Zigmunds", "Jones"};

        for (String name : names) {
            add(name, generatePhone());
        }
    }

    // генерация номера телефона из 11 цифр, начинающийся с 7
    private Long generatePhone() {
        return 70000000000L + Math.round(Math.random() * 9999999999L);
    }

    /**
     * генерит массив для прогона теста на длину телефонов
     * @param amount кол-во телефонов для генерации
     * @return массив телефонов
     */
    public Long[] generateTestPhones(int amount) {
        Long[] phones = new Long[amount];
        for (int i = 0; i < amount; i++) {
            phones[i] = generatePhone();
        }
        return phones;
    }
}
