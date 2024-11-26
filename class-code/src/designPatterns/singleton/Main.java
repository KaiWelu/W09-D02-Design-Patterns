package designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        LazySingleton lazySingleton;

        lazySingleton = LazySingleton.getInstance();
    }
}
