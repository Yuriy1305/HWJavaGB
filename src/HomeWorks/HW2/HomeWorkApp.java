package HomeWorks.HW2;
//      HW 2, Lomtev Yuriy, 20/01/2021
//  1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false.
//  2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
//  3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//  4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
//  5.* Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class HomeWorkApp {
    public static void main(String [] arg) {
        System.out.println(checkInterval(1,1));
        notNegativeNegative(-99);
        System.out.println(notNegativeNegativeF(-1));
        printString("Строка", 9);
        System.out.println("Високосный год - "+leapYear(-40));
    }
// п.1 ДЗ:
    public static Boolean checkInterval(int a, int b) {
        return ((a+b) <= 20 && (a+b) >= 10);
    }
// п.2 ДЗ:
    public static void notNegativeNegative(int a) {
        if (a >= 0) {
            System.out.println("Число "+a+" неотрицательное");
        } else {
            System.out.println("Число "+a+" отрицательное");
        }
    }
// п.3 ДЗ, т.к. не указано к чему относится 0, пришлось учесть все варианты,
// а это значит возвращаем строку: :))
    public static String notNegativeNegativeF(int a) {
        if      (a > 0) { return "false";}
        else if (a < 0) { return "true";}
        else            { return "0";}
    }
// п.4 ДЗ:
    public static void printString(String s, int a) {
        for (int i = 1; i < a+1; i++) {
            System.out.println(s+" "+i);
       }
    }
// п.5 ДЗ: (на вебинаре, конечно, эффективнее показано)
    public static Boolean leapYear(int y) {
// y<=0 - дохристовы времена, но формально определяем високосность
        if (y%100 == 0 && y%400 != 0) {
            return false;
        }  // невисокосный
        else if (y%400 == 0 || y%4 == 0) {
            return true;
        } // високосный
        else {
            return false;
        } // остальные - тоже невисокосные
    }
}
