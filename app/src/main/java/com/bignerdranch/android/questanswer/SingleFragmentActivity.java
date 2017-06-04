package com.bignerdranch.android.questanswer;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;


/**
 * Created by Ye Liuqing on 2017/6/1.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //fragmenr不能独立显示在屏幕上，必须由它的activity管理，所以现在以代码的形式将fragment添加到activity中
        //先获取FragmentManager，它是用于管理fragment队列的
        FragmentManager fm = getSupportFragmentManager();

        //获取fragment并交由FragmentManager管理
        //这是要获取的fragment已经在队列中，FragmentManager直接返回他
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            fragment = createFragment();
            //创建一个新的fragment事务，加入一个添加操作，然后提交事务
            fm.beginTransaction()
                    //容器视图资源ID的作用是：告诉FragmentManager，fragment应该出现在activity视图的什么位置，以及作为fragment的唯一标识
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }
    }
}
