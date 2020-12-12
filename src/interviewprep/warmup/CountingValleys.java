package interviewprep.warmup;

public class CountingValleys
{

    public static int countingValleys(int steps, String path) {
        int altitude = 0, valleys = 0;

        for (String step : path.split(""))
        {
            altitude += ("U".equals(step))? 1 : -1;
            valleys += ("D".equals(step) && altitude == -1)? 1: 0;
        }

        return valleys;
    }

    public static void main(String[] args)
    {
        // Test the countingValleys method
        String testPath1 = "DDUUUUDD";

        System.out.println(countingValleys(testPath1.length(), testPath1));
    }
}
