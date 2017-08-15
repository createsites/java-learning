package sprint2.collections;

import sprint2.collections.interfaces.IViewer;

public class ArrayIteratorViewer implements IViewer {

    private final String[] words;
    private final StringBuilder builder = new StringBuilder();

    public ArrayIteratorViewer(String[] words) {
        this.words = words;
        builder.append("repeated:");
    }

    // Format you can see in tests
    public String resultToPrint() {
        // TODO: implementation
        return builder.toString();
    }
}
