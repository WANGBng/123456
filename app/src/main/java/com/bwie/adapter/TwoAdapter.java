package com.bwie.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.bean.NewsBean;
import com.bwie.ui.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by wang on 2018/8/25.
 */

public class TwoAdapter extends BaseAdapter {
    private List<NewsBean.ResultBean.DataBean> nlist;
    private Context context;

    public TwoAdapter(List <NewsBean.ResultBean.DataBean> nlist, Context context) {
        this.nlist = nlist;
        this.context = context;
    }

    private final int ONE_ITEM =0;
    private final int THREE_ITEM =1;

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        String thumbnail_pic_s = nlist.get (position).getThumbnail_pic_s ();
        String thumbnail_pic_s02 = nlist.get (position).getThumbnail_pic_s02 ();
        String thumbnail_pic_s03 = nlist.get (position).getThumbnail_pic_s03 ();

        if (thumbnail_pic_s != null && thumbnail_pic_s02 == null && thumbnail_pic_s03 == null){
            return ONE_ITEM;
        }else if (thumbnail_pic_s != null && thumbnail_pic_s02 != null && thumbnail_pic_s03 != null){
            return THREE_ITEM;
        }else {
            return ONE_ITEM;
        }
    }

    @Override
    public int getCount() {
        return nlist.size ();
    }

    @Override
    public Object getItem(int position) {
        return nlist.get (position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int i = getItemViewType (position);
        if (i == ONE_ITEM){

            ViewHolderOne1 holderOne1;
            if (convertView == null){
                holderOne1 = new ViewHolderOne1 ();
                convertView = View.inflate (context,R.layout.layout_two_one,null);
                holderOne1.text_titleone = convertView.findViewById (R.id.two_title);
                holderOne1.image_one = convertView.findViewById (R.id.two_imag);

                convertView.setTag (holderOne1);

            }else {
                holderOne1 = (ViewHolderOne1) convertView.getTag ();
            }
            holderOne1.text_titleone.setText (nlist.get (position).getTitle ());
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s ()).into (holderOne1.image_one);
            return convertView;
        }else if(i == THREE_ITEM){
            ViewHolderThree1 holderThree1;
            if (convertView == null){
                holderThree1 = new ViewHolderThree1 ();
                convertView = View.inflate (context,R.layout.layout_two_three,null);
                holderThree1.text_titlethree = convertView.findViewById (R.id.text3);
                holderThree1.image_three1 = convertView.findViewById (R.id.three1);
                holderThree1.image_three2 = convertView.findViewById (R.id.three2);
                holderThree1.image_three3 = convertView.findViewById (R.id.three3);

                convertView.setTag (holderThree1);

            }else {
                holderThree1 = (ViewHolderThree1) convertView.getTag ();
            }
            holderThree1.text_titlethree.setText (nlist.get (position).getTitle ());
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s ()).into (holderThree1.image_three1);
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s02 ()).into (holderThree1.image_three2);
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s03 ()).into (holderThree1.image_three3);


            return convertView;
        }

        return null;
    }

    class ViewHolderOne1{
        TextView text_titleone;
        ImageView image_one;
    }

    class ViewHolderThree1{
        TextView text_titlethree;
        ImageView image_three1,image_three2,image_three3;
    }
}
