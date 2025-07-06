package ex_04072024;

public class Lab127 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Sree");
        ATBPerson p2 = new ATBPerson("Dua");
        ATBPerson p3 = new ATBPerson("Firoz",976543210);
        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.phone);



        System.out.println(p3.name);
        System.out.println(p3.phone);
    }
}
