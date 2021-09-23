package creational.factory;

public class PhoneFactory {

    public static Phone getPhone(String model, int size) {

        if (model.equalsIgnoreCase("Node20")) {
            return new Node20(model, size);
        } else if (model.equalsIgnoreCase("Node10")) {
            return new Node10(model, size);
        } else {
            throw new RuntimeException("Not accessible model");
        }
    }
}
