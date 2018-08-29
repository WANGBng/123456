package com.bwie.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * 这是图片的适配器
 * Created by wang on 2018/8/25.
 */

public class BannerAdapter extends PagerAdapter {

    private List<ImageView> imlist;
    private Context context;

    public BannerAdapter(List <ImageView> imlist, Context context) {
        this.imlist = imlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView imageView = imlist.get (position % imlist.size ());

         ViewGroup parent = (ViewGroup) imageView.getParent ();

         if (parent != null){
             parent.removeView (imageView);
         }
         container.addView(imageView);

        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView ((View) object);
    }
}
