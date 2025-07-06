package ex_29072024.hasA;

public class Car {
    // Aggregation - hasA
    protected void StartTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }
}
