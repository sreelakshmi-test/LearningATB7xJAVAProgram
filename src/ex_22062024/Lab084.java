package ex_22062024;

public class Lab084 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}
