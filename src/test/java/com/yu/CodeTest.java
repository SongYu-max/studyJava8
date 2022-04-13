package com.yu;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author SongYu
 * @version 1.0.0
 * @ClassName CodeTest.java
 * @Description 杂七杂八代码测试
 * @createTime 2022年04月13日 09:21:00
 */
public class CodeTest {
    /**
     * 测试long型做除法返回浮点型
     * @return
     */
    @Test
    public void calTest(){
//        //方法1：
//        long a = 1269;
//        float b = 1024;
//        System.out.println(a/b);      //输出结果1.2392578
        //方法2：
        long a = 1269;
        long b = 1024;
        double c = (Math.round(a*1000/b)/1000.0);//保留3位小数意思
        System.out.println(c);        //输出结果1.239
    }

    /**
     * 测试日期返回的格式  测试格式为  2022-04-13 09:58:41
     */
    @Test
    public void dateFormatTest(){
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String a = sdf.format(date);
        System.out.println(a);
    }
    /**
     * 测试分割字符串  如：a/b/c.jpg  返回c.jpg
     */
    @Test
    public void slipString(){
        String a = "a/b/c.jpg";
        String b = null;
        b = a.substring(a.lastIndexOf("/")+1,a.length());
        System.out.println(b);
    }
}
