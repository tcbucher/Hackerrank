package practice.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets
{

    // Complete the compareTriplets function below.

    /**
     * Compares two arrays and returns the result
     * @param a A list of three numbers: the first participant's scores
     * @param b A list of three numbers: the second participant's scores
     * @return a list of two numbers: the points awarded to the first participant and the second participant, in that order
     */

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {
        int aPoints = 0, bPoints = 0;

        for (int i = 0; i < a.size(); i++)
        {
            int comp = a.get(i).compareTo(b.get(i));
            aPoints += (comp > 0)? 1 : 0;
            bPoints += (comp < 0)? 1 : 0;
        }

        Integer[] start = {aPoints, bPoints};
        return Arrays.asList(start);
    }


    public static void main(String[] args)
    {
        Integer[] testA = {5,6,7};
        Integer[] testB = {3,6,10};

        List<Integer> testAList = Arrays.asList(testA);
        List<Integer> testBList = Arrays.asList(testB);

        List<Integer> outcome = compareTriplets(testAList, testBList);

        for (Integer i : outcome)
        {
            System.out.println(i);
        }
    }
}
