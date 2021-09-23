package creational.factoryabstract;

public class Node20PhoneFactory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, int size) {
        return new Node20(model, size);
    }
}
