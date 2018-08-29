package com.bwie.ui;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * 欢迎界面
 * 用来做倒计时
 */
public class WelcomeActivity extends AppCompatActivity {

    private int time = 3;
    private TextView textView;
    private Handler handler = new Handler (){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0){
                if (time > 0){
                    time --;
                    textView.setText (time + "S");
                    handler.sendEmptyMessageDelayed (0,1000);
                }else {
                    Intent intent = new Intent (WelcomeActivity.this,MainActivity.class);
                    startActivity (intent);
                    finish ();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_welcome);

        textView = findViewById (R.id.time);
        handler.sendEmptyMessageDelayed (0,1000);

        //全屏
        getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
