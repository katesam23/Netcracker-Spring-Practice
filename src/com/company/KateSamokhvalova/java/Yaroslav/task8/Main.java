package com.company.KateSamokhvalova.java.Yaroslav.task8;

public class Main {

    public static void main(String[] args) throws Exception {
	SeasonService seasonService = SeasonService.INSTANCE;

    seasonService.showSeason(Month.APRIL);
    seasonService.showSeason(Month.JUNE);
    }
}
