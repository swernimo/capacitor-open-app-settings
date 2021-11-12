import Foundation
import Capacitor
import UIKit

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(OpenAppSettings)
public class OpenAppSettings: CAPPlugin {

    @objc func open(_ call: CAPPluginCall) {
        let url = URL(string: UIApplication.openSettingsURLString)
        UIApplication.shared.open(url!, options: [:], completionHandler: nil)
        call.success([:])
    }
}
