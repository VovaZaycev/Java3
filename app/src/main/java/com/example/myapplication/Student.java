package com.example.myapplication;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupnumber;
    public  Student(String name, String groupnumber ){
        this.name=name;
        this.groupnumber=groupnumber;
    }
    public String GetName()
    {
        return name;
    }
    public String GetgroupNumber()
    {
        return groupnumber;
    }
    private final static ArrayList<Student> students=new ArrayList<Student>(
            Arrays.asList(
                    new Student(  "Володимир", "1"),
                    new Student(  "Костантин", "1"),
                    new Student(  "Ольга", "2"),
                    new Student(  "Максим", "2"),
                    new Student(  "Ніколай", "3"),
                    new Student(  "Марія", "4")
            )
    );
    public static ArrayList<Student> getStudents(String groupnumber) {
        ArrayList<Student> stList =new ArrayList<>();
        for (Student s: students)
        {
            if(s.GetgroupNumber().equals(groupnumber))
            {
                stList.add(s);
            }
        }
        return stList;
    }

}
