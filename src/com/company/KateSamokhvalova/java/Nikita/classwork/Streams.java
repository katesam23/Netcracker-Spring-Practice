package com.company.KateSamokhvalova.java.Nikita.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        new ArrayList<Double>().stream().filter(x -> x > 0).reduce(0.0, (x,y) -> x+y);

        List<Integer> list1 = Arrays.asList(2, 4, 53);
        List<Integer> list2 = Arrays.asList(-2, -4, 53);
        List<Integer> list3 = Arrays.asList(2, 4, -53);
        List<List<Integer>> all = new ArrayList<>();

        all.add(list1);
        all.add(list2);
        all.add(list3);

        System.out.println(all.stream().flatMap(x -> x.stream().filter(a -> a < 0)).reduce((m, n) -> m + n));
    }
}
