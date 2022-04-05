package com.company.KateSamokhvalova.java.Alexander.task9;

import java.util.Arrays;
import java.util.List;

public class StreamsHomework {
    public static void main(String[] args) {
        List<Integer> marks1 = Arrays.asList(2, 3, 3, 4, 5, 5, 5, 3);
        List<Integer> marks2 = Arrays.asList(4, 4, 5, 5, 5, 4, 5, 5);
        List<Integer> marks3 = Arrays.asList(3, 4, 4, 4, 5, 5, 5, 3);
        Student s1 = new Student("Mark", "Lex", marks1);
        Student s2 = new Student("Kate", "James", marks2);
        Student s3 = new Student("Diana", "Axe", marks3);

    }
}
