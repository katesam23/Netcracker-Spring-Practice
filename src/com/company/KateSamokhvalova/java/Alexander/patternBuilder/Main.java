package com.company.KateSamokhvalova.java.Alexander.patternBuilder;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal animal1 = new Animal.Builder("Zeze", "female").withParent("Kate").withPoroda("French Bulldog").withWeight(10)
                .build();
    }
}
