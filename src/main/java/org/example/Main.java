package org.example;

public class Main {
    public static void main(String[] args) {
        // Вызов первого метода
        printThreeWords();

        // Вызов второго метода
        checkSumSign();

        // Вызов третьего метода
        printColor(50);
        printColor(-10);
        printColor(150);

        // Вызов четвертого метода
        compareNumbers();

        // Вызов пятого метода
        System.out.println(isSumInRange(5, 5));
        System.out.println(isSumInRange(10, 10));
        System.out.println(isSumInRange(15, 5));
        System.out.println(isSumInRange(1, 2));

        // Вызов шестого метода
        checkNumberSign(5);
        checkNumberSign(-15);
        checkNumberSign(0);

        // Вызов седьмого метода
        System.out.println(isNegative(5));
        System.out.println(isNegative(-15));
        System.out.println(isNegative(0));

        // Вызов восьмого метода
        printStringMultipleTimes("Astonnn", 3);

        // Вызов девятого метода
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));

        // Вызов десятого метода
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив:");
        printArray(array);

        // Вызов одиннадцотого метода
        array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; //индексы с единицы поэтому ++ к нуле
        }

        System.out.println("Заполненный массив 11 задание;");
        printArray(array);

        // Вызов двеннадцатого метода
        array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2; //умножением на 2 числа меньше 6
            }
        }
        System.out.println("Заполненный массив 12 задание;");
        printArray(array);

        // Вызов триннадцатого метода
        int n = 4; //размер массива
        int[][] matrix = new int[n][n]; //двумерный целочисленный массив nXn
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1; //главная диагональ
            matrix[i][n - i - 1] = 1; //остальная диагональ
        }
        printMatrix(matrix);

        // Вызов четырннадцатого метода
        public static int[] generateArray(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }




    }


    //1
    public static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    //2
    public static void checkSumSign() {
        int a = 15;
        int b = -100;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //6
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    //8
    public static void printStringMultipleTimes(String text, int times) {
        if (times <= 0) {
            System.out.println("Указано некорректное кол-во повторений");
            return;
        }
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    //9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //10
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //11 метод такой же как в 10 задании
    //12 метод такой же как в 10 задании
    //13
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "");
            }
            System.out.println();
        }



    }

    //14
    Public static void brr(String[ args]) {
        int[] result = generateArray(5, 10);
        for (int value : result) {
            System.out.println(value + "");
        }
    }






}