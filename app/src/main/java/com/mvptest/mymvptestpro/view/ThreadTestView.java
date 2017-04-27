package com.mvptest.mymvptestpro.view;

import android.widget.TextView;

import com.example.alex.mvplibrary.view.MvpBaseView;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.presenter.ThreadTestAct;

/**
 * Created by Alex on 2017/4/27.
 * Alex
 */

public class ThreadTestView extends MvpBaseView<ThreadTestAct> {
    private TextView thread_act_count_tv;
    @Override
    public int setLayoutId() {
        return R.layout.activity_thread_test;
    }

    @Override
    public void findMvpViews() {
        thread_act_count_tv = findViewById(R.id.thread_act_count_tv);
    }

    public void setCount(String count){
        thread_act_count_tv.setText(count);
    }

}
