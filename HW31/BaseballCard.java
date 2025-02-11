public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getClass().getName() + "[name = " + name + ", year = " + year + "]";
    }

    public boolean equals(Object obj) {
        final double SMALL_NUMBER = 0.000000000000001;
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        BaseballCard otherCard = (BaseballCard) obj;
        if (this.name.equals(otherCard.name) && Math.abs(this.year - otherCard.year) < SMALL_NUMBER) {
            return true;
        } else {
            return false;
        }
    }
}