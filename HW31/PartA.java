/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 31 Part A
 */

public class PartA {
    public static void main(String[] args) {
        BaseballCard firstCard = new BaseballCard("Sam", 2006);
        BaseballCard secondCard = new BaseballCard("Jerry", 2007);
        BaseballCard sameCard = new BaseballCard("Sam", 2006);

        // test print function
        System.out.print("The first card is: ");
        System.out.println(firstCard);
        System.out.print("The second card is: ");
        System.out.println(secondCard);

        // compare if they're equal
        if (firstCard.equals(secondCard) == true) {
            System.out.println(firstCard.getName() + " is equal to " + secondCard.getName());
        } else {
            System.out.println("The cards are not equal");
        }

        // compare if they're equal
        if (firstCard.equals(sameCard) == true) {
            System.out.println(firstCard.getName() + " is equal to " + sameCard.getName());
        } else {
            System.out.println("The cards are not equal");
        }
    }
}
