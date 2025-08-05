package Basic;

class Car {
    String car1;

    Car(String x) {
        this.car1 = x;
    }

    void start(){
        System.out.println(this.car1 + "Start");
    }

    void stop(){
        System.out.println(this.car1 + "Stop");
    }
}

public class CarConstructor {
    public static void main(String[] args) {
        Car cl = new Car("BMW");
        Car cl1 = new Car("AUDI");
        cl.start();
        cl.stop();
        cl1.start();
        cl1.stop();
    }
}
