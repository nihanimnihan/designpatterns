package creational.strategy;

public abstract class Duck {
    protected IFlyBehavior iFlyBehavior;

    public Duck(IFlyBehavior iFlyBehavior) {
        this.iFlyBehavior = iFlyBehavior;
    }

    public void swim() {}

    public void performFly() {
        iFlyBehavior.fly();
    }
}
