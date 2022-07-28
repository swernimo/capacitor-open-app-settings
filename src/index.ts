import { registerPlugin } from '@capacitor/core';

import type { openappsettingsPlugin } from './definitions';

const openappsettings = registerPlugin<openappsettingsPlugin>(
  'openappsettings',
  {
    web: () => import('./web').then(m => new m.openappsettingsWeb()),
  },
);

export * from './definitions';
export { openappsettings };
