package ch06;

class Girl {
    String name;
}

class GoodGirl extends Girl {
    void show() {
        System.out.println("그녀는 자바를 잘 안다.");
    }
}

class BestGirl extends GoodGirl {
    void show() {
        System.out.println("그녀는 자바를 무지하게 잘 안다.");
    }
}

public class GirlTest {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        GoodGirl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

        gg.show();
    }
}
