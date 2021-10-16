package creational.strategy;


public class DuckStrategy {

    private static IFlyBehavior iFlyBehavior;

    public static void main(String[] args) {
        IFlyBehavior iFlyBehavior = new ImplNoFly();

        SallarDuck sallarDuck = new SallarDuck(iFlyBehavior);
    }
}
