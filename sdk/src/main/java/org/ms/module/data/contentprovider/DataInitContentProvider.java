package org.ms.module.data.contentprovider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import org.ms.module.data.impl.AppDataImpl;
import org.ms.module.supper.client.Modules;
import org.ms.module.supper.inter.module.Module;

public class DataInitContentProvider extends ContentProvider {

    private static final String TAG = "DataInitContentProvider";

    @Override
    public boolean onCreate() {
        AppDataImpl.application = (Application) this.getContext().getApplicationContext();
        Modules.getDataModule().getAppData().setApplication((Application) this.getContext().getApplicationContext());
        Log.d(TAG, " __APP_DATA__ init success");
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
