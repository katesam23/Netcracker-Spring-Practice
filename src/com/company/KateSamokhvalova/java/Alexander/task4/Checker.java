package com.company.KateSamokhvalova.java.Alexander.task4;


public class Checker {
    public void validate(String str) throws NumException, WordException{
        Integer i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException exception){
            throw new WordException();
        }

        if (i < 0 || i > 100){
            throw new NumException();
        }

        System.out.println("Спасибо!");
    }
}
