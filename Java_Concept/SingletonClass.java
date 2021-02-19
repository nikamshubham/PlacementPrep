package Java_Concept;

class SingletonExample{
	public static SingletonExample singletonexample = null;
	private SingletonExample(){		
	}
	public static SingletonExample getSingletonInstance() {
		if(singletonexample == null) {
			singletonexample =  new SingletonExample();
			System.out.println("obj is created ");
		}
		return singletonexample;
	} 
}

public class SingletonClass {
	public static void main(String[] args) {
			SingletonExample.getSingletonInstance();
			SingletonExample.getSingletonInstance();
	}

}
