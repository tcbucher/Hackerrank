package interviewprep.hashmaps;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 */
public class TwoStrings
{
    /**
     * @return YES if there are common substrings, NO if not
     */
    static String twoStrings(String s1, String s2)
    {
        HashSet<String> s1Chars = new HashSet<>(Arrays.asList(s1.split("")));

        for (String chr : s2.split(""))
        {
            if (s1Chars.contains(chr))
                return "YES";
        }

        return "NO";
    }

    public static void main(String[] args)
    {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
    }
}
