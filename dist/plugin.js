var capacitoropenappsettings = (function (exports, core) {
    'use strict';

    const openappsettings = core.registerPlugin('openappsettings', {
        web: () => Promise.resolve().then(function () { return web; }).then(m => new m.openappsettingsWeb()),
    });

    class openappsettingsWeb extends core.WebPlugin {
        async open() {
            return;
        }
        async openCallerIdSettings() {
            return;
        }
    }

    var web = /*#__PURE__*/Object.freeze({
        __proto__: null,
        openappsettingsWeb: openappsettingsWeb
    });

    exports.openappsettings = openappsettings;

    Object.defineProperty(exports, '__esModule', { value: true });

    return exports;

})({}, capacitorExports);
//# sourceMappingURL=plugin.js.map
