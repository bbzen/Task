package yandex.practicum.auto1;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if ((this.speed + autoPilotAcceleration) < autoPilotMaxSpeed)
        speed += autoPilotAcceleration;
        else if (autoPilotMaxSpeed < (this.speed + autoPilotAcceleration)) {
            speed = autoPilotMaxSpeed;
        }
        // исправьте метод для ускорения при автопилоте
    }
    // переопределите метод для ускорения
    // переопределите метод для торможения

    @Override
    public void accelerate() {
        if (this.speed + acceleration < maxSpeed) {
            speed += acceleration;
        }
        else speed = maxSpeed;
    }

    @Override
    public void brake() {
        if (brakingSpeed < speed) {
            speed -= brakingSpeed;
        }
        else {
            speed = 0;
        }
    }
}