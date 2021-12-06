package com.space.se01.memory;

public class Example11 {
    public static void main(String[] args) {
        // STRING_POOL
        // "abc"         <- str1, str2, one.one, two.two, str[0], str[1]

        // HEAP
        // "abc"         <- str3

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);

        str2 = new String("abc");
        System.out.println(str1 == str2);

        str2 = str2.intern();
        System.out.println(str1 == str2);

        String str3 = new String("abc"); // создаем новый объект п средством new, так что уже не ссылаемся на
                                                // "abc из STRING_POOL
        System.out.println(str1 == str3);

       System.out.println(Runtime.getRuntime().availableProcessors());

       One one = new One();
       Two two = new Two();

       //two.two = new String("abc");

       System.out.println(one.one == two.two);

       String[] str = {"abc", "abc"};

       System.out.println(str1 == str[0]);
       System.out.println(str[0] == str[1]);
    }
}
class One {
    String one = "abc";
}
class Two {
    String two = "abc";
}
