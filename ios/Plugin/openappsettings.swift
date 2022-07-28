import Foundation
import UIKit
import CallKit

@objc public class openappsettings: NSObject {

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
                instance.openSettings(completionHandler: { (error) in
                    call.success([:])
                })
            }
        } else {
            let url = URL(string: UIApplication.openSettingsURLString)
            DispatchQueue.main.async {
                UIApplication.shared.open(url!, options: [:], completionHandler: nil)
            }
            call.success([:])            
        }
    }
}
