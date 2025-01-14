/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT06 Unit Project - Blackjack
 */

import java.util.Scanner;

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
    private int randomRank;

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
        randomRank = (int) ((Math.random() * 12) + 1);
        if (randomRank == 1) {
            rank = Rank.ACE;
            randomRank = 11;
        } else if (randomRank == 2) {
            rank = Rank.TWO;
        } else if (randomRank == 3) {
            rank = Rank.THREE;
        } else if (randomRank == 4) {
            rank = Rank.FOUR;
        } else if (randomRank == 5) {
            rank = Rank.FIVE;
        } else if (randomRank == 6) {
            rank = Rank.SIX;
        } else if (randomRank == 7) {
            rank = Rank.SEVEN;
        } else if (randomRank == 8) {
            rank = Rank.EIGHT;
        } else if (randomRank == 9) {
            rank = Rank.NINE;
        } else if (randomRank == 10) {
            rank = Rank.TEN;
        } else if (randomRank == 11) {
            rank = Rank.JACK;
            randomRank = 10;
        } else if (randomRank == 12) {
            rank = Rank.QUEEN;
            randomRank = 10;
        } else if (randomRank == 13) {
            rank = Rank.KING;
            randomRank = 10;
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

    public int getScore() {
        return randomRank;
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

public class BlackjackOld {
    // method to clear terminal screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        // create arrays
        Cards[] player = new Cards[10];
        Cards[] dealer = new Cards[10];

        // initialize score valeus
        int playerScore = 0;
        int dealerScore = 0;

        // initialize array place
        int playerPlace = 0;
        int dealerPlace = 0;

        // variable for checking aces
        int n = 0;
        int o = 0;

        boolean condition = true; // create big loop condition
        Scanner in = new Scanner(System.in); // declare scanner

        while (condition) {
            // hand out initial cards
            int i = 0;
            for (i = 0; i < 2; i++) {
                player[i] = new Cards();
                dealer[i] = new Cards();
            }
            playerPlace = i;
            dealerPlace = i;

            // show initial cards
            System.out.printf("Dealer: %s ##%nPlayer: %s %s%n", dealer[0].getFace(), player[0].getFace(),
                    player[1].getFace());

            // set initial scores
            playerScore = player[0].getScore() + player[1].getScore();
            dealerScore = dealer[0].getScore() + dealer[1].getScore();

            // player loop
            while (playerScore < 21) {
                System.out.print("Enter H to hit or S to stand: ");
                if (in.hasNext("S") || in.hasNext("s")) {
                    in.next();
                    break;
                } else if (in.hasNext("H") || in.hasNext("h")) {
                    in.next();
                    player[playerPlace] = new Cards();
                    playerScore = playerScore + player[playerPlace].getScore();
                    playerPlace = playerPlace + 1;
                    // check if player has aces
                    while (playerScore > 21) {
                        while (n < playerPlace) {
                            if (player[n].getScore() == 11) {
                                playerScore = playerScore - 10;
                            }
                            n = n + 1;
                        }
                        break;
                    }
                    // print updated player cards
                    clearScreen();
                    System.out.printf("Dealer: %s ##%nPlayer: ", dealer[0].getFace());
                    int j = 0;
                    for (j = 0; j < playerPlace; j++) {
                        System.out.print(player[j].getFace() + " ");
                    }
                    playerPlace = j;
                    System.out.println();
                }
            }

            // check if player busts
            if (playerScore > 21) {
                clearScreen();
                System.out.printf("Dealer: %s %s%nPlayer: ", dealer[0].getFace(), dealer[1].getFace());
                for (int l = 0; l < playerPlace; l++) {
                    System.out.print(player[l].getFace() + " ");
                }
                System.out.println();
                System.out.println("Player busts! Dealer wins!");
            }

            // reveal dealer card and calculate results
            if (playerScore == 21) {
                clearScreen();
                System.out.printf("Dealer: %s %s%nPlayer: ", dealer[0].getFace(), dealer[1].getFace());
                for (int l = 0; l < playerPlace; l++) {
                    System.out.print(player[l].getFace() + " ");
                }
                System.out.println();
                System.out.println("Player blackjack! Player wins!");
            }
            if (playerScore < 21) {
                clearScreen();
                System.out.printf("Dealer: %s %s ", dealer[0].getFace(), dealer[1].getFace());
                // draw dealer's cards
                while (dealerScore < 17) {
                    dealer[dealerPlace] = new Cards();
                    // check for dealer aces
                    while (dealerScore > 21) {
                        while (o < dealerPlace) {
                            if (dealer[o].getScore() == 11) {
                                dealerScore = dealerScore - 10;
                                o = o + 1;
                            }
                            break;
                        }
                    }
                    System.out.printf("%s ", dealer[dealerPlace].getFace());
                    dealerScore = dealerScore + dealer[dealerPlace].getScore();
                    dealerPlace = dealerPlace + 1;
                }
                System.out.println();

                // reprint player card
                System.out.print("Player: ");
                for (int m = 0; m < playerPlace; m++) {
                    System.out.print(player[m].getFace() + " ");
                }
                System.out.println();

                // calculate possible results
                if (dealerScore == 21) {
                    System.out.println("Dealer blackjack! Dealer wins!");
                } else if (dealerScore > 21) {
                    System.out.println("Dealer busts! Player wins!");
                } else if (playerScore == dealerScore) {
                    System.out.println("Scores tied!");
                } else if (playerScore > dealerScore) {
                    System.out.println("Player has a higher score! Player wins!");
                } else if (dealerScore > playerScore) {
                    System.out.println("Dealer has a higher score! Dealer wins!");
                }
            }

            // loop to ask whether to continue playing
            System.out.print("Enter P to play again or Q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                clearScreen();
                condition = false;
            } else if (in.hasNext("p") || in.hasNext("P")) {
                in.next();
                clearScreen();
                condition = true;
            }
        }
        in.close();
    }
}