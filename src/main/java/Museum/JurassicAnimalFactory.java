package Museum;

import java.util.Arrays;
import java.util.List;

/**
 * Factory for creating Jurassic era animals
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {
    /**
     * returns name of era
     * @return Jurassic
     */
    @Override
    public String getEra() {
        return "Jurassic";
    }

    /**
     * creates land animals
     * @return list of land animals
     */
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Stegosaurus());
    }

    /**
     * creates sea animals
     * @return list of sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Plesiosaurus());
    }

    /**
     * creates sky animals
     * @return list of sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterodactylus());
    }
}
