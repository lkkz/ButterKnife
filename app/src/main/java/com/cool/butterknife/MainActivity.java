package com.cool.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cool.butterknife.annoation.BindView;
import com.cool.butterknife.annoation.OnClick;
import com.cool.butterknife.core.Butterknife;
import com.cool.butterknife.core.Unbinder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.textView2)
    TextView textView2;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = Butterknife.bind(this);
        textView.setText("ButterKnife Test");
        textView2.setText("测试findViewById");
    }

    @OnClick({R.id.bt_click,R.id.bt_click2})
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.bt_click:
                startActivity(new Intent(this,SecondActivity.class));
            break;
            case R.id.bt_click2:
                startActivity(new Intent(this,FragmentActivity.class));
            break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
