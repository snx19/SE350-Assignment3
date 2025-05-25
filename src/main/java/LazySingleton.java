/**
 * LazySingleton creates up to 3 instances when requested
 */
public class LazySingleton {
    private static LazySingleton[] instance = new LazySingleton[3];
    private int id;

    /**
     * private constructor
     * @param id the id of the instance
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("Lazy Singleton " + id + " instantiated");
    }

    /**
     * returns LazySingleton instance at index
     * creates if not created already
     * @param index the index of the instance
     * @return instance index
     */
    public static LazySingleton getInstance(int index) {
        if (instance[index] == null) {
            instance[index] = new LazySingleton(index);
        }
        return instance[index];
    }

    /**
     * return the id of LazySingleton instance
     * @return the id
     */
    public int getId() {
        return id;
    }
}
