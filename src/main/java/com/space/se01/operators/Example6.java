package com.space.se01.operators;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {
        String[] ourStrings = {"a", "b", "c"};

        // Стандартая форма записи
        for (int i = 0 ; i < ourStrings.length; i++) {
            System.out.println(ourStrings[i]);
        }

        // Сокращенная (Более предпочтительная!)
        for (String curr : ourStrings) {
            System.out.println(curr);
        }
    }
}

class Example6$1 {
    // Отсутпление от темы :)
    public static void main(String[] args) {
        ArrayList<Long> values = new ArrayList<>();

        for (long i = 0 ; i < Integer.MAX_VALUE + 2L; i++) {
            values.add(i);
        }
    }
}

class Example6$2{
    //оператор break и метки
    public static void main(String[] args) {
        metka: for (int i = 0; i < 100; ++i) { // ставим метку для возможности выхода из цикла
            for (int j = 0; i < 100; ++j) {
                for (int k = 0; i < 100; ++k) {
                    if (i + j + k > 3) {
                        System.out.println(i + " " + j + " " + k);
                        break metka; /* Если просто написать break, то завершиться
                        текущий цикл if, поэтому ставиться метка (так и назавем ее: metka)
                        */
                    }
                }
            }
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
            if (i > 5) {
                continue;
            }
            System.out.println(i + 1);
        }
    }
}
