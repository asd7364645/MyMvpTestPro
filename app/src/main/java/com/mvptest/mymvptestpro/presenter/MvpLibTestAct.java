package com.mvptest.mymvptestpro.presenter;

import android.content.Intent;
import android.view.View;

import com.example.alex.mvplibrary.presenter.MvpBaseAct;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.model.MvpLibModel;
import com.mvptest.mymvptestpro.view.MvpLibTestView;

public class MvpLibTestAct extends MvpBaseAct<MvpLibTestView,MvpLibModel> implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mvp_lib_btn:
                modelSetString();
                break;
            case R.id.mvp_lib_fg_btn:
                Intent intent = new Intent(this,MvpLibFgAct.class);
                startActivity(intent);
                break;
            case R.id.mvp_lib_thread_btn:
                startActivity(new Intent(this,ThreadTestAct.class));
                break;
        }
    }




    private void modelSetString() {
        mvpView.setMyTextView(mvpModel.setText());
    }

}
