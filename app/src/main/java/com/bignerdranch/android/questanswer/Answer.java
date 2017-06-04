package com.bignerdranch.android.questanswer;

import java.util.UUID;

/**
 * Created by Ye Liuqing on 2017/5/25.
 */

public class Answer {
    private UUID mId;
    private String mTitle;

    public void Question(){
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

}
