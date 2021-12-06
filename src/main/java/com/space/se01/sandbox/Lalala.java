package com.space.se01.sandbox;

import javax.swing.*;

public class Lalala {
    public static void main(String[] args) {
    Biba x = new Biba();
    x.a = 1;
    System.out.println(x.a);

    Biba.MiniBiba z = new Biba().new MiniBiba();
    z.aaa(100000);
    System.out.println(z.b);
    }
}
class Biba {
    int a;
    class MiniBiba {
        int b;


        public void aaa(int b) {

            this.b = b;
        }
    }
}

class Boba {
ImageIcon i = new ImageIcon();
}
