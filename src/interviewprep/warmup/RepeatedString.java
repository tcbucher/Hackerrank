package interviewprep.warmup;

public class RepeatedString
{
    static long repeatedString(String s, long n)
    {
        long instances = 0;

        for (String chr : s.split(""))
        {
            instances += chr.equals("a")? 1 : 0;
        }

        long remainder = n % s.length();

        if (remainder == 0)
        {
            instances *= n / s.length();
        }
        else if (remainder > 0)
        {
            instances *= (n - 1) / s.length();
            for (int i = 0; i < remainder; i++)
            {
                instances += s.charAt(i)=='a'? 1 : 0;
            }
        }

        return instances;
    }

    public static void main(String[] args)
    {
        System.out.println(repeatedString("abcac", 10));
    }
}
