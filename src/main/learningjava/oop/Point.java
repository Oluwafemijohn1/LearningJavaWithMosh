package main.learningjava.oop;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    //    @Override
//    public boolean equals(Object obj) {
//        if (obj == null)
//            return false;
//        if (obj == this)
//            return true;
//        if (!(obj instanceof Point))
//            return false;
//        Point other = (Point) obj;
//        return this.x == other.x && this.y == other.y;
//    }
//
//    @Override
//    public  int hashCode() {
//            return Objects.hash(x, y);
//    }
}
