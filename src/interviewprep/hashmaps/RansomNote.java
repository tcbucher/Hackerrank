package interviewprep.hashmaps;

import java.util.HashMap;

public class RansomNote
{

    static void checkMagazine(String[] magazine, String[] note)
    {
        HashMap<String, Integer> magMap = new HashMap<>();

        for (String word : magazine)
        {
            Integer wordCount = magMap.get(word);

            if (wordCount == null)
                magMap.put(word, 1);
            else
                magMap.replace(word, wordCount + 1);

        }

        boolean magContainsNote = true;

        for (String word : note)
        {
            if (!magMap.containsKey(word) || magMap.get(word) == 0)
            {
                magContainsNote = false;
                break;
            }

            magMap.replace(word, magMap.get(word) - 1);
        }

        System.out.println(magContainsNote? "Yes" : "No");
    }


    public static void main(String[] args)
    {
        String[] testMag1 = {"give","me","one","grand","today","night"};
        String[] testNote1 = {"give","one","grand","today"};

        checkMagazine(testMag1, testNote1);

    }

}
