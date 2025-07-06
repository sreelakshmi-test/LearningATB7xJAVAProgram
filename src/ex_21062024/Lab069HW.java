package ex_21062024;

public class Lab069HW {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Check for multiples of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
