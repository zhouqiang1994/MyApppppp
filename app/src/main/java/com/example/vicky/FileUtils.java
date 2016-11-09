package com.example.vicky;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/**
 * Created by hongyou on 16/11/8.
 */

public class FileUtils {
        private FileUtils() {
        }


        private static final String ROOT_DIR = "/gaozejing";
        private static final String APP_DIR = "/hahaha";
        private static final String TONGYAO_CACHE = "/tongyao";
        private static final String GUSHI_CACHE = "/movie";
        private static final String YNGWENGE_CACHE = "/yingwenge";
    /**
     * @return 返回为null 代表目录不可用
     */
    public static File getExtDirCache() {
        if (!StrongUtils.existSDCard()) return null;
        File root = Environment.getExternalStorageDirectory();
        String sb = ROOT_DIR + APP_DIR + "/cache";
        File dir = new File(root, sb);
        if (dir.exists() || dir.mkdirs()) return dir;
        return null;
    }


        /**
         * @return 返回为null 代表目录不可用
         */
        public static File getGushiCache() {
            if (!StrongUtils.existSDCard()) return null;
            File root = Environment.getExternalStorageDirectory();
            String sb = ROOT_DIR + APP_DIR + GUSHI_CACHE;
            File dir = new File(root, sb);
            if (dir.exists() || dir.mkdirs()) return dir;
            return null;
        }

        /**
         * @return 返回为null 代表目录不可用
         */
        public static File getTongyaoCache() {
            if (!StrongUtils.existSDCard()) return null;
            File root = Environment.getExternalStorageDirectory();
            String sb = ROOT_DIR + APP_DIR + TONGYAO_CACHE;
            File dir = new File(root, sb);
            if (dir.exists() || dir.mkdirs()) return dir;
            return null;
        }
        /**
         * @return 返回为null 代表目录不可用
         */
        public static File getYingwengeCache() {
            if (!StrongUtils.existSDCard()) return null;
            File root = Environment.getExternalStorageDirectory();
            String sb = ROOT_DIR + APP_DIR + YNGWENGE_CACHE;
            File dir = new File(root, sb);
            if (dir.exists() || dir.mkdirs()) return dir;
            return null;
        }


}
