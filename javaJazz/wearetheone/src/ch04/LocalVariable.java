package ch04;

public class LocalVariable {
    public static void main(String[] args) {
        int a = 0;
        double b = 0;

        System.out.println(b);
        int c = 0;
        System.out.println(a+c+33);

        // c = 0;

        //public double d=0.0;

        for (int e = 0; e < 10; e++) {
            //int a = 1;
            System.out.println(e);
            System.out.println(a+b+c);
        }

        short x = 1;
        int y = (int) x;

        short yy = 2;
        int z = (int) yy;
    }
}