package com.space.se01.sandbox;

public class MoveRobot {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        Direction startDirection = robot.getDirection();

        if (toX > startX) {
            if (startDirection.equals(Direction.UP)) {
                robot.turnRight();
            } else if (startDirection.equals(Direction.DOWN)) {
                robot.turnLeft();
            } else if (startDirection.equals(Direction.LEFT)) {
                robot.turnRight();
                robot.turnRight();
            } else if (startDirection.equals(Direction.RIGHT)) {
            }

            int steps = toX - startX;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }

        } else if (toX < startX) {
            if (startDirection.equals(Direction.UP)) {
                robot.turnLeft();
            } else if (startDirection.equals(Direction.DOWN)) {
                robot.turnRight();
            } else if (startDirection.equals(Direction.LEFT)) {

            } else if (startDirection.equals(Direction.RIGHT)) {
                robot.turnRight();
                robot.turnRight();
            }

            int steps = startX - toX;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }

        int startY = robot.getY();
        Direction newDirection = robot.getDirection();

        if (toY > startY) {
            if (newDirection.equals(Direction.UP)) {

            } else if (newDirection.equals(Direction.DOWN)) {
                robot.turnRight();
                robot.turnRight();
            } else if (newDirection.equals(Direction.LEFT)) {
                robot.turnRight();
            } else if (newDirection.equals(Direction.RIGHT)) {
                robot.turnLeft();
            }

            int steps = toY - startY;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }

        } else if (toY < startY) {
            if (newDirection.equals(Direction.UP)) {
                robot.turnRight();
                robot.turnRight();
            } else if (newDirection.equals(Direction.DOWN)) {

            } else if (newDirection.equals(Direction.LEFT)) {
                robot.turnLeft();
            } else if (newDirection.equals(Direction.RIGHT)) {
                robot.turnRight();
            }

            int steps = startY - toY ;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 10, 15);
        moveRobot(robot, 5, 1);
        System.out.println("X: " + robot.getX() + "\n"
                            + "Y: " + robot.getY());
    }

}

class Robot {
    public Direction direction;
    public int x;
    public int y;

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return this.direction;
    }

    public int getX() {
        // текущая координата X
        return this.x;
    }

    public int getY() {
        // текущая координата Y
        return this.y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (this.direction) {
            case UP:
                this.direction = Direction.LEFT;
                break;
            case RIGHT:
                this.direction = Direction.UP;
                break;
            case DOWN:
                this.direction = Direction.RIGHT;
                break;
            case LEFT:
                this.direction = Direction.DOWN;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (this.direction) {
            case UP:
                this.direction = Direction.RIGHT;
                break;
            case RIGHT:
                this.direction = Direction.DOWN;
                break;
            case DOWN:
                this.direction = Direction.LEFT;
                break;
            case LEFT:
                this.direction = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        switch (this.direction) {
            case UP:
                this.y += 1;
                break;
            case RIGHT:
                this.x += 1;
                break;
            case DOWN:
                this.y -= 1;
                break;
            case LEFT:
                this.x -= 1;
                break;
            }
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
