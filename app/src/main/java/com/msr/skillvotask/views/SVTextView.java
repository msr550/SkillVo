package com.msr.skillvotask.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.msr.skillvotask.R;


/**
 * Created by Sandeep Maram on 31-08-2016.
 */
public class SVTextView extends TextView {
    /**
     * Parameterised constructor
     *
     * @param context Activity Context
     */
    public SVTextView(Context context) {
        super(context);
    }

    /**
     * Constructor with multiple parameters
     *
     * @param context Activity Context
     * @param attrs   AttributeSet
     */
    public SVTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomFont(context, attrs);
    }

    /**
     * Constructor with multiple parameters
     *
     * @param context      Activity Context
     * @param attrs        AttributeSet
     * @param defStyleAttr Default Style attributes
     */
    public SVTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomFont(context, attrs);
    }

    /**
     * Used to create the Typeface and setting from the stylable
     *
     * @param ctx   Activity Context
     * @param attrs AttributeSet
     */
    private void setCustomFont(Context ctx, AttributeSet attrs) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.SVFont);
        String customFont = a.getString(R.styleable.SVFont_font);
        setCustomFont(ctx, customFont);
        a.recycle();
    }

    /**
     * Used to set the font to textview
     *
     * @param ctx   Activity Context
     * @param asset Name of the font
     * @return returns true if we set font otherwise return false
     */
    public boolean setCustomFont(Context ctx, String asset) {
        Typeface tf;
        try {
            tf = Typeface.createFromAsset(ctx.getAssets(), ctx.getString(R.string.fonts) + asset);
        } catch (Exception e) {
            return false;
        }
        setTypeface(tf);
        return true;
    }
}
