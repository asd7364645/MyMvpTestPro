package com.mvptest.mymvptestpro.model;

import com.example.alex.mvplibrary.model.MvpModel;
import com.example.alex.mvplibrary.model.MvpModelCallBack;

/**
 * Created by Alex on 2016/11/30.
 * Alex
 */

public class MvpLibModel extends MvpModel {
    private int count = 0;
    private boolean countCancel;

    public String setText() {
        return "Alex";
    }

    public void startThread(final MvpModelCallBack<String> countStr) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                countCancel = false;
                while (!countCancel) {
                    count++;
                    sendCallback(countStr, count + "");
                    System.out.println("countStr = " + count);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        countCancel = true;
    }
}
