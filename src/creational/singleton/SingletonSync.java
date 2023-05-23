package creational.singleton;

public class SingletonSync {

    private static SingletonSync instance;

    private SingletonSync() { }

    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }

}
