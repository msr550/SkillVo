package com.msr.skillvotask.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.msr.skillvotask.R;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Sandeep Maram on 28-09-2016.
 */
public final class DialogUtils {
    private static DialogUtils dialogUtilsInstance = null;

    private DialogUtils() {

    }

    public static DialogUtils getInstance() {
        if (dialogUtilsInstance == null) {
            dialogUtilsInstance = new DialogUtils();
        }
        return dialogUtilsInstance;
    }

    /**
     * to get toast
     *
     * @param context context of activity or fragment
     * @param message Toast message
     */
    public void displayToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if (v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }

    /**
     * to create and return the dialog
     *
     * @param context context as parameter
     * @return dialog object
     */
    public Dialog progressDialog(Context context) {
        Dialog dialog = null;
        try {
            dialog = new Dialog(context);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.view_progress_dialog);
            dialog.setCancelable(false);
            dialog.show();
        } catch (Exception e) {
            Logger.getLogger(DialogUtils.class.getName()).log(Level.SEVERE, null, e);
        }
        return dialog;
    }
}
