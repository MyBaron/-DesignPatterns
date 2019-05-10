package desion.pattern.openclose;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FashionMan extends Man {

    @Override
    public void eat() {
        String week = getWeek(new Date());
        if ("星期五".equals(week)) {
            System.out.println("今天不吃饭，吃沙拉");
        }else {
            System.out.println("今天吃饭");
        }
    }

    //根据日期取得星期几
    public static String getWeek(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String week = sdf.format(date);
        return week;
    }
}
