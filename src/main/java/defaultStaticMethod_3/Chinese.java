package defaultStaticMethod_3;

/**
 * @author SongYu
 * @version 1.0.0
 * @ClassName Chinese.java
 * @Description
 * @createTime 2022年04月13日 22:26:00
 */
public interface Chinese {
    static final String flag = "中华人民共和国万岁！";
    static String patriotism(){
        return flag;
    }
}
