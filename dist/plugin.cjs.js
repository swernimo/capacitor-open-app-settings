'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var core = require('@capacitor/core');

const openappsettings = core.registerPlugin('openappsettings', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.openappsettingsWeb()),
});

class openappsettingsWeb extends core.WebPlugin {
    async echo(options) {
        console.log('ECHO', options);
        return options;
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    openappsettingsWeb: openappsettingsWeb
});

exports.openappsettings = openappsettings;
//# sourceMappingURL=plugin.cjs.js.map
