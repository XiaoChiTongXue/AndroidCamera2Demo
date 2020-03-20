package com.venus.camera2demo.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SpUtil {
    public static String SP_FILE_NAME = "camera2.demo.sp";
    /**
     * @param context 上下文
     * @param key     关键字
     * @param value   值
     */
    public static void putString(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        //存放key value键值对
        sp.edit().putString(key, value).commit();
    }

    /**
     * @param context 上下文
     * @param key     关键字
     * @param value   值
     */
    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        //存放key value键值对
        sp.edit().putBoolean(key, value).commit();
    }

    /**
     * @param context  上下文
     * @param key      关键字
     * @param defValue 指定的默认值
     */
    public static boolean getBoolean(Context context, String key, boolean defValue) {
        Boolean value = false;

        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        value = sp.getBoolean(key, defValue);
        return value;
    }


    /**
     * @param context  上下文
     * @param key      关键字
     * @param defValue 指定的默认值
     */
    public static String getString(Context context, String key, String defValue) {
        String value = "";

        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        value = sp.getString(key, defValue);
        return value;
    }

    /**
     * @param context  上下文
     * @param key      关键字
     * @param defValue 指定的默认值
     */
    public static float getFloat(Context context, String key, float defValue) {
        float value = 0;

        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        value = sp.getFloat(key, defValue);
        return value;
    }

    /**
     * @param context  上下文
     * @param key      关键字
     * @param defValue 指定的默认值
     */
    public static int getInt(Context context, String key, int defValue) {
        int value = 0;

        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        value = sp.getInt(key, defValue);
        return value;
    }

    /**
     * @param context  上下文
     * @param key      关键字
     * @param defValue 指定的默认值
     */
    public static long getLong(Context context, String key, long defValue) {
        long value = 0;

        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        value = sp.getLong(key, defValue);
        return value;
    }

    /**
     * @param context 上下文
     * @param key     关键字
     * @param value   值
     */
    public static void putFloat(Context context, String key, float value) {
        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        //存放key value键值对
        sp.edit().putFloat(key, value).commit();
    }

    /**
     * @param context 上下文
     * @param key     关键字
     * @param value   值
     */
    public static void putInt(Context context, String key, int value) {
        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        //存放key value键值对
        sp.edit().putInt(key, value).commit();
    }

    /**
     * @param context 上下文
     * @param key     关键字
     * @param value   值
     */
    public static void putLong(Context context, String key, long value) {
        SharedPreferences sp = context.getSharedPreferences(SP_FILE_NAME, Context.MODE_PRIVATE);
        //存放key value键值对
        sp.edit().putLong(key, value).commit();
    }
}
