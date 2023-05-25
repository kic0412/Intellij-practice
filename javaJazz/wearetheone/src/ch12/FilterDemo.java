package ch12;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        System.out.println("문자열 스트림 : ");
        Stream.of("a1","b1","b2","c1","c2","c3")
                .filter(s -> s.startsWith("c"))
                .skip(1).forEach(Util::print);

        System.out.println("\n정수 스트림 : ");
        IntStream.of(1,2,1,3,3,2,4)
                .filter(i -> i % 2 ==0)
                .distinct().forEach(Util::print);

        /*System.out.println("\n인구가 1억 이상의 2개 나라 : ");
        List.of()
                .spliterator(p -> p.getPopulation() > 100.0)
                .limit(2).forEach(Util.pirntWithParenthesis);*/
    }
}
