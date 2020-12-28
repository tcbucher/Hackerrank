package practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents
{
    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade : grades)
        {
            if (grade < 38 || grade % 5 < 3)
                roundedGrades.add(grade);
            else
                roundedGrades.add(grade + (5 - (grade % 5)));
        }

        return roundedGrades;
    }

    public static void main(String[] args)
    {
        Integer[] gradesArray = {73,67,38,33};
        List<Integer> grades = Arrays.asList(gradesArray);

        List<Integer> result = gradingStudents(grades);

        for (Integer roundedGrade : result)
        {
            System.out.println(roundedGrade);
        }

    }
}
