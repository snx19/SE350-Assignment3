package Museum;
import java.util.Arrays;
import java.util.List;

/**
 * Factory for creating Cenozoic animals
 */
public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    /**
     * returns name of era
     * @return Cenozoic
     */
    @Override
    public String getEra() {
        return "Cenozoic";
    }

    /**
     * creates land animals
     * @return list of land animals
     */
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mammoth(), new CaveLion(), new WoollyRhino());
    }

    /**
     * creates sea animals
     * @return list of sea animals
     */
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Otodus(), new Whale());
    }

    /**
     * creates sky animals
     * @return list of sky animals
     */
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Argentavis());
    }
}
