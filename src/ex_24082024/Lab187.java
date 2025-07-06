package ex_24082024;

public class Lab187 {
    public static void main(String[] args) {

        temp("Sree");
        temp(123);
        temp(true);

        sum(3,4);
        sum("sree","sree");

        // T - Ref to the Data Type that you want to use.

    }

    public static <pramod> pramod sum(pramod a, pramod b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <Dutta> void temp(Dutta name) {
        System.out.println(name);
    }
}
