package com.zx.jdkill.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CreatedTime: 2021/1/18 上午10:14
 * Description:
 * @author zengrong
 */
public class ContactUtil {

    public final static String MAC_SYSTEM_NAME = "Mac OS";
    public final static String WINDOWS_SYSTEM_NAME = "Windows";

    public static String getNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
