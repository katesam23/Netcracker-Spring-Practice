package com.company.KateSamokhvalova.java.Nikita.classwork;

import com.company.KateSamokhvalova.java.Alexander.patternBuilder.Animal;

import java.util.Date;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Integer> grades;
    private Date gradeDate;

    public static class Builder{
        private Student student;

        public Builder(String name, int age, List<Integer> grades){
            student = new Student();
            student.name = "Untitled";
            student.age = -1;
            student.grades = grades;
        }


        public Student.Builder withDate(Date gradeDate){
            student.gradeDate = gradeDate;
            return this;
        }



        public Student build(){
            return student;
        }

    }

}
