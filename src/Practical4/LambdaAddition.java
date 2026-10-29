package Practical4;

interface Addition {
    int add(int a, int b);
}

public class LambdaAddition {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~\n");

        Addition addition = (a, b) -> a + b;

        int num1 = 25;
        int num2 = 15;
        int result = addition.add(num1, num2);

        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
    }
}