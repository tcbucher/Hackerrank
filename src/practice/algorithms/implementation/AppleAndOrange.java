package practice.algorithms.implementation;


public class AppleAndOrange
{
    // Complete the countApplesAndOranges function below.
    // s: the starting point of the house
    // t: ending point of the house
    // a: position of the apple tree
    // b: position of the orange tree
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        System.out.println(fruitsOnHouse(s, t, a, apples));
        System.out.println(fruitsOnHouse(s, t, b, oranges));
    }

    private static int fruitsOnHouse(int roofStart, int roofEnd, int treePosition, int[] fallenFruits)
    {
        int roofFruits = 0;
        for (int fruit : fallenFruits)
        {
            roofFruits += (roofStart <= treePosition + fruit && roofEnd >= treePosition + fruit)? 1 : 0;
        }

        return roofFruits;
    }

    public static void main(String[] args)
    {
        int[] testApples = {-2, 2, 1};
        int[] testOranges = {5, -6};
        countApplesAndOranges(7, 11, 5, 15, testApples, testOranges);
    }
}
