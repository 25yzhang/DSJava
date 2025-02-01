/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 26 PartB
 */
class Item {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.print(myItem.getValue() + " | ");
        myItem.setValue(13);
        System.out.println(myItem.getValue());
    }
}

// This program will print 0 | 0, but it means to print 0 | 13. The reason for
// this is that in the setValue method within the Item class, value is set to
// itself rather then setting the actual member variable "value" to the
// arguement passed. The program can be fixed by entering this.value = value.
// Now, it will print 0 | 13