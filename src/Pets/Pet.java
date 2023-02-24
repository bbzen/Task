package Pets;

public abstract class Pet {
    protected final int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public abstract void giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }
}
