package creational.singleton;

/**
 * Better implementation
 */
public class Singleton2 {

	private Singleton2() {}
    
    private static class Holder {    
        public static final Singleton2 instance = new Singleton2();
    }
 
    public static Singleton2 getInstance() {    
        return Holder.instance;    
    }
	
    // other methods
    
}
