package com.msr.skillvotask.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Sandeep Maram on 28-09-2016.
 */
public class BaseActivity extends AppCompatActivity {
    protected Dialog progressDialog = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void dismissDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
