package HomeWorks.HW6;

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
