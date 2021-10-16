package creational.strategy;

public class SallarDuck extends Duck {

    public SallarDuck(IFlyBehavior iFlyBehavior) {
        super(iFlyBehavior);
    }

    @Override
    public void performFly() {
        iFlyBehavior.fly();
    }
}
