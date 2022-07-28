import { WebPlugin } from '@capacitor/core';

import type { openappsettingsPlugin } from './definitions';

export class openappsettingsWeb
  extends WebPlugin
  implements openappsettingsPlugin {
  async open(): Promise<void> {
    return;
  }
  async openCallerIdSettings(): Promise<void> {
    return;
  }
}
