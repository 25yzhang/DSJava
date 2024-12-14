import java.util.ArrayList;

public class InClass {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Emily");
        names.add("Bob");
        names.add("Cindy");
        System.out.println(names);

        // itereate through the list
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // remove a name
        names.remove(0);
        System.out.println(names);

        // Can't use primitive variables with array lists. Need to use wrapper class such as Integer or Double
        ArrayList<Integer> values = new ArrayList();
    }
}
