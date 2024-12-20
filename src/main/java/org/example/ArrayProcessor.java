package org.example;

public class ArrayProcessor {
    // Метод для обработки массива
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка количества строк
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен содержать ровно 4 строки, а не " + array.length);
        }

        // Проверка количества столбцов в каждой строке
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("В строке " + i + " массива неверное количество столбцов: " + array[i].length);
            }
        }

        int sum = 0;

        // Подсчет суммы элементов массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
