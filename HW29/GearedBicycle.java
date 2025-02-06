public class GearedBicycle extends Bicycle {
    private final int MAX_GEARS = 6;
    private int gear = 1;

    private final int GEARED_MAX_SPEED = 50;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        if (gear > 0 && gear <= MAX_GEARS) {
            this.gear = gear;
        }
    }

    public void shiftUp() {
        gear++;
        if (gear > MAX_GEARS) {
            gear = MAX_GEARS;
        }
    }

    public void shiftDown() {
        gear--;
        if (gear < 1) {
            gear = 1;
        }
    }

    // override the parent pedal() class
    public void pedal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }

    // override the display() method
    public void display() {
        System.out.printf("Gear = %02d%n", getGear());
        super.display();
    }

    // override the break() method
    public void brake() {
        setSpeed(getSpeed() - 2);
        if (getSpeed() < 0) {
            setSpeed(0);
        }
    }
}
