package com.msr.skillvotask.utils;

import android.util.Log;

/**
 * Created by Sandeep Maram on 28-09-2016.
 */
public class Logger {
    private static final String TAG = "===Job Portal===";

    /**
     * to display log info in console
     *
     * @param string message to display
     */
    public static void showInfo(String string) {
        Log.i(TAG, "===" + string);
    }

    /**
     * to display log debug in console
     *
     * @param string message to display
     */
    public static void showDebug(String string) {
        Log.d(TAG, "===" + string + "===");
    }

    /**
     * to display log errors in console
     *
     * @param string error text to display
     */
    public static void showError(String string) {
        Log.e(TAG, "===" + string + "===");
    }
}
