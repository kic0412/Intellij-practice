public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String out = "";

            if (i%3 == 0) {
                out += "fizz";
//              단축키: CTRL + Shift + Enter ( ★ 숙지 필수 ) / 작동이 되는 경우와 안되는 경우를 연습합니다.


            }

            if (i%5 == 0) {
                out += "buzz";
            }

            if (i % 3 != 0 && i % 5 !=0) {
                out += i ;
            }
            System.out.println(out);
        }

    }
}