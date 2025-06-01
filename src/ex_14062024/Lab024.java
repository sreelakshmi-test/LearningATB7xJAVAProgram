package ex_14062024;

public class Lab024 {
    public static void main(String[] args) {
        byte b=20;
        int a=b;//implicit casting jvm--widening

        int     c=24;
        //byte d=c;//error bcz explicit casting// narrowing
        byte d=(byte) c;


    }
}
