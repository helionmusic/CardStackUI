package com.helionmusic.cardstack.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

public class Units {
    public static int dpToPx(Context context, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    public static int dpToPx(int dp){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,Resources.getSystem().getDisplayMetrics());
    }

    public static int getAbsoluteTop(View view) {
        int[] rect = new int[2];
        view.getLocationInWindow(rect);
        return rect[1];
    }
}