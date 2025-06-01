package ex_14062024;

public class Lab026 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);

    }
}
