package Museum;

import java.util.List;
public class NaturalHistoryMuseum {
    public static void main(String[] args) {
        // set up the exhibit
        AnimalAbstractFactory cenozoic = new CenozoicAnimalFactory();
        System.out.println("You are in the " + cenozoic.getEra() + " exhibition");
        System.out.println("===== " + cenozoic.getEra() + " land animals section =====");
        List<LandAnimal> cenozoicLandAnimals = cenozoic.createLandAnimals();
        for (LandAnimal a : cenozoicLandAnimals) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }
        System.out.println("===== " + cenozoic.getEra() + " sea animals section =====");
        List<SeaAnimal> cenozoicSeaAnimals = cenozoic.createSeaAnimals();
        for (SeaAnimal a : cenozoicSeaAnimals) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }
        System.out.println("===== " + cenozoic.getEra() + " sky animals section =====");
        List<SkyAnimal> cenozoicSkyAnimals = cenozoic.createSkyAnimals();
        for (SkyAnimal a : cenozoicSkyAnimals) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }
        System.out.println("Thank you for visiting the " + cenozoic.getEra() + " exhibition\n");

        AnimalAbstractFactory jurassic = new JurassicAnimalFactory();
        System.out.println("You are in the " + jurassic.getEra() + " exhibition");
        System.out.println("===== " + jurassic.getEra() + " land animals section =====");
        List<LandAnimal> jurassicLandAnimals = jurassic.createLandAnimals();
        for (LandAnimal a : jurassicLandAnimals) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }
        System.out.println("===== " + jurassic.getEra() + " sea animals section =====");
        List<SeaAnimal> jurassicSeaAnimals = jurassic.createSeaAnimals();
        for (SeaAnimal a : jurassicSeaAnimals) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }
        System.out.println("===== " + jurassic.getEra() + " sky animals section =====");
        List<SkyAnimal> jurassicSkyAnimals = jurassic.createSkyAnimals();
        for (SkyAnimal a : jurassicSkyAnimals) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }
        System.out.println("Thank you for visiting the " + jurassic.getEra() + " exhibition");
    }
}
