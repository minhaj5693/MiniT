package com.app.mtoast;

import android.content.Context;
import android.widget.Toast;

public class MiniToasting {

    private Context context;

    public MiniToasting(Context context) {
        this.context = context;
    }

    public void showToastMessage(String message) {
        Toast.makeText(context, "" + message, Toast.LENGTH_LONG).show();
    }
}
