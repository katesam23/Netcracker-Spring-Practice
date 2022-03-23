package com.company.KateSamokhvalova.java.task1;

public class MyStack {
    private int size;
    private int[] array;
    private int top;

    public MyStack(int max){
        this.size = max;
        array = new int[size];
        top = -1;
    }

   public void add(int element){
        array[++top] = element;
   }

   public int remove(){
        return array[top--];
   }

   public int get(){
        return top;
   }
}