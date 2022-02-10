package HomeWorks.HW6;

public abstract class Animal {
    private String name;
    private String genus;

    public int maxDistanceRun;
    public int maxDistanceSwim;

    public static short canSwim=1;
    public static short canNotSwim=-1;
    public static short notSwimDistance=0;

    public static int counterAllAnimals = 0;

    public Animal (String name, String genus, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.genus = genus;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        counterAllAnimals++;
    }

    String getName ()        { return this.name; }
    String getGenus ()       { return this.genus; }
    int getMaxDistanceRun () { return this.maxDistanceRun; }
    int getMaxDistanceSwim() { return this.maxDistanceSwim; }

    boolean run (int distanceRun) { return (distanceRun <= maxDistanceRun); }

    short swim(int distanceSwim) { // котам, как "неумеющим" плавать, отдельный метод, переписывающий этот
        if (distanceSwim <= maxDistanceSwim) {
            return canSwim; }
        else {
            return notSwimDistance;}
        }

}
