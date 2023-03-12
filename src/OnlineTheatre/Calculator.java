package OnlineTheatre;

import java.util.List;

public class Calculator {
    private final static double MINUTES_IN_A_DAY = 1440.0;

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double result = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                result += mediaItem.getRuntime() / MINUTES_IN_A_DAY;
            } else if (mediaItem instanceof Series) {
                result += mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount() / MINUTES_IN_A_DAY;
            }
        }
        return result;
    }
}
