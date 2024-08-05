package session_18_lambda_expressions.practice;

public class IntSumPractice {

    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;
        System.out.println(result.sum(10, 15));
    }
}