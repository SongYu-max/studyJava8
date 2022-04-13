package defaultInterface_1;

public interface Animal {
    void run();
    default void eat(){
        System.out.println("我能吃东西");
    }
}
