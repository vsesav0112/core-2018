package com.space.se01.memory;

import com.space.se01.main.Student;

import java.util.Arrays;

public class Example12 {
    public static void main(String[] args) {
       /* int[][] arr = {
                {1, 2, 3},
                {1, 2, 3}
        };*/

        int[] values = {1, 2, 3};
        int[] clone = values.clone();

        values[0] = -1;
        System.out.println(values);
        System.out.println(clone);

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(clone));

        Student[] students = {
                new Student("a", "a", 1),
                new Student("b", "b", 2)
        };

        Student[] clone1 = students.clone();
        clone1[0].setAge(3);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(clone1));
    }
}
