declare module '@capacitor/core' {
  interface PluginRegistry {
    OpenAppSettings: OpenAppSettingsPlugin;
  }
}

export interface OpenAppSettingsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
