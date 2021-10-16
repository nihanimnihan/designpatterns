package creational.strategy;

import lombok.RequiredArgsConstructor;

public class RedDuck extends Duck {

    public RedDuck(IFlyBehavior iFlyBehavior) {
        super(iFlyBehavior);
    }

    @Override
    public void performFly() {
        iFlyBehavior.fly();
    }
}
