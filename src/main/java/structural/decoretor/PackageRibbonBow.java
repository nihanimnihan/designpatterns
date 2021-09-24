package structural.decoretor;

public class PackageRibbonBow extends FlowerBouquetDecorator {

    FlowerBouquet flowerBouquet;

    public PackageRibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }
    public  String getDescription() {
        return flowerBouquet.getDescription() + ", ribbon bow";
    }

    public double cost()
    {
        return 6.5 + flowerBouquet.cost();
    }
}