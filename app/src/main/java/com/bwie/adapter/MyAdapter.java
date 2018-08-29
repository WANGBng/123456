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
 *
 * 这是数据的适配器
 */

public class MyAdapter extends BaseAdapter {

    private List<NewsBean.ResultBean.DataBean> nlist;
    private Context context;

    public MyAdapter(List <NewsBean.ResultBean.DataBean> nlist, Context context) {
        this.nlist = nlist;
        this.context = context;
    }

    private final int ONE_ITEM =0;
    private final int TWO_ITEM =1;
    private final int THREE_ITEM =2;

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
        }else  if (thumbnail_pic_s != null && thumbnail_pic_s02 != null && thumbnail_pic_s03 == null){
            return TWO_ITEM;
        } if (thumbnail_pic_s != null && thumbnail_pic_s02 != null && thumbnail_pic_s03 != null){
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

            ViewHolderOne holderOne;
            if (convertView == null){
                holderOne = new ViewHolderOne ();
                convertView = View.inflate (context,R.layout.item_one,null);
                holderOne.text_titleone = convertView.findViewById (R.id.text_titleone);
                holderOne.image_one = convertView.findViewById (R.id.image_one);

                convertView.setTag (holderOne);

            }else {
                holderOne = (ViewHolderOne) convertView.getTag ();
            }
            holderOne.text_titleone.setText (nlist.get (position).getTitle ());
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s ()).into (holderOne.image_one);
            return convertView;
        }else if (i == TWO_ITEM){

            ViewHolderTwo holderTwo;
            if (convertView == null){
                holderTwo = new ViewHolderTwo ();
                convertView = View.inflate (context,R.layout.item_two,null);
                holderTwo.text_titletwo = convertView.findViewById (R.id.text_titletwo);
                holderTwo.image_two1 = convertView.findViewById (R.id.image_two1);
                holderTwo.image_two2 = convertView.findViewById (R.id.image_two2);

                convertView.setTag (holderTwo);

            }else {
                holderTwo = (ViewHolderTwo) convertView.getTag ();
            }
            holderTwo.text_titletwo.setText (nlist.get (position).getTitle ());
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s ()).into (holderTwo.image_two1);
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s02 ()).into (holderTwo.image_two2);


            return convertView;
        }else if(i == THREE_ITEM){
            ViewHolderThree holderThree;
            if (convertView == null){
                holderThree = new ViewHolderThree ();
                convertView = View.inflate (context,R.layout.item_three,null);
                holderThree.text_titlethree = convertView.findViewById (R.id.text_titlethree);
                holderThree.image_three1 = convertView.findViewById (R.id.image_three1);
                holderThree.image_three2 = convertView.findViewById (R.id.image_three2);
                holderThree.image_three3 = convertView.findViewById (R.id.image_three3);

                convertView.setTag (holderThree);

            }else {
                holderThree = (ViewHolderThree) convertView.getTag ();
            }
            holderThree.text_titlethree.setText (nlist.get (position).getTitle ());
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s ()).into (holderThree.image_three1);
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s02 ()).into (holderThree.image_three2);
            Picasso.with (context).load (nlist.get (position).getThumbnail_pic_s03 ()).into (holderThree.image_three3);


            return convertView;
        }

        return null;
    }

    class ViewHolderOne{
        TextView text_titleone;
        ImageView image_one;
    }
    class ViewHolderTwo{
        TextView text_titletwo;
        ImageView image_two1,image_two2;
    }
    class ViewHolderThree{
        TextView text_titlethree;
        ImageView image_three1,image_three2,image_three3;
    }

}
