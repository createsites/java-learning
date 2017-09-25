package sprint2.exceptions;

public class Main {

    public static void main(String[] args) throws MyArrayDataException, MySizeArrayException {

        String[][] arrData = {
            {"11", "12", "13", "14"},
            {"21", "22", "23", "24"},
            {"31", "32", "33", "34"},
            {"41", "42", "43", "44"}
        };

        ArrayTransform arr = new ArrayTransform();

        try {
            int sum = arr.getSum(arrData);
            System.out.println("Sum: " + sum);
        } catch (MySizeArrayException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

}
