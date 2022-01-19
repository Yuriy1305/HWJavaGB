package HomeWorks.HW1;
// HW 1, Lomtev Yuriy, 19/01/2021
// 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
// 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//         Orange
//         Banana
//         Apple
// 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
// то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
// 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
// если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
// если больше 100 (100 исключительно) - “Зеленый”;
// 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
// и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
// 6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.

// п.1 ДЗ:
    public class HomeWorkApp {
        public static void main(String [] arg) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            System.out.println(compareNumbersF (-1, -1));
        }
//  п.2 ДЗ:
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
// п.3 ДЗ:
        public static void checkSumSign() {
            int a=-1;
            int b=+1;
            if (a+b >= 0) {
//          System.out.println("Сумма неотрицательна и равна "+ (a+b));
                System.out.println("Сумма неотрицательна");
            }
            else {
                System.out.println("Сумма отрицательна");
            }
        }
// п.4 ДЗ:
        public static void printColor () {
            int value=999; // -1, 0, 10, 100, 999
            if (value <= 0) {
                System.out.println("Красный");
            }
            else if ((value > 0) & (value <= 100)) {
                System.out.println("Желтый");
            }
            else {
                System.out.println("Зеленый");
            }
        }
// п.5 ДЗ:
//  вариант подпрограммы, т.е. не возвращающий значение метод
        public static void compareNumbers() {
            int a=-1;
            int b=+1;
            if (a >= b) {
                System.out.println("a >= b");
            }
            else {
                System.out.println("a < b");
            }
        }
//  вариант функции, т.е. метод вернет результат выполнения строкой
        public static String compareNumbersF(int a, int b) {
            if (a >= b) {
                return "a >= b";
            }
            else {
                return "a < b";
            }
        }
    }
