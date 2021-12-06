package com.space.se01.sandbox;

import java.util.Scanner;

public class Car {
    void beep() {
        System.out.println("Beep CAR");
    }
}

class Sedan extends Car {
    void beep() {
        System.out.println("Beep SEDAN");
    }
}

class Hatchback extends Car {
    void beep() {
        System.out.println("Beep HATCHBACK");
    }
}


class HelloWorld {
    static void sound(Car car) {
        System.out.print("Beeping: ");
        car.beep();
    }

    public static void main(String []args)  {
        /*sound(new Sedan());
        sound(new Hatchback());
        sound();*/
        Scanner scanner = new Scanner(System.in);
        int heightOfTheBus = scanner.nextInt();

        int numberOfBridges = scanner.nextInt();
        System.out.println();

        Integer[] heightsOfTheseBridges = new Integer[numberOfBridges];
        for (int i = 0; i < numberOfBridges; i++) {
            heightsOfTheseBridges[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < numberOfBridges; i++) {
            if (heightOfTheBus <= heightsOfTheseBridges[i]  ) {
                k++;
                System.out.println("Will crash on bridge " + (i + 1));
            }
        }
        if (k == 0) {
            System.out.println("Will not crash");
        }
    }
}
