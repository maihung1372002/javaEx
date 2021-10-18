public class HomeWork2 {
    

    // part 2 Recusive
    
    public static int factorialRe(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRe(n - 1);
        }
    }

    public static int fibonacciRe(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacciRe(n) + fibonacciRe(n - 1);
        }
    }

    public static int lengthOfSenquence(int n) {
        if(n == 1){
            return 1;
        } else {
            return lengthOfSenquence(n - 1) + Integer.toString(n).length();
        }
    }
    
    // compute the greatest common divisor of two given integers.
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // part 3



    // part 4 
    public static boolean isPerfect(int number) {
        int countPer = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                countPer += i;
            }
        }
        if (countPer == number) return true;
        return false;
    }
    public static boolean isDeficient(int number) {
        int countPer = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                countPer += i;
            }
            if (countPer > number) return false;
        }
        if (countPer < number) return true;
        return false;
    }
    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static boolean isPrimeFactor(int number) {
        int multi = 1;
        int n = number;
        int temp = 1;
        for (int i = 2; i <= n; i++) {
            
            // loop i if number can % i ex: 12 = 2*2*3
            while (n % i == 0) {
                if (isPrime(i) && i != temp) {
                    multi *= i;
                    temp = i;
                }
                n /= i;
            }
        }
        if (multi == number) return true;
        return false;
    }


    public static void main(String[] args) {

    }
}
