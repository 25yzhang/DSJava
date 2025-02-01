class CarClass {
    private double speed;

    public CarClass() {
        speed = 0;
    }

    public CarClass(double a) {
        speed = a;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed = speed + 1;
        if (speed > 120) {
            speed = speed - 1;
        }
    }

    public void brake() {
        speed = speed - 0.1;
    }

}

public class Car {
    public static void main(String[] args) {
        CarClass testCar = new CarClass();

        System.out.println("The car's initial speed is " + testCar.getSpeed());
        testCar.accelerate();
        testCar.accelerate();
        testCar.brake();
        System.out.println("The car's speed should be 1.9: " + testCar.getSpeed());

        CarClass overloadedTestCar = new CarClass(5.2);
        System.out.println("This car's initial speed should be 5.2 " + overloadedTestCar.getSpeed());
    }
}
