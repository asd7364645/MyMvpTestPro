package com.mvptest.mymvptestpro.view;

import com.example.alex.mvplibrary.view.MvpBaseFragView;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.fgpresenter.FgOne;

/**
 * Created by Alex on 2016/12/2.
 * Alex
 */

public class OneView extends MvpBaseFragView<FgOne> {
    @Override
    public int setLayoutId() {
        return R.layout.one_fg_layout;
    }

    @Override
    public void findMvpViews() {

    }
}
