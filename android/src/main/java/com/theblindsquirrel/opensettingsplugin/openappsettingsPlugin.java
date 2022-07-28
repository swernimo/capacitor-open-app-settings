package com.theblindsquirrel.opensettingsplugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "openappsettings")
public class openappsettingsPlugin extends Plugin {

    private openappsettings implementation = new openappsettings();

    @PluginMethod
    public void open(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", implementation.open());
        call.resolve(ret);
    }

    @PluginMethod
    public void openCallerIdSettings(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", implementation.openCallerIdSettings());
        call.resolve(ret);
    }
}
