package com.space.se01.main;

public class Student {
    private  String name;
    private  String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    void method() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }
}

class Launcher {
    public static void main(String[] args) {
        Student student = new Student("Vasya", "Vasyliev", 18);
        Student student1 = new Student("Vasya", "Vasyliev", 18);
        System.out.println("Student: " + student + student1 );
    }
}
