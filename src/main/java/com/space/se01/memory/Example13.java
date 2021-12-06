package com.space.se01.memory;

public class Example13 {

    public static void main(String[] args) {
        ColoredPoint[] colored = new ColoredPoint[10];

        Point[] pa = colored; //вариантность
        //Point[] pa = colored.clone();
        /*pa[1] = new Point(1, 1); *//* Получим ошибку при запуске программы: Exception in thread "main"
        java.lang.ArrayStoreException: com.space.se01.memory.Point
	    at com.space.se01.memory.Example13.main(Example13.java:10)  */

        pa[1] = new ColoredPoint(1,1, 1); // Так можем
        System.out.println(pa[1] == null);

        colored[0] = new ColoredPoint(1, 1, 1);
        System.out.println(pa[0] == null);
        System.out.println(pa[0] instanceof Point);
        System.out.println(pa[0] instanceof ColoredPoint);

        Point[] newPoint = new Point[8];
        newPoint[1] = new ColoredPoint(1,1, 1);
        System.out.println(newPoint[1]);
        /*try {
            pa[0] = new Point();
        } catch (ArrayStoreException e) {
            System.out.println(e);
        }*/
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class ColoredPoint extends Point {
    int color;

    @Override
    public String toString() {
        return "ColoredPoint{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }

    public ColoredPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;

    }
}