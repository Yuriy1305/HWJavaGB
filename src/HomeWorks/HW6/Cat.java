package HomeWorks.HW6;

public class Cat extends Animal {
    static String thisGenus = "Кот";
    static int counterCats = 0;

    public Cat(String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, thisGenus, maxDistanceRun, maxDistanceSwim);
        counterCats++;
    }

    @Override
    short swim(int distanceSwim) { // переписываем метод плаванья для котов
        return canNotSwim;
    }
}
