package com.bwie.app;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.display.SimpleBitmapDisplayer;

/**
 * Created by wang on 2018/8/25.
 */

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate ();

        initImageLoader();

    }

    private void initImageLoader() {

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration
                .Builder (getApplicationContext ())
                .defaultDisplayImageOptions (options())
                .build ();

        ImageLoader.getInstance ().init (configuration);
    }

    private DisplayImageOptions options() {

        DisplayImageOptions options = new DisplayImageOptions
                .Builder ()
                .cacheOnDisk (true)
                .cacheInMemory (true)
                .displayer (new SimpleBitmapDisplayer ())
                .build ();
        return options;
    }


}
