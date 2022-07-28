import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(openappsettingsPlugin)
public class openappsettingsPlugin: CAPPlugin {
    private let implementation = openappsettings()

    @objc func open(_ call: CAPPluginCall) {
        call.resolve(implementation.open())
    }

    @objc func openCallerIdSettings_ call: CAPPluginCall) {
        call.resolve(implementation.openCallerIdSettings())
    }
}
