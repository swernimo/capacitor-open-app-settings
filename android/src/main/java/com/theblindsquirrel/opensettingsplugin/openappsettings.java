package com.theblindsquirrel.opensettingsplugin;

import android.util.Log;

public class openappsettings {

    public void open(PluginCall call) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", BuildConfig.LIBRARY_PACKAGE_NAME, null);
        intent.setData(uri);
        startActivityForResult(call, intent, 1);
        call.resolve();
    }

    public void openCallerIdSettings(PluginCall call) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", BuildConfig.LIBRARY_PACKAGE_NAME, null);
        intent.setData(uri);
        startActivityForResult(call, intent, 1);
        call.resolve();
    }
}
