package HomeWorks.HW6;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//   Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
//   собака 10 м.).
//4* Добавить подсчет созданных котов, собак и животных.

import HomeWorks.HW6.Animal;

public class Dog extends Animal {
    static String thisGenus = "Пёс";
    int counterDogs=0;

    public Dog (String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, thisGenus, maxDistanceRun, maxDistanceSwim);
        counterDogs++;
    }
}
