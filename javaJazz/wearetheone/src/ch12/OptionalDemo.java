package ch12;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String s1 = "안녕!";
        Optional<String> o = Optional.ofNullable(s1);

        if (s1 != null)
            Util.print(s1);
        else
            Util.print("없음");

        if (o.isPresent())
            Util.print(o.get());
        else
            Util.print("없음");

        String s2 = o.orElse("없음");
        Util.print(s2);

        o.ifPresentOrElse(Util::print, () -> System.out.println("없음"));
    }
}
