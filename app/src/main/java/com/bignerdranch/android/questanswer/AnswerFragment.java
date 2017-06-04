package com.bignerdranch.android.questanswer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Administrator on 2017/6/1.
 */

public class AnswerFragment extends Fragment {
    private Answer mAnswer;
    private EditText mEditText;

    //fragment生命周期
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mAnswer = new Answer();
    }

    //创建和配置fragment视图;视图生成后，引用组件并添加监听器方法
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_answer,container,false);

        //引用组件并添加监听器方法
        mEditText = (EditText)v.findViewById(R.id.answer_content);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    mAnswer.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return v;
    }

}
