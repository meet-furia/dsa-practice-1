package recursion;

public class RecursionBasics {
    public static void main(String[] args) {
        print1toN(1,5);
        System.out.println();
        printNto1(5,1);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(finonacci(5));
        System.out.println(factorialIterative(5));
        System.out.println(sumOfDigits(1234, 0));
        System.out.println(sumOfDigitsKK(1234));
        System.out.println(productOfDigitsKK(1234));
        System.out.println(reverseANumberIteratively(1234));
        int res = countNumOfZeroes(1020245000);
        System.out.println(res);
    }

    static void print1toN(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        print1toN(start + 1, end);
    }

    static void printNto1(int end, int start) {
        if (end < start) {
            return;
        }
        System.out.print(end + " ");
        printNto1(end - 1, start);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int factorialIterative(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = temp * i;
        }
        return temp;
    }

    static int finonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return finonacci(n-1) + finonacci(n - 2);
    }

    static int sumOfDigits(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int remainder = n % 10;
        sum = sum + remainder;
        return sumOfDigits(n/10, sum);
    }
    static int sumOfDigitsKK(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigitsKK(n/10);
    }

    static int productOfDigitsKK(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * productOfDigitsKK(n/10);
    }

    static int reverseANumberIteratively(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n/10;
        }
        return sum;
    }

    static int countNumOfZeroes(int n) {
        if (n % 10 == n) {
            if (n == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
        if (n % 10 == 0){
            return 1 + countNumOfZeroes(n/10);
        }
        else {
            return 0 + countNumOfZeroes(n/10);
        }
    }
}
