import Foundation
import Capacitor
import UIKit
import CallKit

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(OpenAppSettings)
public class OpenAppSettings: CAPPlugin {

    @objc func open(_ call: CAPPluginCall) {
        let url = URL(string: UIApplication.openSettingsURLString)
        DispatchQueue.main.async {
            UIApplication.shared.open(url!, options: [:], completionHandler: nil)
        }
        call.success([:])
    }
    
    @objc func openCallerIdSettings(_ call: CAPPluginCall) {
        if #available(iOS 13.4, *) {
            let instance = CXCallDirectoryManager.sharedInstance
            DispatchQueue.main.async {
                instance.openSettings()
            }
            call.success([:])
        } else {
            let url = URL(string: UIApplication.openSettingsURLString)
            DispatchQueue.main.async {
                UIApplication.shared.open(url!, options: [:], completionHandler: nil)
            }
            call.success([:])            
        }
        
    }
}
