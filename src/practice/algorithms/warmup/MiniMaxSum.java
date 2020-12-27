package practice.algorithms.warmup;

import java.util.Arrays;

public class MiniMaxSum
{
    /**
     * Given five positive integers, prints the minimum and maximum values that can be calculated by summing exactly four of the five integers.
     * @param arr an array of five positive integers
     */
    static void miniMaxSum(int[] arr)
    {
        int min = arr[0], max = arr[0];
        long total = 0;

        for (int entry : arr)
        {
            total += entry;
            if(entry > max) max = entry;
            if(entry < min) min = entry;
        }

        System.out.println((total - max) + " " + (total - min));
    }

    public static void main(String[] args)
    {
        int[] testArray = {1,3,5,7,9};
        miniMaxSum(testArray);
    }
}
