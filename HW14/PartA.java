/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 14 Part A
 */

public class PartA {
    public static void main(String[] args) {
        /*
         * 1. Given the declaration below, what is the value of array[3]?
         * 
         * int[] array = {4, 3, 5, 2, 0};
         * a) 0
         * b) 2
         * c) 3
         * d) 5
         * 
         * B. Because arrays are 0 index, array[3] would be 2 (b)
         */

        /*
         * 2. Given the declaration below, which of the following statements would cause
         * a run-time error?
         * 
         * int[] array = {4, 3, 5, 2, 0};
         * a) array[0] = 1;
         * b) array[4] = 1;
         * c) array[5] = 1;
         * d) array[2] = array[3];
         * 
         * C. Only c will cause a runtime error, because there is not a 6th value (#5
         * from
         * 0 index) in the array, causing a runtime error
         */

        /*
         * 3. Consider the following code segment. What is the value of b[2] after the
         * code executes?
         * 
         * int[] a = { 0, 1, 2, 3, 4 };
         * int[] b = { 0, 1, 4, 9 };
         * a = b;
         * b = a;
         * a) 1
         * b) 2
         * c) 4
         * d) There is a syntax error in the code.
         * 
         * C. The first statement changes the variable a's address to point to array b,
         * so the second statement will point to its own address, leading the 3rd value
         * (2nd from 0 index) to be from the array pointed to by the original b value,
         * being 4
         */
    }
}
