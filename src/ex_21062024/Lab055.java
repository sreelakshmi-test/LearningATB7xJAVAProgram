package ex_21062024;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the number1");
        int user_input = sc.nextInt();
        System.out.println("Enter the number2");
        int user_input2 = sc.nextInt();
        //System.out.println(Math.max(user_input,user_input2));
        if(user_input>user_input2){
            System.out.println(user_input);
        }else if(user_input<user_input2){
            System.out.println(user_input2);
        }
        else {
            System.out.println("equal");
        }
    }
}
