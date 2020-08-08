package pl.javastart.exercise.liczbyZeStrumienia;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        System.out.println(numbersStream());

    }

    public static List<Integer> numbersStream() {
        List<Integer> collect = Stream.iterate(8, number -> number + 1)
                .limit(150)
                .filter(App::divideByFiveAndGraterThenOneHundret)
                .map(number -> number * 3)
                .limit(10)
                .collect(Collectors.toList());

        return collect;
    }

    private static boolean divideByFiveAndGraterThenOneHundret(Integer number) {
        return (number > 100 & number % 5 == 0);
    }
}
