package designPatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            return instance = new LazySingleton();
        }
        else{
            return instance;
        }
    }
}
