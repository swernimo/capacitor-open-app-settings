import { WebPlugin } from '@capacitor/core';

import type { openappsettingsPlugin } from './definitions';

export class openappsettingsWeb
  extends WebPlugin
  implements openappsettingsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
