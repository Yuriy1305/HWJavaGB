package HomeWorks.HW6;

public class Dog extends Animal {
    static String thisGenus = "Пёс";
    static int counterDogs=0;

    public Dog (String name, int maxDistanceRun, int maxDistanceSwim) {
        super(name, thisGenus, maxDistanceRun, maxDistanceSwim);
        counterDogs++;
    }
}
