package ex_04072024;

public class Lab123 {

        int e= 45; // Instance Variable != Global Variable

        void f1(){
            int e = 10; // Local Variable
            System.out.println(e);
        }

        void f2(){
            e = 50;
            System.out.println(e);
        }
    }

