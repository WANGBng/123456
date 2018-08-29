package com.bwie.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bwie.adapter.TwoAdapter;
import com.bwie.bean.NewsBean;
import com.bwie.ui.R;
import com.bwie.ui.WebActivity;
import com.bwie.utils.HttpUtils;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshExpandableListView;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/8/25.
 */

public class FragmentTwo extends Fragment {
    private View view;
    private String path = "http://172.17.8.100/mobile/exam/findNewList";//地址
    private List<NewsBean.ResultBean.DataBean> nList = new ArrayList<> ();

    private PullToRefreshListView pullList2;
    private TwoAdapter pulladapter;
    private boolean isNull = false;
    private HttpUtils httpUtils;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //防止与系统的view起冲突
        if (view == null){
            view = inflater.inflate (R.layout.fragment_two,container,false);
        }
        ViewGroup parent = (ViewGroup) view.getParent ();

        if (parent != null){
            parent.removeView (view);
        } //防止与系统的view起冲突
        //获取资源ID
        pullList2 = view.findViewById (R.id.pull2);


        setItemIntent ();//点击子条目进行跳转的方法

        setJsonData();//数据的解析


        return view;
    }

    private void setItemIntent() {//点击子条目进行跳转的方法
        //点击子条目进行跳转
        pullList2.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                NewsBean.ResultBean.DataBean ne = (NewsBean.ResultBean.DataBean) parent.getAdapter ().getItem (position);

                Intent intent = new Intent (getActivity (), WebActivity.class);

                intent.putExtra ("url",ne.getUrl ());//传当前子条目的一个连接

                startActivity (intent);

            }
        });
    }//点击子条目进行跳转的方法
    //数据的解析
    private void setJsonData() {

        pulladapter = new TwoAdapter (nList,getActivity ());
        pullList2.setAdapter (pulladapter);
        pullList2.setMode (PullToRefreshExpandableListView.Mode.BOTH);
        pullList2.setOnRefreshListener (new PullToRefreshBase.OnRefreshListener2 <ListView> () {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase <ListView> refreshView) {

//                刷新
                isNull =true;
                httpUtils.getDataFromServer (path);
                pullList2.postDelayed (new Runnable () {
                    @Override
                    public void run() {
                        pullList2.onRefreshComplete ();
                    }
                },1000);

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase <ListView> refreshView) {
                //加载
                httpUtils.getDataFromServer (path);
                pullList2.postDelayed (new Runnable () {
                    @Override
                    public void run() {
                        pullList2.onRefreshComplete ();
                    }
                },1000);
            }
        });

//              进行接口的回调
        httpUtils = HttpUtils.getInstance();
        httpUtils.getDataFromServer (path);
        httpUtils.setNetCallback (new HttpUtils.NetCallback () {
            @Override//成功后的解析
            public void onSuccess(String result) {
                Gson gson = new Gson ();

                NewsBean newsBean = gson.fromJson (result, NewsBean.class);
                List<NewsBean.ResultBean.DataBean> data = newsBean.getResult ().getData ();

                if (isNull){
                    isNull = !isNull;
                    nList.clear ();
                }
                nList.addAll (data);

                pulladapter.notifyDataSetChanged ();//适配器的刷新
            }
        });
    }//数据的解析
}
