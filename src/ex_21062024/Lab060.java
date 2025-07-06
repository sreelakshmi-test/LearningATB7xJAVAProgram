package ex_21062024;

import java.util.Scanner;

public class Lab060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet!!, i will tell you its vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);
//boolean value is not supported in switch and same case name is not supported
        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
        //OR do this optimised code
        switch (user_input){
            case 'a','i','o','u','e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
    }
}
