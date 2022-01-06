package CodeTest2;

public class FactorialMain {
    public static int factorialMethod(int n) {
        int number = n;
        int fact = 1;
        for (int i = n; i>= 1; i--) {
            fact *= i;

        }
return  fact;

    }

}
