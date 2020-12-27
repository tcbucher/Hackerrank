package practice.algorithms.warmup;

public class AVeryBigSum
{
    static long aVeryBigSum(long[] ar)
    {
        long sum = 0;

        for (long entry : ar)
        {
            sum += entry;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        long[] testArray = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        System.out.println(aVeryBigSum(testArray));
    }
}
