import { registerPlugin } from '@capacitor/core';
const openappsettings = registerPlugin('openappsettings', {
    web: () => import('./web').then(m => new m.openappsettingsWeb()),
});
export * from './definitions';
export { openappsettings };
//# sourceMappingURL=index.js.map