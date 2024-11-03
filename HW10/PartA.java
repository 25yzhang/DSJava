/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW10 PartA
 */

public class PartA {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("The last letter of the name is " + name.charAt(name.length() - 1));
    }
}

// this is a runtime error. because strings are 0 indexed, the last letter will
// be the actual letter + 1, crashing the program when running. To fix this, you
// can just do name.length()-1