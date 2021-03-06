public class Main {
    public static void main(String[] args) {

        Car mazda = new Car();
        mazda.start();
        Car bmw = new Car("BMW", 250, true, 15);
        System.out.println(bmw.carSpeed(10));

/*
Make (add code to class Tank),
with fuel and different constructors
*/
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(30);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
        justTank.refill("54 литров солярки");
        anywareTank.refill("?");
        customTank.refill("?");

/*
This fragment of code has to output

The Tank is at 100, 0 now.
The Tank is at 110, 10 now.
The Tank is at 220, 30 now.

*/
    }
}
