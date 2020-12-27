package practice.algorithms.warmup;

public class PlusMinus
{
    /**
     * Given an array of integers, prints the ratios of the positive, negative, and zero values to the total.
     * @param arr An array of integers between -100 and 100 inclusive.  The length of the array can be between 1 and 100 inclusive.
     */
    static void plusMinus(int[] arr)
    {
        double pos = 0, neg = 0, zero = 0;
        for (int entry : arr)
        {
            if (entry > 0) pos++;
            else if (entry == 0) zero++;
            else neg++;
        }

        System.out.printf("%.6f%n", pos / arr.length);
        System.out.printf("%.6f%n", neg / arr.length);
        System.out.printf("%.6f%n", zero / arr.length);
    }

    public static void main(String[] args)
    {
        int[] testArray = {-1,-1,0,1,1};
        plusMinus(testArray);
    }
}
