package Drafts;

// Выделите абстрактный класс Duck,
// который будет содержать общие свойства и методы классов FlyingDuck и RubberDuck
abstract class Duck {
    public void swim() {
        System.out.println("Да, я умею плавать!");
    }

    public void quack() {
        System.out.println("Кря!");
    }
    public abstract String getName();
}

class FlyingDuck extends Duck {
    public String getName() {
        return "Я - обычная утка. Кря!";
    }

    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }
}

class RubberDuck extends Duck {
    public String getName() {
        return "Я - резиновая уточка!";
    }
}

