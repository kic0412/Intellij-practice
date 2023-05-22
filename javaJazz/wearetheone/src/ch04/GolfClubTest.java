package ch04;

class GolfClub {
    String kind;
    int number;

    GolfClub(int number) {
        this.kind = "아이언";
        this.number = number;
    }

    GolfClub(String kind) {
        this.kind = kind;
        this.number = 0;
    }

    GolfClub() {
        this.kind = "아이언";
        this.number = 7;
    }

    void print() {
        if (number == 0)
            System.out.printf("%s입니다.\n", kind);
        else
            System.out.printf("%d번 아이언입니다.\n", number);
    }
}

public class GolfClubTest {
    public static void main(String[] args) {
        //기본값으로 설정된 7이 입력됨
        GolfClub g1 = new GolfClub();
        g1.print();

        //변수에 숫자가 입력되서 첫번째 메서드 적용
        GolfClub g2 = new GolfClub(8);
        g2.print();

        //변수에 글자가 입력되서 두번째 메서드 적용
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
