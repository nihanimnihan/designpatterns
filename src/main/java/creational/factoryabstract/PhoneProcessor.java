package creational.factoryabstract;

public class PhoneProcessor {

    public static void main(String[] args) {
        Node20PhoneFactory node20PhoneFactory = new Node20PhoneFactory();

        Phone node20 = node20PhoneFactory.getPhone("Node20", 8);
        System.out.println(node20);

        Node10PhoneFactory node10PhoneFactory = new Node10PhoneFactory();

        Phone node10 = node10PhoneFactory.getPhone("Node10", 10);
        System.out.println(node10);
    }
}