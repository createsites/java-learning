package sprint2.collections;

import sprint2.collections.interfaces.IViewer;
import java.util.*;

public class ArrayIteratorViewer implements IViewer {

    private final String[] words;
    private final StringBuilder builder = new StringBuilder();

    public ArrayIteratorViewer(String[] words) {
        this.words = words;
        buildResultString();
    }

    // Format you can see in tests
    public String resultToPrint() {
        return builder.toString();
    }

    /**
     * @return Map с повторяющимися словами и их количеством
     */
    private Map<String, Integer> countWords() {
        Map<String, Integer> duplicateWords = new TreeMap<>();
        for (String word : words) {
            // кладем в мап слово и счетчик увеличиваем на один
            duplicateWords.put(word, duplicateWords.getOrDefault(word, 0) + 1);
        }

        return duplicateWords;
    }

    /**
     * формирует результирующую строку
     */
    private void buildResultString() {
        builder.append("repeated:");
        // считаем кол-во вхождений для всех слов
        Map<String, Integer> duplicateWords = countWords();
        // формируем массив строк "дублирующееся_слово=кол-во_повторений"
        List<String> tmp = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : duplicateWords.entrySet()) {
            // откидываем слова, которые не дублируются
            if (entry.getValue() > 1) {
                tmp.add(entry.getKey() + "=" + entry.getValue());
            }
        }
        // записываем в строку для вывода, разделяя строки ;
        builder.append(String.join(";", tmp));
    }
}
