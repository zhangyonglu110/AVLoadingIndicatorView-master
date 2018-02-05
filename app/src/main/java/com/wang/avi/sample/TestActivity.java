package com.wang.avi.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;

/**
 * Created by zhangyonglu on 2016/2/23 0023.
 */
public class TestActivity extends Activity{
    AVLoadingIndicatorView loadingIndicatorView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_test);
        loadingIndicatorView= (AVLoadingIndicatorView) findViewById(R.id.loading);
        findViewById(R.id.btn_see_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity.this,MainActivity.class));
            }
        });
       // loadingIndicatorView.setVisibility(View.GONE);
        super.onCreate(savedInstanceState);
    }
}
