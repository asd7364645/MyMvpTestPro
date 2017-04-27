package com.mvptest.mymvptestpro.view;

import com.example.alex.mvplibrary.view.MvpBaseFragView;
import com.mvptest.mymvptestpro.R;
import com.mvptest.mymvptestpro.fgpresenter.FgTwo;

/**
 * Created by Alex on 2016/12/2.
 * Alex
 */

public class TwoView extends MvpBaseFragView<FgTwo> {
    @Override
    public int setLayoutId() {
        return R.layout.two_fg_layout;
    }

    @Override
    public void findMvpViews() {

    }
}
