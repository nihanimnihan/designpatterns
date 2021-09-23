package creational.factoryabstract;

public class Node10PhoneFactory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, int size) {
        return new Node10(model, size);
    }
}
