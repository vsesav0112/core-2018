package com.space.se01.operators;

public class Example8 {
    public static void main(String[] args) {
        doLogic(new BaseCourse());
        doLogic(new OptionalCourse());
        doLogic(new FreeCourse());

        if ("123" instanceof String) {
            System.out.println("This's string!");
        }
    }

    private static void doLogic(Course object) {
        if (object instanceof BaseCourse) {
            ((BaseCourse)object).getLevel(); // (casting)
            System.out.println("BaseCourse");
        } else if (object instanceof OptionalCourse) {
            System.out.println("OptionalCourse");
        } else {
            System.out.println("Something?!?!?!");
        }
    }
}
class Course extends Object {}
class BaseCourse extends Course {
    public int getLevel() {
        return 4;
    }
}
class FreeCourse extends BaseCourse {}
class OptionalCourse extends Course {}