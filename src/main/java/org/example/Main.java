package org.example;

//исключения для неверного размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

//исключение для неверных данных в массива
class MyArrayDataException extends Exception{
    public MyArrayDataException(String message) {
        super(message);
    }
}

class ArrayProcessor {
    //метод для обработки массива
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        //проверка размера массива
        if (array.length !=4 || array[0].length != 4) {
            throw new MyArraySizeException("массив должен быть 4х4");
        }

        int sum  = 0;

        //
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    //преобразование строки в число и сумму
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке["+ i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        //пример массива
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(array);
            System.out.println("Сумма всех элементов массива:" + result);
        } catch (MyArraySizeException e) {
            System.out.println("ошибка размера массива: " +e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
    }
}