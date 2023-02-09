package lostnfound;

import java.util.*;

public class LostAndFoundOffice {
    // создайте список things
    private ArrayList<Object> things;
    // реализуйте метод put()

    // реализуйте метод check()

    public LostAndFoundOffice() {
        things = new ArrayList<>();
    }

    public boolean check(Object target) {
        boolean result = false;
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target) && object != null) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void put(Object element) {
        things.add(element);
    }
}
