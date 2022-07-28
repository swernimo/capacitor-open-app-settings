import Foundation

@objc public class openappsettings: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
