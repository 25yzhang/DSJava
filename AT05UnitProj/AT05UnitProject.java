/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT05 Unit Project
 */

class Cards {
    // create enums
    public enum Suit {
        SPADE, HEART, CLUB, DIAMOND
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    // declare member variables
    private Suit suit;
    private Rank rank;

    // random constructor
    public Cards() {

        // assign random suit
        int randomSuit = (int) Math.round(Math.random() * 3);
        if (randomSuit == 0) {
            suit = Suit.SPADE;
        } else if (randomSuit == 1) {
            suit = Suit.HEART;
        } else if (randomSuit == 2) {
            suit = Suit.CLUB;
        } else if (randomSuit == 3) {
            suit = Suit.DIAMOND;
        }

        // assign random rank
        int randomRank = (int) Math.round(Math.random() * 12);
        if (randomRank == 0) {
            rank = Rank.ACE;
        } else if (randomRank == 1) {
            rank = Rank.TWO;
        } else if (randomRank == 2) {
            rank = Rank.THREE;
        } else if (randomRank == 3) {
            rank = Rank.FOUR;
        } else if (randomRank == 4) {
            rank = Rank.FIVE;
        } else if (randomRank == 5) {
            rank = Rank.SIX;
        } else if (randomRank == 6) {
            rank = Rank.SEVEN;
        } else if (randomRank == 7) {
            rank = Rank.EIGHT;
        } else if (randomRank == 8) {
            rank = Rank.NINE;
        } else if (randomRank == 9) {
            rank = Rank.TEN;
        } else if (randomRank == 10) {
            rank = Rank.JACK;
        } else if (randomRank == 11) {
            rank = Rank.QUEEN;
        } else if (randomRank == 12) {
            rank = Rank.KING;
        }
    }

    // overloaded constructor
    public Cards(char y, int x) {
        // set suit
        if (y == 's') {
            suit = Suit.SPADE;
        } else if (y == 'h') {
            suit = Suit.HEART;
        } else if (y == 'c') {
            suit = Suit.CLUB;
        } else if (y == 'd') {
            suit = Suit.DIAMOND;
        }

        // set rank
        if (x == 1) {
            rank = Rank.ACE;
        } else if (x == 2) {
            rank = Rank.TWO;
        } else if (x == 3) {
            rank = Rank.THREE;
        } else if (x == 4) {
            rank = Rank.FOUR;
        } else if (x == 5) {
            rank = Rank.FIVE;
        } else if (x == 6) {
            rank = Rank.SIX;
        } else if (x == 7) {
            rank = Rank.SEVEN;
        } else if (x == 8) {
            rank = Rank.EIGHT;
        } else if (x == 9) {
            rank = Rank.NINE;
        } else if (x == 10) {
            rank = Rank.TEN;
        } else if (x == 11) {
            rank = Rank.JACK;
        } else if (x == 12) {
            rank = Rank.QUEEN;
        } else if (x == 13) {
            rank = Rank.KING;
        }
    }

    // return suit class
    public Suit getSuit() {
        return suit;
    }

    // return rank
    public Rank getRank() {
        return rank;
    }

    public String getFace() {
        // return suit
        String suitSymbol;
        String rankSymbol;

        if (suit == Suit.SPADE) {
            suitSymbol = "\u2660";
        } else if (suit == Suit.HEART) {
            suitSymbol = "\u2661";
        } else if (suit == Suit.CLUB) {
            suitSymbol = "\u2663";
        } else if (suit == Suit.DIAMOND) {
            suitSymbol = "\u2662";
        } else {
            suitSymbol = "x";
        }

        // return rank
        if (rank == Rank.TWO) {
            rankSymbol = ("2");
        } else if (rank == Rank.THREE) {
            rankSymbol = "3";
        } else if (rank == Rank.FOUR) {
            rankSymbol = "4";
        } else if (rank == Rank.FIVE) {
            rankSymbol = "5";
        } else if (rank == Rank.SIX) {
            rankSymbol = "6";
        } else if (rank == Rank.SEVEN) {
            rankSymbol = "7";
        } else if (rank == Rank.EIGHT) {
            rankSymbol = "8";
        } else if (rank == Rank.NINE) {
            rankSymbol = "9";
        } else if (rank == Rank.TEN) {
            rankSymbol = "T";
        } else if (rank == Rank.JACK) {
            rankSymbol = "J";
        } else if (rank == Rank.QUEEN) {
            rankSymbol = "Q";
        } else if (rank == Rank.KING) {
            rankSymbol = "K";
        } else if (rank == Rank.ACE) {
            rankSymbol = "A";
        } else {
            rankSymbol = "x";
        }

        return (suitSymbol + rankSymbol);
    }

}

public class AT05UnitProject {
    public static void main(String[] args) {
        // print specific card
        Cards queenOfHearts = new Cards('h', 12);
        System.out.printf("The following card should be the queen of hearts, %s%n", queenOfHearts.getFace());

        // test ten random cards
        Cards random1 = new Cards();
        Cards random2 = new Cards();
        Cards random3 = new Cards();
        Cards random4 = new Cards();
        Cards random5 = new Cards();
        Cards random6 = new Cards();
        Cards random7 = new Cards();
        Cards random8 = new Cards();
        Cards random9 = new Cards();
        Cards random10 = new Cards();

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", random1.getFace(), random2.getFace(),
                random3.getFace(), random4.getFace(), random5.getFace(), random6.getFace(), random7.getFace(),
                random8.getFace(), random9.getFace(), random10.getFace());

        System.out.println("\u2660, \u2661, \u2663, \u2662");
    }
}