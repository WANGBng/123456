package com.bwie.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wang on 2018/8/25.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        init();
    }

    private void init() {

        findView();

        setListener();
    }

    protected abstract void setListener();

    protected abstract void findView();
}
