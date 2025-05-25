package Museum;
import java.util.List;

/**
 * abstract factory for land, sea, and sky animals
 */
public interface AnimalAbstractFactory {
    /**
     * gets animal era
     * @return era
     */
    String getEra();
    /**
     * creates land animals
     * @return land animals
     */
    List<SkyAnimal> createLandAnimals();

    /**
     * creates sea animals
     * @return sea animals
     */
    List<SeaAnimal> createSeaAnimals();

    /**
     * create sky animals
     * @return sky animals
     */
    List<SkyAnimal> createSkyAnimals();
}
