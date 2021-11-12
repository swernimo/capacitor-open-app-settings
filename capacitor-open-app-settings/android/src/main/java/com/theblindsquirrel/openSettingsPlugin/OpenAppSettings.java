package com.theblindsquirrel.openSettingsPlugin;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
public class OpenAppSettings extends Plugin {

    @PluginMethod
    public void open(PluginCall call) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getContext().getPackageName(), null);
        intent.setData(uri);
//        startActivity(intent);

        JSObject ret = new JSObject();
        call.success(ret);
    }
}
