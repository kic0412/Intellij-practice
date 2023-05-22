package ch04;

public class ObjectArgumentDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        zero(c1);
        System.out.println("원(c1)의 반지름 : " + c1.radius);

        zero(c2.radius);
        System.out.println("원(c2)의 반지름 : " + c2.radius);
    }

    public static void zero(Circle c) {
        c.radius = 0.0;
    }

    public static void zero(double r) {
        r = 0.0;
    }
}
