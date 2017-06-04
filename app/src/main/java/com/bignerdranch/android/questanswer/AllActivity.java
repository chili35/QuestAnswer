package com.bignerdranch.android.questanswer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllActivity extends AppCompatActivity {

    private Button mQuestButton;
    private Button mAnswerButton;
    private Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        mQuestButton = (Button)findViewById(R.id.quest_button);
        mQuestButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Does nothing yet!
                Intent i = new Intent(AllActivity.this,QuestActivity.class);
                startActivity(i);
            }
        });

        mAnswerButton = (Button)findViewById(R.id.answer_button);
        mAnswerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Does nothing yet!
                Intent i = new Intent(AllActivity.this,AnswerActivity.class);
                startActivity(i);
            }
        });

        mSearchButton = (Button)findViewById(R.id.search_button);
        mSearchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Does nothing yet!
            }
        });

    }
}
