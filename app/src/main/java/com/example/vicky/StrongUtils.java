package com.example.vicky;

import android.graphics.Color;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;

import org.apache.http.conn.ConnectTimeoutException;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by hongyou on 16/11/8.
 */

public class StrongUtils {
    /**
     * getItemFromList：根据ListId和下标获取一项；
     *
    */
    public static <E> E getItemFromList(List<E> list, int index) {
        if (list == null || index < 0 || index >= list.size()) return null;
        return list.get(index);
    }

    /**
     * 判断是否存在SD卡：只有当SD卡存在且可读写时返回true
     * */
    public static boolean existSDCard() {
        String state = Environment.getExternalStorageState();//判断SD卡的状态
        return state != null && state.equalsIgnoreCase(Environment.MEDIA_MOUNTED);
        //只有在SD卡状态为MEDIA_MOUNTED时，目录才是可读可写，并且可以创建目录及文件。
    }

    /**
     * 返回列表的大小
     * */
    public static int count(List list) {
        return list == null ? 0 : list.size();
    }


    /*把字符串变成long类型*/
    public static long toLong(String s, long def) {
        if (TextUtils.isEmpty(s)) return def;
        //当 s 是空（null）或空串（""）时 TextUtils.isEmpty(str) 返回 true，否则返回 false
        //也就是说，当s是空或空串时，返回def
        try {
            return Long.parseLong(s);
        } catch (Exception e) {
            return def;
        }
    }

    /*把字符串变成int类型*/
    public static int toInt(String str, int def) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable e) {
            return def;
        }
    }

    public static void silentCloseCloseable(Closeable clo) {
        try {
            if (clo != null) {
                clo.close();
            }
        } catch (IOException e) {
            Log.w("Closeable", "Cannot close" + clo.getClass().getSimpleName(), e);
        }
    }

    public static void waitWithoutInterrupt(Object object) {
        try {
            object.wait();
        } catch (InterruptedException e) {
            Log.w("Interrupt", "unexpected interrupt: " + object);
        }
    }

    public static boolean isEmpty(Collection<?> c) {
        return c == null || c.isEmpty();
    }

    // Throws NullPointerException if the input is null.
    public static <T> T checkNotNull(T object) {
        if (object == null) throw new NullPointerException();
        return object;
    }

    public static void asserts(final boolean expression, final String failedMessage) {
        if (!expression) throw new AssertionError(failedMessage);
    }

    public static int parseColor(String color, int def) {
        if (TextUtils.isEmpty(color)) return def;
        try {
            return Color.parseColor(color);
        } catch (Throwable e) {
            return def;
        }
    }

    public static boolean tryJudgeServiceException(Throwable throwable){
        if (throwable == null)return false;
        if (throwable instanceof SocketException ||
                throwable instanceof UnknownHostException ||
                throwable instanceof UnknownServiceException ||
                throwable instanceof TimeoutException ||
                throwable instanceof HttpRetryException ||
                throwable instanceof ConnectTimeoutException ||
                throwable instanceof SocketTimeoutException) {
            return true;
        }else if(!TextUtils.isEmpty(throwable.getMessage())){
            if (throwable.getMessage().contains("UnknownHost"))return true;
            if (throwable.getMessage().contains("UnknownService"))return true;
            if (throwable.getMessage().contains("Timeout"))return true;
            if (throwable.getMessage().contains("SocketTimeout"))return true;
            if (throwable.getMessage().contains("Socket"))return true;
            if (throwable.getMessage().contains("Connect"))return true;
        }
        return false;
    }
}
