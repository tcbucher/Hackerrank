package practice.algorithms.warmup;

import java.util.Arrays;
import java.util.List;

public class BirthdayCandles
{
    /**
     * Gets the number of occurrences of the highest value in a given array
     * @param candles a list of positive integer values
     * @return the number of occurrences of the maximum value
     */
    public static int birthdayCakeCandles(List<Integer> candles)
    {
        candles.sort(Integer::compareTo);
        return candles.size() - candles.indexOf(candles.get(candles.size() - 1));
    }

    public static void main(String[] args)
    {
        Integer[] testArray = {1,4,2,4,3,2,3,4};
        System.out.println(birthdayCakeCandles(Arrays.asList(testArray)));
    }
}
