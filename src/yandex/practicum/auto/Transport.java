package yandex.practicum.auto;

class Transport {
    private double speed;
    private double maxSpeed;
    private double acceleration;
    private double brakingSpeed;
    private int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}