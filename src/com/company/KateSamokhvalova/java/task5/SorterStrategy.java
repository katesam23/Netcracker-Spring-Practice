package com.company.KateSamokhvalova.java.task5;

public class SorterStrategy implements Sortable {

    private Sortable sort;

    public SorterStrategy(Sortable sort) {
        this.sort = sort;
    }

    public SorterStrategy() {}

    @Override
    public void executeSort(int[] array) {
        sort.executeSort(array);
    }

    public Sortable getSort() {
        return sort;
    }

    public void setSort(Sortable sort) {
        this.sort = sort;
    }
}
