package structural.decoretor;

public class PackageGlitter extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PackageGlitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public  String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }

    public double cost() {
        return 4 + flowerBouquet.cost();
    }
}
