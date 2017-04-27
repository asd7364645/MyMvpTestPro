package com.mvptest.mymvptestpro.presenter;

import android.os.Bundle;

import com.example.alex.mvplibrary.model.MvpModelCallBack;
import com.example.alex.mvplibrary.presenter.MvpBaseAct;
import com.mvptest.mymvptestpro.model.MvpLibModel;
import com.mvptest.mymvptestpro.view.ThreadTestView;

public class ThreadTestAct extends MvpBaseAct<ThreadTestView,MvpLibModel> {

    @Override
    public void created(Bundle saveInstance) {
        super.created(saveInstance);
        mvpModel.startThread(new MvpModelCallBack<String>() {
            @Override
            public void result(String data) {
                mvpView.setCount(data);
            }
        });
    }
}
