package com.company.KateSamokhvalova.java.task8;

public enum Season {
    WINTER("холодно"),
    SPRING("тепло"),
    SUMMER("жарко"),
    AUTUMN("дождливо");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
