package creational.factory;

public class PhoneProcessor {

    public static void main(String[] args) {
        Phone node20 = PhoneFactory.getPhone("Node20", 8);
        System.out.println(node20);

        Phone node10 = PhoneFactory.getPhone("Node10", 8);
        System.out.println(node10);
    }
}
