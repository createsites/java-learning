package sprint2.collections;

import sprint2.collections.interfaces.IViewer;
import sprint2.collections.interfaces.IDictionary;

public class Main {

    public static void main(String[] args) {

        // массив слов
        IViewer words = new ArrayIteratorViewer(
            new String[] {
                "ivanov", "petrov", "sidorov", "unique phrase", "employer", "employer", "employer", "unique phrase too", "ivanov", "petrov"
            }
        );
        System.out.println(words.resultToPrint());

        // телефонный справочник
        IDictionary dictionary = new PhoneDictionary();

        dictionary.add("Jones", 79089980808L);
        System.out.println(dictionary.find("Jones").toString());

    }

}
