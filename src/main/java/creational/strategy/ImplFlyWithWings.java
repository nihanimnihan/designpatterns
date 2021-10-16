package creational.strategy;

public class ImplFlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
