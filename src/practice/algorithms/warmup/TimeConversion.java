package practice.algorithms.warmup;

public class TimeConversion
{
    /**
     * Given a time string in a 12-hour format, returns the same time in a 24 hour format
     * @param s a time string in the format hh:MM:SSXX, where XX is AM or PM
     * @return the input time in a 24-hour format HH:MM:SS
     */
    static String timeConversion(String s)
    {
        String[] time = s.substring(0, s.length() - 2).split(":");
        String meridiem = s.substring(s.length()-2);
        Integer hour = Integer.parseInt(time[0]);

        if ("PM".equals(meridiem) && hour != 12)
            time[0] = Integer.toString(hour + 12);

        if("AM".equals(meridiem) && hour == 12)
            time[0] = "00";

        return String.join(":", time);
    }

    public static void main(String[] args)
    {
        System.out.println(timeConversion("07:45:32PM"));
        System.out.println(timeConversion("07:45:32AM"));

    }
}
