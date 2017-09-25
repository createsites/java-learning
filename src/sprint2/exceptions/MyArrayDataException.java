package sprint2.exceptions;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("Не интовое значение в ячейке: arr[" + i + "][" + j + "]");
    }
}
