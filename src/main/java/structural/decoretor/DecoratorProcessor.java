package structural.decoretor;

public class DecoratorProcessor {

    public static void main(String[] args) {
        /*Rose bouquet with no decoration*/
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());

        /*Rose bouquet with paper wrapper, ribbon bow, and glitter*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PackagePaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new PackageRibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new PackageGlitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());

        /*Orchid bouquet with double paper wrapper and ribbon bow*/
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PackagePaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PackagePaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PackageRibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
    }
}