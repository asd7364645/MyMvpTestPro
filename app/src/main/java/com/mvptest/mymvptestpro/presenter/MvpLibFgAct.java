package com.mvptest.mymvptestpro.presenter;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.alex.mvplibrary.presenter.MvpBaseAct;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.model.MvpLibModel;
import com.mvptest.mymvptestpro.view.MvpLibFgView;

public class MvpLibFgAct extends MvpBaseAct<MvpLibFgView,MvpLibModel> implements RadioGroup.OnCheckedChangeListener {

    @Override
    public void created(Bundle saveInstance) {
        super.created(saveInstance);
        mvpView.setFragmentManager(getSupportFragmentManager());
        mvpView.setTabSelection(0);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (group.getId()) {
            case R.id.fg_act_rg:
                fgActRgCheckedChanged(checkedId);
                break;
        }
    }

    private void fgActRgCheckedChanged(int checkedId) {
        switch (checkedId) {
            case R.id.fg_act_one_rb:
                mvpView.setTabSelection(0);
                break;
            case R.id.fg_act_two_rb:
                mvpView.setTabSelection(1);
                break;
            default:
                mvpView.setTabSelection(0);
                break;
        }
    }
}
