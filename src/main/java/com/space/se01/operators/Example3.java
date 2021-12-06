package com.space.se01.operators;

/*
    Сранение вычисления по сокращенной схеме: && и ||
    и вычисления по полной схеме: & и |
*/
public class Example3 {
    public static void main(String[] args) {
        if (left() & right()) {
            System.out.println("Here 1");
        }

        if (left() && right()) {
            System.out.println("Here 2");
        }
    }

    public static boolean left() {
        System.out.println("Called left");
        return false;
    }

    public static boolean right() {
        System.out.println("Called right");
        return true;
    }
}
 class Example3$1 {
    // Пример в котором рассматривается Тернарный оператор: ? (if-then-else)
    public static void main(String[] args) {

        /*
            Стандартная запись через
            if (...) {
            ...
            } else {
            ...
            }
        */
        System.out.print("Standard: "); // Для наглядности в консоли :)
        if (Example3.right()) {
            System.out.println("This method returned True");
        } else {
            System.out.println("This method returned False");
        }

        //  Запись через Тернарный оператор: ? (if-then-else )
        System.out.print("Ternary: "); // Для наглядности в консоли :)
        System.out.println(Example3.right() ? "This method returned True" : "This method returned False");
     }
}