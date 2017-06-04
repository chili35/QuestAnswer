package com.bignerdranch.android.questanswer;


import android.support.v4.app.Fragment;

/**
 * Created by Ye Liuqing on 2017/6/1.
 */

public class AnswerListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new AnswerListFragment();
    }
}
