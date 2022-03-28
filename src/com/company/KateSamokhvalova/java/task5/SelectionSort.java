package com.company.KateSamokhvalova.java.task5;

public class SelectionSort implements Sortable {

    @Override
    public void executeSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int minimal = array[i];
            int index_minimal = i;

            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < minimal) {
                    minimal = array[j];
                    index_minimal = j;
                }
            }

            if (i != index_minimal) {
                array[i] = array[i] + array[index_minimal] - (array[index_minimal] = array[i]);
            }
        }
    }
}
