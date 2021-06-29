import java.util.Arrays;

public class HW3 {

    public static void main(String[] args) {
       element5(5,99);
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
     * цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void element() {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        System.out.println(Arrays.toString(arr));
    }


/**
 *2. Задать пустой целочисленный массив длиной 100.
 * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * */

public static void element2() {
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
    }
    System.out.println(Arrays.toString(arr));
}

/**
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * пройти по нему циклом,и числа меньшие 6 умножить на 2;
 * */

public static void element3() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

}

/**
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные
 *  элементы единицами (можно только одну из диагоналей, если обе сложно).
 *  Определить элементы одной из диагоналей можно по следующему принципу:
 *  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public static void element4() {
    int[][] arr = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j || i + j == 4 - 1) {
                arr[i][j] = 1;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}


    /**
     * 5. Написать метод, принимающий на вход два аргумента:
     * len и initialValue, и возвращающий одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue;
     */


    public static void element5(int len, int initialvalue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialvalue;
        }
        System.out.println(Arrays.toString(arr));
    }





}
