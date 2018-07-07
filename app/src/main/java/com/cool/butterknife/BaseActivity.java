package com.cool.butterknife;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cool.butterknife.annoation.BindView;
import com.cool.butterknife.annoation.OnClick;
import com.cool.butterknife.core.Butterknife;
import com.cool.butterknife.core.Unbinder;

/**
 * Created by cool on 2018/7/7.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @NonNull
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        unbinder = Butterknife.bind(this);
        if(mToolbar != null){
           setSupportActionBar(mToolbar);
           getSupportActionBar().setTitle(getToolbarTitle());
        }
        initView();
    }

    public CharSequence getToolbarTitle() {
        return "";
    }

    @OnClick(R.id.toolbar)
    public void click(View view){

    }

    public abstract int getContentView();

    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
