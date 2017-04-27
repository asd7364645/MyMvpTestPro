package com.mvptest.mymvptestpro.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.example.alex.mvplibrary.view.MvpBaseView;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.fgpresenter.FgOne;
import com.mvptest.mymvptestpro.fgpresenter.FgTwo;
import com.mvptest.mymvptestpro.presenter.MvpLibFgAct;

/**
 * Created by Alex on 2016/12/2.
 * Alex
 */

public class MvpLibFgView extends MvpBaseView<MvpLibFgAct> {

    private FgOne fgOne;
    private FgTwo fgTwo;
    private FragmentManager fragmentManager;
    private RadioGroup fg_act_rg;

    public void setFragmentManager(FragmentManager manager) {
        this.fragmentManager = manager;
    }

    public void setTabSelection(int i) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //先隐藏所有
        hideAllFrag(transaction);
        switch (i) {
            case 0:
                if (fgOne == null) {
                    fgOne = new FgOne();
                    transaction.add(R.id.mvp_lib_fg_fg, fgOne);
                } else {
                    transaction.show(fgOne);
                }
                fg_act_rg.check(R.id.fg_act_one_rb);
                break;
            case 1:
                if (fgTwo == null) {
                    fgTwo = new FgTwo();
                    transaction.add(R.id.mvp_lib_fg_fg, fgTwo);
                } else {
                    transaction.show(fgTwo);
                }
                fg_act_rg.check(R.id.fg_act_two_rb);
                break;
        }
        transaction.commitAllowingStateLoss();
    }

    private void hideAllFrag(FragmentTransaction transaction) {
        if (fgOne != null) {
            transaction.hide(fgOne);
        }
        if (fgTwo != null) {
            transaction.hide(fgTwo);
        }
    }

    @Override
    public int setLayoutId() {
        return R.layout.activity_mvp_lib_fg;
    }

    @Override
    public void bindEvent() {
        super.bindEvent();
        fg_act_rg.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) presenter);
    }

    @Override
    public void findMvpViews() {
        fg_act_rg = findViewById(R.id.fg_act_rg);
    }
}
