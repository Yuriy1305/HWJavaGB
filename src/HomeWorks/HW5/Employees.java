package HomeWorks.HW5;

// 4. Создать массив из 5 сотрудников.
// Пример:
//   Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//   persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Employees {

    public static void main(String[] args) {
// п.4 ДЗ:
        Person[] Department = new Person[]{
                new Person("Ivanov", "Ivan", "Ivanovich", "engineer",
                        "ivanovII@mail.ru", "+7(123)456-78-90", 30000, 1992),
                new Person("Petrov", "Petr", "Petrovich", "manager",
                        "petrovPP@mail.ru", "+7(123)456-78-91", 40000, 1982),
                new Person("Smirnov", "Smir", "Smirovich", "artist",
                        "smirnovSS@mail.ru", "+7(123)456-78-92", 50000, 1972),
                new Person("Zhukov", "Zhuk", "Zhukovich", "warehouse manager",
                        "zhukovZZ@mail.ru", "+7(123)456-78-93", 60000, 1962),
                new Person("Voynov", "Voyn", "Voynovich", "security",
                        "voynovVV@mail.ru", "+7(123)456-78-90", 70000, 1952),
        };
// п.5 ДЗ:
// без методов:
//        int j = 1;
//        for (int i = 0; i < Department.length; i++) {
//            if (Department[i].getAge() > 40) {
//                System.out.println((j++) + ". " + Department[i].getpersonInfo());
//            }
//        }
// с методами:
       getAllEmployees (Department);

       getOldEmployees (Department, 40);
    }

     private static void getAllEmployees(Person[] Department) {
         System.out.println("List of employees: ");
        for (int i = 0; i < Department.length; i++) {
           System.out.println((i+1) + ". " + Department[i].getpersonInfo());
        }
    }

    private static void getOldEmployees(Person[] Department, int age) {
        System.out.println("List of employees older "+age+" years: ");
        int j = 1;
        for (int i = 0; i < Department.length; i++) {
            if (Department[i].getAge() > age) {
                System.out.println((j++) + ". " + Department[i].getpersonInfo());
            }
        }
    }

}



