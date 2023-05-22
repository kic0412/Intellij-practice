package ch04;

class Circle4 {
    double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArrayDemo {
    public static void main(String[] args) {
        Circle4[] circles = new Circle4[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle4(i + 1.0);
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
        }
    }
}
