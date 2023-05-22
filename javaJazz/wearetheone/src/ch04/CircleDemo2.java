package ch04;

class Circle2 {
    double radius;
    String color;

    public Circle2(double r, String c) {
        radius = r;
        color = c;
    }

    public Circle2(double r) {
        radius = r;
        color = "파랑";
    }

    public Circle2(String c) {
        radius = 10.0;
        color = c;
    }

    public Circle2() {
        radius = 10.0;
        color = "빨강";
    }
}

public class CircleDemo2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(10.0, "빨강");
        Circle2 c2 = new Circle2(5.0);
        Circle2 c3 = new Circle2("노랑");
        Circle2 c4 = new Circle2();
    }
}