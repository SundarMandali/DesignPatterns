package creational.singleton;

public class LazySingleton {
	private static LazySingleton instance=null;
	private LazySingleton() {
		
	}
	public static LazySingleton getInstance() {
		if(instance==null) {
			return new LazySingleton();
		}
		return instance;
	}
}
