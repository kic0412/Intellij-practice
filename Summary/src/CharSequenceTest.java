public class CharSequenceTest {
    static void show(CharSequence cs) {
        System.out.println(cs);
    }

    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new String("meltdown"));
        show(new String("!@#"));
    }
}
