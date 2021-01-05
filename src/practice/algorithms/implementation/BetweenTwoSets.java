package practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets
{
    public static int getTotalX(List<Integer> a, List<Integer> b)
    {
        int values = 0;
        Collections.sort(a);
        Collections.sort(b);

        for (Integer candidate = a.get(0); candidate <= b.get(b.size()-1); candidate++)
        {
            int add = 1;
            for (Integer aInt : a)
            {
                if (candidate % aInt != 0)
                    add = 0;
            }

            for (Integer bInt : b)
            {
                if (bInt % candidate != 0)
                    add = 0;
            }

            values += add;
        }

        return values;
    }

    public static void main(String[] args)
    {
        Integer[] testA = {2,4};
        Integer[] testB = {16,32,96};

        System.out.println(getTotalX(Arrays.asList(testA), Arrays.asList(testB)));
    }
}
