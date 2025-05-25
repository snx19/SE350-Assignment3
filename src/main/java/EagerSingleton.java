/**
 * EagerSingleton creates 3 instances at load time
 */
public class EagerSingleton {
    private static final EagerSingleton[] instance = new EagerSingleton[3];
    private int id;

    /**
     * private constructor
     * @param id the id the instance
      */
    private EagerSingleton(int id) {
        this.id = id;
    }

    // static initializer runs when class loaded
    static {
        for (int i = 0; i < 3; i++) { // creates 3 instances
            instance[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    /**
     * Returns pre-created instance
     * @param index the index of instance
     * @return instance[index] instance at specified index
     */
    public static EagerSingleton getInstance(int index) {
        return instance[index];
    }
    /**
     * returns id of EagerSingleton instance
     * @return id 0-3
      */
    public int getId() {
        return id;
    }
}
