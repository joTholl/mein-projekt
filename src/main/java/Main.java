public class Main {
    //Aufgabe 1
    static boolean isPositive(int number) {
        return number > 0;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    //Aufgabe 2
    static String getFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        return text.substring(0, 0);
    }

    static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    //Aufgabe 3
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
