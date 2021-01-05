package practice.algorithms.implementation;

public class BreakingTheRecords
{
    static int[] breakingRecords(int[] scores)
    {
        int[] records = {0,0};
        int min = scores[0];
        int max = scores[0];

        for (int score : scores)
        {
            if (score < min)
            {
                min = score;
                records[1]++;
            }
            else if (score > max)
            {
                max = score;
                records[0]++;
            }
        }

        return records;
    }

    public static void main(String[] args)
    {
        int[] testArray = {12, 24, 10, 24};

        for (int record : breakingRecords(testArray))
            System.out.println(record);
    }
}
