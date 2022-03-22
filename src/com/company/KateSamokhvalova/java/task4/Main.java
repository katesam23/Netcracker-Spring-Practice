package com.company.KateSamokhvalova.java.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100: ");
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        try {
            String str1 = scanner.next();
            checker.validate(str1);
        }catch (NumException exception){

            System.out.println("Число выходит за диапазон");
        }catch (WordException exception){
            System.out.println("Это строка!");
        }
    }
}
