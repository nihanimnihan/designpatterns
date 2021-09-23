package creational.factory;

public class Node20 implements Phone {

    private final String model;
    private final int size;

    public Node20(String model, int size) {
        this.model = model;
        this.size = size;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Node20{" +
                "model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
