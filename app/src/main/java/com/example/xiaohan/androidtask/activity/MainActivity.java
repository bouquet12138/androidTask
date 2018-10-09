package com.example.xiaohan.androidtask.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xiaohan.androidtask.R;
import com.example.xiaohan.androidtask.base.MVPBaseActivity;

public class MainActivity extends MVPBaseActivity implements View.OnClickListener {

    private TextView mEnvironmentalIndicators;
    private TextView mHistoryRecord;

    private ImageView mListImage;

    private DrawerLayout mDrawLayout;
    private RelativeLayout mMainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        mEnvironmentalIndicators = findViewById(R.id.environmentalIndicators);
        mHistoryRecord = findViewById(R.id.historyRecord);

        mDrawLayout = findViewById(R.id.drawLayout);
        mMainLayout = findViewById(R.id.mainLayout);
        mListImage = findViewById(R.id.listImage);
    }

    /**
     * 初始化监听
     */
    private void initListener() {
        mEnvironmentalIndicators.setOnClickListener(this);
        mHistoryRecord.setOnClickListener(this);
        mListImage.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.environmentalIndicators:
                break;
            case R.id.historyRecord:
                break;
            case R.id.listImage:
                break;
        }
    }
}
