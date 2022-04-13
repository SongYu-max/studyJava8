package defaultInterface_1;

/**
 * @author SongYu
 * @version 1.0.0
 * @ClassName Snake.java
 * @Description
 * @createTime 2022年04月13日 22:02:00
 */
public class Snake implements Animal{
    @Override
    public void run() {
        System.out.println("我是蛇，我能爬");
    }
}
