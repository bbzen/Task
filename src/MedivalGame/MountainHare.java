package MedivalGame;

public class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    // добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
