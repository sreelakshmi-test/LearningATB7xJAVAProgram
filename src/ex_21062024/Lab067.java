package ex_21062024;

import java.util.Scanner;

public class Lab067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number 1!");
        int num1 = sc.nextInt();
        System.out.println("Enter yur number 2!");
        int num2 = sc.nextInt();
        System.out.println("Enter yur number 3!");
        int num3 = sc.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println("largest is"+num1);
        } else if (num2>num1&&num2>num3) {
            System.out.println("largest is"+num2);


        }
        else {
            System.out.println("largest is "+num3);
        }
    }
}
