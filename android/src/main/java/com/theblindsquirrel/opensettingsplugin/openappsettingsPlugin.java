package com.theblindsquirrel.opensettingsplugin;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "openappsettings")
public class openappsettingsPlugin extends Plugin {

    @PluginMethod
    public void open(PluginCall call) {
        Activity act = getActivity();
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        act.startActivityForResult(intent, 3);
    }

    @PluginMethod
    public void openCallerIdSettings(PluginCall call) {
        Activity act = getActivity();
        Intent intent = new Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        act.startActivityForResult(intent, 3);
    }
}
