package creational.strategy;

public class ImplNoFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
