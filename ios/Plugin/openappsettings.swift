import Foundation
import UIKit
import CallKit

@objc public class openappsettings: NSObject {

    @objc func open() -> Dictionary<String, Any> {
        let url = URL(string: UIApplication.openSettingsURLString)
        DispatchQueue.main.async {
            UIApplication.shared.open(url!, options: [:], completionHandler: nil)
        }
        return [:]
    }
    
    @objc func openCallerIdSettings() -> Dictionary<String, Any> {
        if #available(iOS 13.4, *) {
            let instance = CXCallDirectoryManager.sharedInstance
            DispatchQueue.main.async {
                instance.openSettings(completionHandler: { (error) in
                    return
                })
            }
        } else {
            let url = URL(string: UIApplication.openSettingsURLString)
            DispatchQueue.main.async {
                UIApplication.shared.open(url!, options: [:], completionHandler: nil)
            }
            return [:]
        }
        return [:]
    }
}
