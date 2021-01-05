package practice.algorithms.implementation;

public class NumberLineJumps
{
    static String kangaroo(int x1, int v1, int x2, int v2)
    {
        if (x1 == x2)
            return "YES";

        if (v1 == v2)
            return "NO";

        int divide = (x2 - x1) / (v1 - v2);
        int mod = (x2 - x1) % (v1 - v2);
        return (divide > 0 && mod == 0)? "YES" : "NO";
    }

    public static void main(String[] args)
    {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 3));
        System.out.println(kangaroo(0, 10000, 9999, 9999));
        System.out.println(kangaroo(45, 7, 56, 2));
    }


}
