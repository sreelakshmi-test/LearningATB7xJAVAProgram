package ex_29072024;

public class Animal {
    String name = "LOL";
    String color;


    void walk() {
    }

    void talk() {
    }

    public static void main(String[] args) {
        Animal animalrRef = null;//null space is alocated in heap area
        Animal animalrRef2 = new Animal();
        Animal animalrRef3 = new Animal();
        Animal animalrRef4 = animalrRef2;//actually refered no memory allocated
        System.out.println(animalrRef3.name);
    }
}
