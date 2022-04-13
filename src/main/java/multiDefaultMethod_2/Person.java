package multiDefaultMethod_2;

public interface Person {
    default void selfIntroduction(){
        System.out.println("我是人");
    }
}
