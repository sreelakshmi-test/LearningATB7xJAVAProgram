package ex_21062024;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        // nextInt() -> input


        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)

        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the number");
        int user_input = sc.nextInt();

        System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
