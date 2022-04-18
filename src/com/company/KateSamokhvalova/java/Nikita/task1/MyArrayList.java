package com.company.KateSamokhvalova.java.Nikita.task1;

public class MyArrayList {
    private int[] elements;
    private int size;
    private int index;
    private static final int DEFAULT_CAPACITY = 16;

    public MyArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new int[capacity];
    }

    public void add(int value) {
        if (index == elements.length)
            growArray();
        elements[index] = value;
        index++;
        size++;
    }

    // увеличить массив если в нем закончилось место
    private void growArray() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index)
            throw new IllegalArgumentException();
    }

    public void replaceAt(int index, int value) {
        checkIndex(index);
        elements[index] = value;
    }

    public int size() {
        return size;
    }

    // если елемента который равен value не будет, то вернуть -1
    public int indexOf(int value) {
        int result = -1;
        for (int i = 0; i < index; i++) {
            if (elements[i] == value) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean add(int index, int value) {
        checkIndex(index);
        if (index == elements.length)
            growArray();

        System.arraycopy(elements, index, elements, index + 1, this.index - index);
        elements[index] = value;
        this.index++;
        size++;

        return true;
    }

    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, this.index - index);
        size--;
        this.index--;

        return true;
    }
}

