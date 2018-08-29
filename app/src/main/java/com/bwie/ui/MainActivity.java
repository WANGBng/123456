package com.bwie.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bwie.fragment.FragmentOne;
import com.bwie.fragment.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * 展示页面
 */
public class MainActivity extends AppCompatActivity {

    private ViewPager pager ;
    private List<Fragment> fList2;
    private RadioGroup group;
    private RadioButton button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //获取资源id
        pager = findViewById (R.id.VPager);
        group = findViewById (R.id.group);
        button = findViewById (R.id.but1);
        button2 = findViewById (R.id.but2);

        fList2 = new ArrayList <> ();//添加fragment
        fList2.add (new FragmentOne ());
        fList2.add (new FragmentTwo ());


        setWindow ();//设置全屏的

        fragmen ();//viewpager
    }

    private void fragmen() {//viewpager
        pager.setAdapter (new FragmentPagerAdapter (getSupportFragmentManager ()) {
            @Override
            public Fragment getItem(int position) {
                return fList2.get (position);
            }

            @Override
            public int getCount() {
                return fList2.size ();
            }
        });

        //切换
        group.setOnCheckedChangeListener (new RadioGroup.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.but1:
                        pager.setCurrentItem (0);
                        break;
                    case R.id.but2:
                        pager.setCurrentItem (1);
                        break;
                }
            }
        });

    }//viewpager

    private void setWindow() {
        getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
