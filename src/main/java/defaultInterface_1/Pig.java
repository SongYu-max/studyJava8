package defaultInterface_1;

/**
 * @author SongYu
 * @version 1.0.0
 * @ClassName Pig.java
 * @Description
 * @createTime 2022年04月13日 22:01:00
 */
public class Pig implements Animal{
    @Override
    public void run() {
        System.out.println("我是猪，我能跑");
    }
}
