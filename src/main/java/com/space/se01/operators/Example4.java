package com.space.se01.operators;

import static java.lang.Math.PI;

import  static  java.lang.Math.abs;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // Будет выведено максимальное значение числа из класса Integer
        System.out.println(Integer.MIN_VALUE); // Будет выведено минимальное значение числа из класса Integer

        System.out.println(Double.MAX_VALUE); // Будет выведено максимальное значение числа из класса Double
        System.out.println(Double.MIN_VALUE); // Будет выведено минимальное прирощение (эпсилон)!!!
    }
}
 class Example4$1 {
   //Статический импорт
    public static void main(String[] args) {
        System.out.println(Math.abs(Math.PI * 3 - Math.PI));
        /*  А теперь предположим, что нам нужно множество раз
            вызывать Math.abs() и Math.PI или вообще какой-то
            какой наш метод или объект...каждый раз придется все прописывать
            Поэтому можно просто импортировать сатитческую перемнную или метод
            См. импорт вверху
            Тогда мы полуыаем:
         */
        System.out.println(abs(PI * 3 - PI)); // Теперь не нужно прописывать Math. ;если убрать импорт - будет ругаться
    }
}
