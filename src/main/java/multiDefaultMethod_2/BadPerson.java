package multiDefaultMethod_2;

/**
 * @author SongYu
 * @version 1.0.0
 * @ClassName BadPerson.java
 * @Description
 * @createTime 2022年04月13日 22:16:00
 */
public class BadPerson implements Person,Shit{

    /**
     * 方法一
     */
    @Override
    public void selfIntroduction() {
        Person.super.selfIntroduction();
    }

    /**
     * 方法二  //todo 方法二行不通啊
     */
//    public void selfIntroduction() {
//        Person.super.selfIntroduction();
//    }
}
