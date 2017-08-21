package sprint2.collections;

import sprint2.collections.interfaces.IViewer;
import java.util.Map;
import java.util.TreeMap;

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
        // записываем в строку для вывода
        for (Map.Entry<String, Integer> entry : duplicateWords.entrySet()) {
            // откидываем слова, которые не дублируются
            if (entry.getValue() > 1) {
                builder.append(entry.getKey() + "=" + entry.getValue() + ";");
            }
        }
        // TODO RAKAMAZAFAKA!
        // убираем точку с запятой в конце
        builder.setLength(builder.length() - 1);
    }
}
