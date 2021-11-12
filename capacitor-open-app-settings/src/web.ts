import { WebPlugin } from '@capacitor/core';
import { OpenAppSettingsPlugin } from './definitions';

export class OpenAppSettingsWeb extends WebPlugin implements OpenAppSettingsPlugin {
  constructor() {
    super({
      name: 'OpenAppSettings',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const OpenAppSettings = new OpenAppSettingsWeb();

export { OpenAppSettings };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(OpenAppSettings);
