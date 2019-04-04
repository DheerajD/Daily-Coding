public class EagerInitializationSingleton {
	private static final EagerInitializationSingleton obj = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {}		//private constructor
	
	public static EagerInitializationSingleton getInstance() {
		return obj;
	}
}