package com.company.KateSamokhvalova.java.Alexander.patternBuilder;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String parentName;
    private String poroda;
    private String pol;

    public static class Builder{
        private Animal animal;

        public Builder(String name, String pol){
            animal = new Animal();
            animal.name = name;
            animal.pol = pol;
        }


        public Builder withWeight(int weight){
            animal.weight = weight;
            return this;
        }

        public Builder withParent(String parentName){
            animal.parentName = parentName;
            return this;
        }

        public Builder withPoroda(String poroda){
            animal.poroda = poroda;
            return this;
        }


        public Animal build(){
            return animal;
        }

    }
}
