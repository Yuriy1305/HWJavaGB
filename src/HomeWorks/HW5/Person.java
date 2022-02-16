package HomeWorks.HW5;

//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

import java.time.YearMonth;

// п.1 ДЗ:
public class Person {

    private String surname;
    private String name;
    private String fatherName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int birthYear; // год рождения - возраст определяем разницей годов текущего и рождения

// п.2 ДЗ:
    public Person(
            String surname,
            String name,
            String fatherName,
            String position,
            String email,
            String phoneNumber,
            int salary,
            int birthYear)
    {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthYear=birthYear;
    }

//Getter Age
    int getAge() {
        return YearMonth.now().getYear()-birthYear;
    }

// п.3 ДЗ:
String getpersonInfo() {
        return  this.surname+" "+this.name+" "+this.fatherName+
                ", position: "+this.position+
                ", e-mail: "+this.email+
                ", phone number: "+this.phoneNumber+
                ", salary: "+this.salary+"₽"+
                ", age: "+getAge()+" years old.";
    }

}
