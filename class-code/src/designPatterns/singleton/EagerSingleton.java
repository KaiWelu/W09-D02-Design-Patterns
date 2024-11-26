package designPatterns.singleton;

public class EagerSingleton {
//    public final static instance
    private static final EagerSingleton instance = new EagerSingleton();

//    private constructor
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

}
