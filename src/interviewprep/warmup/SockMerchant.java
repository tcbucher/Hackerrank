package interviewprep.warmup;

import java.util.HashMap;
import java.util.HashSet;

public class SockMerchant
{

    public static int sockMerchant(int n, int[] ar)
    {
        HashSet<Integer> unpaired = new HashSet<>();
        int pairs = 0;

        for (int sock : ar)
        {
            if (unpaired.contains(sock)) {
                pairs++;
                unpaired.remove(sock);
            } else {
                unpaired.add(sock);
            }
        }

        return pairs;
    }

    public static void main(String[] args)
    {
        // Test the sockMerchant method
        int[] testArray1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] testArray2 = {1, 4, 8, 7, 5, 1, 5, 2, 4, 6, 8, 2, 6, 5, 8, 9, 5, 1};
        int[] testArray3 = {5, 8, 4, 5, 5, 4, 2, 5, 7, 4, 7, 4, 5, 2, 8, 2, 4, 5, 4};
        int[] testArray4 = {5, 8, 4, 2, 7};

        System.out.println(sockMerchant(testArray1.length, testArray1)); // 3
        System.out.println(sockMerchant(testArray2.length, testArray2)); // 7
        System.out.println(sockMerchant(testArray3.length, testArray3)); // 9
        System.out.println(sockMerchant(testArray4.length, testArray4)); // 0



    }


}
