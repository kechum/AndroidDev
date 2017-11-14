package com.tutorials.hackro.androiddev.presentation.Utils;


import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.inject.Inject;

public class AssetsPropertyReader {
    private Context context;
    private Properties properties;

    @Inject
    public AssetsPropertyReader(Application application) {
        this.context = application.getApplicationContext();
        properties = new Properties();
    }

    public Properties getProperties(String FileName) {
        try {
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(FileName);
            properties.load(inputStream);
        } catch (IOException e) {
            Log.e("AssetsPropertyReader", e.toString());
        }
        return properties;

    }

}

