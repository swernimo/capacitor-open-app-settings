declare module '@capacitor/core' {
  interface PluginRegistry {
    OpenAppSettings: OpenAppSettingsPlugin;
  }
}

export interface OpenAppSettingsPlugin {
  open(): Promise<void>;
  openCallerIdSettings(): Promise<void>;
}
