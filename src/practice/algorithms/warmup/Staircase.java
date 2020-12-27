package practice.algorithms.warmup;

import javax.print.DocFlavor;
import java.util.Collections;

public class Staircase
{
    /**
     * Prints out a staircase of the size specified
     * @param n the height of the staircase and the length of the bottom line
     */
    static void staircase(int n)
    {
        for (int i = n - 1; i >= 0; i--)
        {
            String stair = String.join("", Collections.nCopies(i, " "));
            stair += String.join("", Collections.nCopies(n-i, "#"));
            System.out.println(stair);
        }
    }

    public static void main(String[] args)
    {
        staircase(4);
    }
}
