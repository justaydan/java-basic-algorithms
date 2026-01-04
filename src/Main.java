import java.util.Scanner;
import java.util.concurrent.Flow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Task 1:
//        Ask the user to enter a number. Determine if the number is positive, negative, or zero, and print the result.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        String s = number > 0 ? "The number is positive." : (number < 0 ? "The number is negative." : "Number is zero");
//        System.out.println(s);
//        scanner.close();

//        Task 2:
//        Ask the user to enter a number between 1 and 7. Print the corresponding day of the week for that number.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 7: ");
//        int number = scanner.nextInt();
//        if (number < 1 || number > 7) {
//            System.out.println("Wrong number");
//            scanner.close();
//            return;
//        }
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        System.out.println(days[number - 1]);
//        scanner.close();

//        Task 3:
//        Ask the user to enter a number. Using a loop, print all the odd numbers up to that number.

//        System.out.println("Enter a number");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        scanner.close();


//        Task 4:
//
//        Ask the user to enter a number. Perform the following checks:
//        If the number is a palindrome (e.g., 12321), display:
//        If the digits of the number are in increasing order (e.g., 123489), indicate that.
//        If the digits of the number are in decreasing order (e.g., 97530), indicate that.
//        Otherwise, display:  "The digits are neither in increasing nor decreasing order."

//        System.out.println("Enter a number");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        if (checkPalindrome(number)) {
//            System.out.println("The number is palindrome");
//        } else if (checkNumberDecreasing(number)) {
//            System.out.println("The digits are decreasing");
//        } else if (checkNumberIncreasing(number)) {
//            System.out.println("The digits are increasing");
//        } else System.out.println("The digits are neither in increasing nor decreasing order.");
//        scanner.close();

//        Task 5:
//        Ask the user to enter their age and gender (M or F).
//                If the user is under 18, print "Access denied".
//                If the user is 18 or older, print:
//        For M: "Male access granted"
//        For F: "Female access granted"
//        If the user enters an incorrect gender, print "Invalid gender entered".

//        System.out.println("Enter your age: ");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter your gender: ");
//        String gender = scanner.nextLine();
//        if (age < 18) {
//            System.out.println("Access denied");
//        } else {
//            switch (gender) {
//                case "F":
//                    System.out.println("Female access granted");
//                    break;
//                case "M":
//                    System.out.println("Male access granted");
//                    break;
//                default:
//                    System.out.println("Invalid gender entered");
//                    break;
//
//            }
//        }
//        scanner.close();

//        Task 6:
//        Write a program that prints Fibonacci numbers.
//
//                Ask the user how many Fibonacci numbers to print.
//        If the entered number is zero or negative, print "Please enter a valid number".
//                Use loops to print the Fibonacci sequence.
//        Use a to show whether each Fibonacci number is even or odd.
//
//        int a = 0;
//        int b = 1;
//        System.out.println("Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        for (int i = 0; i <= number; i++) {
//            System.out.print(a + " is " + (a % 2 == 0 ? "Even" : "Odd")+ "\n");
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//
//        scanner.close();

//        Task 7:
//        Ask the user to enter a number and calculate its factorial.
//                If the user enters a negative number, print "Factorial does not exist for negative numbers".
//                Use loops and (like i++ or--)during the calculation.
//                Print the result.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        if (number < 0) {
//            System.out.print("Factorial does not exist for negative numbers");
//
//        } else {
//
//            System.out.println("Factorial = " + getFactorial(number));
//
//        }
//        scanner.close();


//        Task 8:
//        A "Strong number" is defined as follows:
//
//        If the sum of the factorials of each digit of the number equals the number itself, then it is a .
//        145 → 1! + 4! + 5! = 1 + 24 + 120 = → ✅
//        123 → 1! + 2! + 3! = 1 + 2 + 6 = ≠ 123 → ❌
//        Calculate the factorial for each digit.
//        Sum them up and compare the result with the original number.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int original = number;
//        long sum = 0;
//        while (number > 0) {
//            int temp = number % 10;
//            sum = sum + getFactorial(temp);
//            number /= 10;
//        }
//        String result = original == sum ? "Given number is a strong number" : "Given number is not a strong number";
//        System.out.println(result);
//        scanner.close();

//        Task 9:
//        An is defined as:
//
//        If the sum of each digit raised to the power of the number of digits equals the number itself, then it is an .
//        153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = → ✅
//        9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = → ✅
//        123 → 1³ + 2³ + 3³ = 1 + 8 + 27 = ≠ 123 → ❌
//        Extract the digits of the number.
//        Count how many digits it has.
//        Raise each digit to the power of the number of digits.
//                Sum the results and compare with the original number.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int digitsCount = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, digitsCount);
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        scanner.close();
    }

    static int countDigits(int number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
        return count;
    }

    static int power(int number, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static long getFactorial(int number) {
        long n = 1;
        for (int i = 1; i <= number; i++) {
            n = n * i;
        }
        return n;
    }

//    public static boolean checkPalindrome(int number) {
//        int temp;
//        int original = number;
//        int n = 0;
//        while (number > 0) {
//            temp = number % 10;
//            n = n * 10 + temp;
//            number = number / 10;
//        }
//        return n == original;
//    }
//
//
//    public static boolean checkNumberDecreasing(int number) {
//        int lastDigit = number % 10;
//        number /= 10;
//        while (number > 0) {
//            int currentDigit = number % 10;
//
//            if (currentDigit <= lastDigit) {
//                return false;
//            }
//            lastDigit = currentDigit;
//            number /= 10;
//        }
//
//        return true;
//    }
//
//    public static boolean checkNumberIncreasing(int number) {
//        int lastDigit = number % 10;
//        number /= 10;
//        while (number > 0) {
//            int currentDigit = number % 10;
//
//            if (currentDigit >= lastDigit) {
//                return false;
//            }
//            lastDigit = currentDigit;
//            number /= 10;
//        }
//
//        return true;
//    }
}