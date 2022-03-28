package com.company.KateSamokhvalova.java.task8;

import java.util.EnumMap;
import java.util.concurrent.Callable;

public enum SeasonService {
    INSTANCE;

    private EnumMap<Month, Callable<Season>> enumMap;

    SeasonService() {
        enumMap = new EnumMap<Month, Callable<Season>>(Month.class);

        for (Month month: Month.values()) {
            if(month.ordinal() < 3){
                enumMap.put(month, () -> Season.WINTER);
            }
            else if(month.ordinal() >= 3 && month.ordinal() < 6){
                enumMap.put(month, () -> Season.SPRING);
            }
            else if(month.ordinal() >= 6 && month.ordinal() < 9){
                enumMap.put(month, () -> Season.SUMMER);
            }
            else if(month.ordinal() >= 9){
                enumMap.put(month, () -> Season.AUTUMN);
            }

        }
    }

    void showSeason(Month month) throws Exception {
        Season season = enumMap.get(month).call();
        System.out.println(month.name() + " - это " + season.name() + " и " + season.getDescription());
    }
}
