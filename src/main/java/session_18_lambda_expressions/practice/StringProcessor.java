package session_18_lambda_expressions.practice;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));
    }
}