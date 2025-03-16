/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 33
 */

public class PartB {
    public static void main(String[] args) {
        Animal cow = new Animal("cow", 1000);
        Animal cat = new Animal("cat", 20);

        if (cow.compareTo(cat) == 0) {
            System.out.println("The weights are equal.");
        } else if (cow.compareTo(cat) == 1) {
            System.out.println("A cow weighs more.");
        } else if (cow.compareTo(cat) == -1) {
            System.out.println("A cat weighs more.");
        }
    }
}
