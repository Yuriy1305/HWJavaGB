package HomeWorks.HW3;
// HW 3, Lomtev Yuriy, 23/01/2021
//!!! ВСЕ ЗАДАНИЯ ОФОРМЛЯЮТСЯ В МЕТОДАХ !!!
//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;
//    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//то есть [0][0], [1][1], [2][2], …, [n][n];
//    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//    6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов.

// import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkApp {
        public static void main(String [] arg) {
        change01();
        completion();
        multiplicationBy2();
        diagonals();
        System.out.println(Arrays.toString(arrayLen(5, 123)));
        maxmin();
    }
// п.1 ДЗ:
    public static void change01() {
        int[] array10 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.print("Начальный массив/конечный:"+"\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(array10 [i] +"/" );
            if (array10 [i] == 1) {array10 [i] =0;}
            else                  {array10 [i] =1;}
            System.out.print(array10 [i] +"\t" );
        }
    }
// п.2 ДЗ:
    public static void completion() {
        System.out.println(""); // для разделения результатов методов
        int[] array100 = new int [100];
        for (int i = 0; i < 100; i++) {
            array100 [i]=i+1;
            System.out.print(array100 [i] +"\t" );
        }
    }
// п.3 ДЗ:
    public static void multiplicationBy2() {
        int[] array12 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(""); // для разделения результатов
        System.out.print("Начальный массив/меньшие 6 умножены на 2:"+"\t");
        for (int i = 0; i < 12; i++) {
            System.out.print(array12 [i] +"/" );
// вариант, если элементы массива, меньшие 6, надо умножить и записать в тот же элемент:
           if (array12 [i] < 6) {
                array12 [i] = array12 [i]*2;
                System.out.print(array12 [i] +"\t" );
           }
           else { System.out.print("\t");}
// вариант, если элементы массива, меньшие 6, надо просто умножить:
//            if (array12 [i] < 6) {
//            System.out.print(array12 [i]*2+"\t" );
//            }
//            else {
//            System.out.print("\t");}
        }
    }
// п.4 ДЗ:
    public static void diagonals() {
        int size = 6;
        int[][] arrayD = new int[size][size];
        System.out.println(); // для разделения результатов
        for (int w = 0; w < size; w++) {
            for (int h = 0; h < size; h++) {
                if (w == h || w==size-h-1) {
                    arrayD[w][h] = 1;
                } else {
                    arrayD[w][h] = 0;
                }
                System.out.print(arrayD[w][h] + "\t");
            }
            System.out.println("");
        }
    }
// п.5 ДЗ:
    public static int [] arrayLen(int len, int initialValue) {
        int [] arraylen = new int [len];
        for (int i = 0; i < len; i++) {
            arraylen [i] = initialValue;
        }
        return arraylen;
    }
// п.6 ДЗ:
    public static void maxmin () {
        int[] array12 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1  };
        int min=array12 [1];
        int max=array12 [1];
        for (int i = 0; i < 12; i++) {
            if (array12 [i] < min) {min = array12[i];}
            else if (array12 [i] > max) {max = array12[i];}
        }
        System.out.println("Min="+min+" Max="+max);
    }
}
