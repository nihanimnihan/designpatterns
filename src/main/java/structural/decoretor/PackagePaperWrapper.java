package structural.decoretor;

public class PackagePaperWrapper extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PackagePaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public  String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }

    public double cost() {
        return 3 + flowerBouquet.cost();
    }
}