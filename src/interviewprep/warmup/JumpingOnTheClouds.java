package interviewprep.warmup;

public class JumpingOnTheClouds
{

    static int jumpingOnClouds(int[] c)
    {
        int index = 0, jumps = 0;
        while (index < c.length)
        {
            if(index < c.length - 2 && c[index+2] == 0) {
                index += 2;
            } else {
                index += 1;
            }

            jumps += (index < c.length)? 1 : 0;

        }
        return jumps;
    }


    public static void main(String[] args)
    {
        int[] testArray1 = {0, 0, 1, 0, 0, 1, 0};
        int[] testArray2 = {0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(testArray1));
        System.out.println(jumpingOnClouds(testArray2));

    }
}
