package com.cool.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cool.butterknife.annoation.BindView;
import com.cool.butterknife.annoation.OnClick;
import com.cool.butterknife.core.ButterKnife;
import com.cool.butterknife.core.Unbinder;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.tv_msg)
    TextView mTextView;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        unbinder = ButterKnife.bind(this);
        mTextView.setText("我是第二个页面");
    }

    @OnClick(R.id.button)
    public void onClick1(View view){
        Toast.makeText(this,"点击第一个按钮",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button2)
    public void onClick2(View view){
        Toast.makeText(this,"点击第二个按钮",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
