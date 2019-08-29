package com.zf.world.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String currentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        return date;
    }
}
