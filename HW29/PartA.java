/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 29 PartA
 */

public class PartA {
    public static void main(String[] args) {
        GearedBicycle gearedBike = new GearedBicycle();
        // get up to speed
        gearedBike.pedal();
        gearedBike.pedal();
        gearedBike.pedal();
        gearedBike.display();
        // break then display new speed
        gearedBike.brake();
        gearedBike.display();

        Bicycle normalBike = new Bicycle();
        // get up to speed
        normalBike.pedal();
        normalBike.pedal();
        normalBike.pedal();
        normalBike.display();
        // break then display new speed
        normalBike.brake();
        normalBike.display();

        // geared bike brake function decreases speed by 2 MPH, while normal bike only 1
        // MPH
    }
}