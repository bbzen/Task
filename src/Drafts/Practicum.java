package Drafts;

public class Practicum {

    public static String getPopulationPercent(Continent continent) {
        String result;

        switch (continent) {
            case ASIA:
                result = "59.5%";
                break;
            case AFRICA:
                result = "16.9%";
                break;
            case NORTH_AMERICA:
                result = "7.7%";
                break;
            case SOUTH_AMERICA:
                result = "5.6%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            default:
                result = "Такого материка не существует.";
        }

/*        if (continent == Continent.ASIA) {
            result = "59.5%";
        } else if (continent == Continent.AFRICA) {
            result = "16.9%";
        } else if (continent == Continent.NORTH_AMERICA) {
            result = "7.7%";
        } else if (continent == Continent.SOUTH_AMERICA) {
            result = "5.6%";
        } else if (continent == Continent.ANTARCTICA) {
            result = "<0.1%";
        } else if (continent == Continent.EUROPE) {
            result = "9.7%";
        } else if (continent == Continent.AUSTRALIA) {
            result = "0.5%";
        } else {
            result = "Такого материка не существует.";
        }*/

        return result;
    }
}

enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}
