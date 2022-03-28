package com.company.KateSamokhvalova.java.task5;

public class Main {

    public static void main(String[] args) {

        SorterStrategy strategy = new SorterStrategy();

        strategy.setSort(new BubbleSort());
        int[] array = {1, 9, 5, 2, 1, 6, 0};
        strategy.executeSort(array);
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ") ;
        }

        System.out.println();

        strategy.setSort(new ReverseBubbleSort());
        int[] array1 = {1, 9, 5, 2, 1, 6, 0};
        strategy.executeSort(array1);
        for (int i = 0; i < array1.length; ++i) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        strategy.setSort(new SelectionSort());
        int[] array2 = {1, 9, 5, 2, 1, 6, 0};
        strategy.executeSort(array2);
        for (int i = 0; i < array2.length; ++i) {
            System.out.print(array2[i] + " ") ;
        }


    }

}
