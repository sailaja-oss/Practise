abstract class Bike {

    abstract public void run();

    public void showBikeDetails() {
        System.out.println("Bike abstract class showBikeDetails is called");
    }
}

public class AbstractClass extends Bike {
    @Override
    public void run() {
        System.out.println("Run implementation inside AbstactClass");
    }

    public static void main(String[] args) {
        Bike ab = new AbstractClass();
        ab.run();
        ab.showBikeDetails();
        System.out.println("");

        //
        // AbstractClassExample ab=new AbstractClassExample();
        // ab.run();
        // ab.showBikeDetas();
    }
}
