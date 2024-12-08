/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW15 Part C
 */

// With a relatively small array size, linear search and binary search will be approximately the same timing, but with a bigger array size/list, binary search will be much more efficient. This is because linear search is a linear process, meaning the time (with the average case) will scale linearly with the size of the array. Binary search is a logarithmic method, because it works by dividing the list by half each time.
import java.util.Arrays;

public class PartC {
    public static boolean linearSearch(int[] array, int tgtVal) {
        boolean linPresent = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == tgtVal) {
                linPresent = true;
            }
        }
        return linPresent;
    }

    public static void main(String[] args) {
        // declare final array size value
        final int ARRAYSIZE = 10000000;
        // declare array
        int list[] = new int[ARRAYSIZE];

        // initialize time variables
        double linSearchTime = 0;
        double binSearchTime = 0;

        // declare how many times to loop
        final int TIMES = 10;

        // fill array with random numbers 1-10000
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (list.length * Math.random()) + 1;
        }

        // START of loop
        for (int k = 0; k < TIMES; k++) {
            int tgtValue = (int) (list.length * Math.random()) + 1;

            // start lin search timer
            long linStartTime = System.nanoTime();

            // linear search method
            linearSearch(list, tgtValue);

            // end lin search timer and calculate time it took
            long linEndTime = System.nanoTime();
            linSearchTime = linSearchTime + ((double) (linEndTime - linStartTime) / 1000000);

            // copy array and sort for binary search
            int[] binarySearch = Arrays.copyOf(list, list.length);
            Arrays.sort(binarySearch);

            // start bin search timer
            long binStartTime = System.nanoTime();

            // binary search method
            Arrays.binarySearch(binarySearch, tgtValue);

            // end bin search timer and calculate time
            long binEndTime = System.nanoTime();
            binSearchTime = binSearchTime + ((double) (binEndTime - binStartTime) / 1000000);
        }

        // print results
        System.out.printf("Linear search took %.4f ms and Binary search took %.4f ms to complete", linSearchTime,
                binSearchTime);
    }
}
