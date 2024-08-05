package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class SimpleStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        names.stream().forEach(n -> System.out.println(n));
    }
}