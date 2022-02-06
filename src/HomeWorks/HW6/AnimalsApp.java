package HomeWorks.HW6;

<<<<<<< HEAD
public class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Барсик", "Белый");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
    }
    public class Animal {
       String name;
       public Animal() {        }
       public Animal(String name) {
            this.name = name;
        }
        public void animalInfo() {
            System.out.println("Животное: " + name);
        }
        public void jump() {
            System.out.println("Животное подпрыгнуло");
        }
    }

    public class Cat extends Animal {
        String color;
        public Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }
        public void catInfo() {
            System.out.println("Кот имя: " + name + " цвет: " + color);
        }
    }

}
// Результат:
// Животное: Дружок
// Животное: Барсик
// Кот имя: Барсик цвет: Белый
=======
// by Lomtev Yuriy, 02/02/2022
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//   Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
//   собака 10 м.).
//4* Добавить подсчет созданных котов, собак и животных.

public class AnimalsApp {
    public static void main(String[] args) {
        Animal [] animals = {new Dog("Джульбарс", 100, 6),
                            new Cat("Марсик", 50, 5),
                            new Dog("МакМилан", 200, 20),
                            new Cat("Ёжик", 75, 7)};
        int distanceRun = 75;
        int distanceSwim = 7;
        String resultRun;
        String resultSwim;
        String resultSwimCats;

        for (int i = 0; i < animals.length; i++) {
            if (!animals[i].run(distanceRun))
                {  resultRun = " не "; } else { resultRun =" ";}
            if (animals [i].swim(distanceSwim) == Animal.notSwimDistance || (animals [i].swim(distanceSwim) == Animal.canNotSwim))
                {  resultSwim = " не "; } else { resultSwim =" "; }
            if (animals [i].swim(distanceSwim) == Animal.canNotSwim)
                {  resultSwimCats = " - кошачьи не любят воду!"; } else { resultSwimCats = "."; }
                System.out.println (i+1 + ". " + animals[i].getGenus()+" "+animals[i].getName()+
                             " может пробежать "+animals[i].maxDistanceRun+" м, а проплыть "
                             +animals[i].maxDistanceSwim+" м. Попытается пробежать "+distanceRun+" м и проплыть "+
                             distanceSwim+" м - результат: пробежать"+resultRun+"удалось, проплыть"+
                             resultSwim+"удалось"+resultSwimCats);
        }
        System.out.println ("\t"+"Всего 'родилось' животных - "+Animal.counterAllAnimals+", в т. ч. семейства кошачьих - "+Cat.counterCats+
                " и семейства собачьих - "+Dog.counterDogs);
    }
}
>>>>>>> origin/HW6
