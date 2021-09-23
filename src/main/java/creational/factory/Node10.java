package creational.factory;

public class Node10 implements Phone {

    private final String model;
    private final int size;

    public Node10(String model, int size) {
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
        return "Node10{" +
                "model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
