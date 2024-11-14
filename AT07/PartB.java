/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT07 PartB
 */

class Point {
    final double RADIANSTODEGREES = 57.2958;
    double x;
    double y;
    double radius;
    double degree = 0;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double xSetVal, double ySetVal) {
        x = xSetVal;
        y = ySetVal;
    }

    public double returnX() {
        return x;
    }

    public double returnY() {
        return y;
    }

    public double returnRadius() {
        radius = Math.sqrt((x * x) + (y * y));
        return radius;
    }

    public double returnAngle() {
        degree = Math.atan(y / x);
        degree = degree * RADIANSTODEGREES;
        return degree;
    }

    public void translate(double translateX, double translateY) {
        x = translateX;
        y = translateY;
    }

    public double distance(double nx, double ny) {
        double distance = Math.sqrt(((nx - x) * (nx - x)) + ((ny - y) * (ny - y)));
        return distance;
    }
}

public class PartB {
    public static void main(String[] args) {
        Point testPoint = new Point();

        // get initial information
        System.out.printf("x is %.2f, y is %.2f, radians is %.2f, and angle is %.2f%n", testPoint.returnX(),
                testPoint.returnY(), testPoint.returnRadius(), testPoint.returnAngle());

        testPoint.translate(1, 2);
        System.out.printf("x is %.2f, y is %.2f, radians is %.2f, and angle is %.2f%n", testPoint.returnX(),
                testPoint.returnY(), testPoint.returnRadius(), testPoint.returnAngle());

        System.out.printf("The distance from (%.2f, %.2f) and the origin (0,0) is %.2f", testPoint.returnX(),
                testPoint.returnY(), testPoint.distance(0, 0));
    }
}
