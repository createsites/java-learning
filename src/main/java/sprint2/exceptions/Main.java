package sprint2.exceptions;

public class Main {

    public static void main(String[] args) throws MyArrayDataException, MySizeArrayException {

        String[][] arrCorrect = {
            {"11", "12", "13", "14"},
            {"21", "22", "23", "24"},
            {"31", "32", "33", "34"},
            {"41", "42", "43", "44"}
        };
        String[][] arrIncorrectRows = {
            {"11", "12", "13", "14"},
            {"21", "22", "23", "24"},
            {"31", "32", "33", "34"}
        };
        String[][] arrIncorrectCols = {
            {"11", "12", "13"},
            {"21", "22", "23", "24"},
            {"31", "32", "33", "34"},
            {"41", "42", "43", "44"}
        };

        ArrayTransform arr = new ArrayTransform();

        try {
            int sum = arr.getSum(arrCorrect);
            System.out.println("Sum: " + sum);
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

}
