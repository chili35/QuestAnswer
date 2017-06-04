package com.bignerdranch.android.questanswer;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Ye Liuqing on 2017/6/1.
 */
//AnswerLab中有一个answer数组，数组里存放着多个数组
public class AnswerLab {
    private static AnswerLab sAnswerLab;

    private List<Answer>mAnswers;

    public static AnswerLab get(Context context){
        if(sAnswerLab == null){
            sAnswerLab = new AnswerLab(context);
        }
        return  sAnswerLab;
    }
    //若单例不存在，就调用构造方法创造它
    private AnswerLab(Context context){
        mAnswers = new ArrayList<>();
        for(int i = 0; i<100; i++){
            Answer answer = new Answer();
            answer.setTitle("Answer #"+i);
            mAnswers.add(answer);
        }
    }

    //在AnswerLab构造方法中，有两个方法：getAnswer（）用来返回数组列表；getAnswer(UUID)返回带有指定ID的Answer对象
    public List<Answer> getAnswers(){
        return mAnswers;
    }

    public Answer getAnswer(UUID id){
        for(Answer answer : mAnswers){
            if(answer.getId().equals(id)){
                return  answer;
            }
        }
        return null;
    }

}
