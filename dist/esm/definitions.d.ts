export interface openappsettingsPlugin {
    echo(options: {
        value: string;
    }): Promise<{
        value: string;
    }>;
}
