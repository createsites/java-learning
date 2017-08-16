package sprint2.exceptions;

import java.util.stream.IntStream;

public class ArrayTransform {

    private String[][] arrayResult;
    private final byte ROWS_CNT = 4; // обязательное кол-во строк
    private final byte COLS_CNT = 4; // обязательное кол-во столбцов

    /**
     * проверяет формат входящего массива и записывает его клон в поле класса
     * @param arr двумерный стринговый массив
     * @throws MySizeArrayException
     */
    private void takeArray(String[][] arr) throws MySizeArrayException {
        boolean colsCorrect = true;
        for (String[] arrRow : arr) {
            if (arrRow.length != COLS_CNT) {
                colsCorrect = false;
            }
        }
        if (arr.length != ROWS_CNT || ! colsCorrect) {
            throw new MySizeArrayException("Неверный формат массива");
        }

        arrayResult = arr.clone();
    }

    /**
     * преобразование строкового массива в числовой
     * @return int[][]
     * @throws MyArrayDataException
     */
    private int[][] getArrayNumbers() throws MyArrayDataException {
        int[][] arrayNumbers = new int[ROWS_CNT][COLS_CNT];

        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = 0; j < arrayResult[i].length; j++) {
                try {
                    arrayNumbers[i][j] = Integer.parseInt(arrayResult[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException("Не интовое значение в ячейке: arr[" + i + "][" + j + "]");
                }
            }
        }

        return arrayNumbers;
    }

    /**
     * суммирует все элементы массива
     * @param arr двумерный числовой массив
     * @return сумма элементов
     */
    private int makeSum(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            sum += IntStream.of(row).sum();
        }

        return sum;
    }

    /**
     * принимает стринговый массив, преобразует в числовой и суммирует элементы
     * @param arr двумерный строковый массив
     * @return int сумма элементов числового массива
     * @throws MySizeArrayException
     * @throws MyArrayDataException
     */
    public int getSum(String[][] arr) throws MySizeArrayException, MyArrayDataException {
        takeArray(arr);
        return makeSum(getArrayNumbers());
    }
}
