package ex_22062024;

public class Lab082 {
    public static void main(String[] args) {
        // Loop with condition
        //
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
            // i from 1 to 10, 10 times
            if (i == 5) {
                break;
                //System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }
    }
}
