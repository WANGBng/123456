package com.bwie.ui;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bwie.adapter.BannerAdapter;
import com.bwie.bean.BannerBean;
import com.bwie.utils.HttpUtils;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * 第四个页面
 * 轮播图加webview展示
 */
public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private String url = "https://api.yunxuekeji.cn/yunxue_app_api/content/getIndexBanner/1";

    private ViewPager viewPager;
    private HttpUtils instance;
    private List <ImageView> imlist = new ArrayList <> ();
    private BannerAdapter bAdapter;

    private Handler handler = new Handler () {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage (msg);
            if (msg.what == 0) {
                int i = viewPager.getCurrentItem ();
                i++;
                viewPager.setCurrentItem (i);
                handler.sendEmptyMessageDelayed (0, 2000);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_web);
        //获取资源ID
        webView = findViewById (R.id.web);
        viewPager = findViewById (R.id.vivwpage);

        setWebView ();//接受webView

        setBann ();//轮播图

    }

    private void setBann() {//轮播图
        instance = HttpUtils.getInstance ();
        instance.getDataFromServer (url);
        instance.setNetCallback (new HttpUtils.NetCallback () {
            @Override
            public void onSuccess(String result) {

                Gson gson = new Gson ();

                BannerBean bannerBean = gson.fromJson (result, BannerBean.class);
                // List<BannerBean.BodyBean.ResultBean> data = bannerBean.getBody ().getResult ();
                // Log.i ("TAG",data.size ()+"");
                for (BannerBean.BodyBean.ResultBean resultBean : bannerBean.getBody ().getResult ()) {

                    ImageView imageView = new ImageView (WebActivity.this);
                    imageView.setScaleType (ImageView.ScaleType.FIT_XY);
                    ImageLoader.getInstance ().displayImage (resultBean.getBarnerPic (), imageView);
                    //    Picasso.with (context).load (data.get (i).getBarnerPic ()).into (imageView);
                    imlist.add (imageView);
                }

                bAdapter = new BannerAdapter (imlist, WebActivity.this);
                viewPager.setAdapter (bAdapter);
                handler.sendEmptyMessageDelayed (0, 2000);

            }
        });
    }//轮播图


    private void setWebView() {//接受webView
        webView.setWebViewClient (new WebViewClient () {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted (view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished (view, url);
            }

            @Override
            public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible (view, url);
            }
        });
        //接受传过来的地址
        webView.loadUrl (getIntent ().getStringExtra ("url"));
    }//接受webView


}
