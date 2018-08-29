package com.bwie.utils;

import android.os.AsyncTask;

import com.google.common.io.CharStreams;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 接口回调
 * Created by wang on 2018/8/25.
 */

public class HttpUtils {

    private static final HttpUtils ourInstance = new HttpUtils ();

    public static HttpUtils getInstance() {
        return ourInstance;
    }

    private HttpUtils() {
    }

    /**
     * 从网络获取数据
     * 有二中方案
     * 1. Thread+HttpUrlConnection/HttpClient+Handler
     * 2. AsyncTask+HttpUrlConnection/HttpClient
     */
    public void getDataFromServer(String url) {
        new LoadData ().execute (url);
    }

    /**
     * 接口回调实现过程
     * 1. 定义一个接口
     * 2. 声明一个引用
     * 3. 给引用设值
     */
    public interface NetCallback {
        void onSuccess(String result);
    }

    private NetCallback netCallback;

    public void setNetCallback(NetCallback netCallback) {
        this.netCallback = netCallback;
    }

    /**
     * 请求网络数据的类
     */
    class LoadData extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... strings) {
            // 网络请求
            try {
                URL url = new URL (strings[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection ();
                connection.setConnectTimeout (3000);
                connection.setReadTimeout (3000);
                if (connection.getResponseCode () == HttpURLConnection.HTTP_OK) {
                    return CharStreams.toString (new InputStreamReader (connection.getInputStream (), "UTF-8"));
                }
            } catch (Exception e) {
                e.printStackTrace ();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            if (netCallback != null) {
                netCallback.onSuccess (s);
            }
        }
    }
}
