package MedivalGame;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        if (newSeason.equalsIgnoreCase("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color  = "серо-рыжий";
        }
    }


    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}
