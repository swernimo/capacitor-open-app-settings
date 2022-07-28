import { WebPlugin } from '@capacitor/core';
import type { openappsettingsPlugin } from './definitions';
export declare class openappsettingsWeb extends WebPlugin implements openappsettingsPlugin {
    open(): Promise<void>;
    openCallerIdSettings(): Promise<void>;
}
