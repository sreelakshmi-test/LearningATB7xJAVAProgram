package ex_17082024;

public class Lab154 {
    public static void main(String[] amit) {

        try {
            int a = 10/0;
        } catch (Exception pramod) {
            System.out.println("Div by Zero");
            //pramod.getMessage()
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }
    }
}
