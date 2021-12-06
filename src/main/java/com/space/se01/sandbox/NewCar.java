package com.space.se01.sandbox;

public class NewCar {
    void beep() {
        System.out.println("Beep CAR");
    }
}

class NewSedan extends NewCar {
    @Override
    void beep() {
        System.out.println("Beep SEDAN");
    }

    void imSedan() {
        System.out.println("SEDAN");
    }
}

class NewHatchback extends NewCar {
    @Override
    void beep() {
        System.out.println("Beep HATCHBACK");
    }
}


class Mainn {
    /*static void sound(Object car) {
        System.out.println("Beeping");

       *//* if (car instanceof NewCar) {
            NewCar castedCar = (NewCar) car;
            castedCar.beep();
        }*//*

        if (car instanceof NewCar) ((NewCar)car).beep(); // simplified variant


        if (car instanceof NewSedan) {
            ((NewSedan)car).imSedan();
        }
        System.out.println();
    }*/
    static void sound(Object car) {
        System.out.print("Beeping: ");

        if (car instanceof NewCar) {
            ((NewCar)car).beep();
        } else {
            System.out.println("Parameter witch was passed in the method is not instance of the class NewCar!");
        }


        if (car instanceof NewSedan) {
            System.out.print("Type: ");
            ((NewSedan)car).imSedan();
        } else {
            System.out.println("Type: " + "Parameter witch was passed in the method is not instance of the class NewSedan!");
        }
        System.out.println();
    }

    public static void main(String []args){
        sound(new String());
        sound(new NewSedan());
        sound(new NewHatchback());
    }
}

