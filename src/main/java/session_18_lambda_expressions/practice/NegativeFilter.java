package session_18_lambda_expressions.practice;

import java.util.List;

@FunctionalInterface
public interface NegativeFilter {

    List<Integer> filter (List<Integer> numbers);
}