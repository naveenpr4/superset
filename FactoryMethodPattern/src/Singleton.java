public class Singleton {
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public method to provide access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
