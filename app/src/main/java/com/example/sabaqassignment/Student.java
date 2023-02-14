package com.example.sabaqassignment;

public class Student
{

    String name;
    String age;
    String no;

    public Student( ) {

    }

    public Student(String name, String age) {

        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
