package ex_22062024;

public class Lab096 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for stars
                System.out.println("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
