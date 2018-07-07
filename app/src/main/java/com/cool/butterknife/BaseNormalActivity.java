package com.cool.butterknife;

import android.support.annotation.NonNull;
import android.widget.TextView;

import com.cool.butterknife.annoation.BindView;

/**
 * Created by cool on 2018/7/7.
 * 测试父类继承关系
 */
public abstract class BaseNormalActivity extends BaseActivity {

    @NonNull
    @BindView(R.id.textView)
    TextView textView;

}
