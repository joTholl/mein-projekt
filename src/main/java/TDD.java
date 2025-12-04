public class TDD {
    //Aufgabe 1
    public static int sum(int a, int b) {
        return a + b;
    }

    //Aufgabe 2
    static boolean isEven(int a) {
        return a % 2 == 0;
    }

    //Aufgabe 3
    static char getFirstCharacter (String text){
        return text.charAt(0);
    }

    //Aufgabe 4
    static String reverseString (String text){
        String output = "";
        for(int i = text.length()-1; i >=0; i--){
            output += text.charAt(i);
        }
        return output;
    }

    //Aufgabe 5
    static boolean isPalindrome (String text){
        text = text.toLowerCase();
        int start = 0;
        for (int end = text.length()-1; end >= (text.length()-1)/2; end--){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
        }
        return true;
    }

    //Aufgabe 6
    static int countVowels (String text){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++){
            if (vowels.contains(text.substring(i, i+1))){
                count++;
            }
        }
        return count;
    }

    //Aufgabe 7
    static int factorial (int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    //Aufgabe 8
    static int fibonacci(int n){
        int fib1 = 1;
        int fib2 = 0;
        int result = 0;
        while (n>0){
            result = fib1+fib2;
            fib1 = fib2;
            fib2 = result;
            n--;
        }
        return result;
    }

    //Aufgabe 9
    static int[] mergeArrays(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++){
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            result[i+a.length] = b[i];
        }
        return result;
    }
}
