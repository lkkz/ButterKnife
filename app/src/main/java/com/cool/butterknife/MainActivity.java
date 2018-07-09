package com.cool.butterknife;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.cool.butterknife.annoation.BindView;
import com.cool.butterknife.annoation.OnClick;

/**
 * 测试父类继承关系
 */
public class MainActivity extends BaseNormalActivity {

//    @BindView(R.id.textView)
//    TextView textView;

    @BindView(R.id.textView2)
    TextView textView2;

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        textView.setText("ButterKnife Test");
        textView2.setText("测试findViewById");
    }

    @Override
    public CharSequence getToolbarTitle() {
        return "测试";
    }

    @OnClick({R.id.bt_click, R.id.bt_click2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_click:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.bt_click2:
                startActivity(new Intent(this, FragmentActivity.class));
                break;
        }

    }
}
