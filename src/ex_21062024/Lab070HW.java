package ex_21062024;

import java.util.Scanner;

public class Lab070HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}
