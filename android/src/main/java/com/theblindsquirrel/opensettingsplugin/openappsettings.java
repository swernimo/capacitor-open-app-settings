package com.theblindsquirrel.opensettingsplugin;

import android.util.Log;

public class openappsettings {

    public void open(PluginCall call) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getContext().getPackageName(), null);
        intent.setData(uri);
        startActivityForResult(call, intent, 1);

        JSObject ret = new JSObject();
        call.success(ret);
    }

    public void openCallerIdSettings(PluginCall call) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getContext().getPackageName(), null);
        intent.setData(uri);
        startActivityForResult(call, intent, 1);

        JSObject ret = new JSObject();
        call.success(ret);
    }
}
