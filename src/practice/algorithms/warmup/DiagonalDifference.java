package practice.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference
{
    /**
     * Gets the diagonal difference of a two-dimensional array
     * @Param arr A square matrix represented as a list of lists of integer objects
     * @return the absolute difference of the diagonal sums of the input matrix
     */
    public static int diagonalDifference(List<List<Integer>> arr)
    {
        int cursor = 0, sumLeft = 0, sumRight = 0, rowEnd = arr.get(0).size() - 1;

        for (List<Integer> row: arr)
        {
            sumLeft += row.get(cursor);
            sumRight += row.get(rowEnd - cursor++);
        }

        return (sumLeft > sumRight) ? sumLeft - sumRight : sumRight - sumLeft;
    }


    public static void main(String[] args)
    {
        Integer[] row1 = {1,2,3};
        Integer[] row2 = {4,5,6};
        Integer[] row3 = {9,8,9};

        List<List<Integer>> testMatrix = new ArrayList<>();
        testMatrix.add(Arrays.asList(row1));
        testMatrix.add(Arrays.asList(row2));
        testMatrix.add(Arrays.asList(row3));

        System.out.println(diagonalDifference(testMatrix));
    }
}
