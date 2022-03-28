package com.company.KateSamokhvalova.java.task8;

import com.company.KateSamokhvalova.java.task5.SelectionSort;

public class Main {

    public static void main(String[] args) throws Exception {
	SeasonService seasonService = SeasonService.INSTANCE;

    seasonService.showSeason(Month.APRIL);
    seasonService.showSeason(Month.JUNE);
    }
}
