package com.mvptest.mymvptestpro.view;

import android.widget.Button;
import android.widget.TextView;

import com.example.alex.mvplibrary.helper.EventHelper;
import com.example.alex.mvplibrary.view.MvpBaseView;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.presenter.MvpLibTestAct;

/**
 * Created by Alex on 2016/11/30.
 * Alex
 */

public class MvpLibTestView extends MvpBaseView<MvpLibTestAct> {

    private Button mvpLibFgBtn;
    private Button mvp_lib_thread_btn;
    private Button mvpLibBtn;
    private Button mvp_lib_test_btn;
    private TextView mvpLibTv;


    @Override
    public int setLayoutId() {
        return R.layout.activity_mvp_lib_test;
    }

    @Override
    public void findMvpViews() {
        mvpLibBtn = findViewById(R.id.mvp_lib_btn);
        mvp_lib_thread_btn = findViewById(R.id.mvp_lib_thread_btn);
        mvpLibTv = findViewById(R.id.mvp_lib_tv);
        mvp_lib_test_btn = findViewById(R.id.mvp_lib_test_btn);
        mvpLibFgBtn = findViewById(R.id.mvp_lib_fg_btn);
    }

    @Override
    public void bindEvent() {
        super.bindEvent();
        EventHelper.click(presenter, mvpLibBtn,mvp_lib_thread_btn, mvpLibFgBtn,mvp_lib_test_btn);
    }

    public void setMyTextView(String string) {
        mvpLibTv.setText(string);
    }

}
