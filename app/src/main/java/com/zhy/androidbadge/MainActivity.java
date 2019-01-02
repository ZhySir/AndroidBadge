package com.zhy.androidbadge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhy.libbadges.Utils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        tvHelloWorld = (TextView) findViewById(R.id.tv_HelloWorld);

        tvHelloWorld.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_HelloWorld:
                Toast.makeText(this, "编程第一行代码：" + Utils.getCode(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
