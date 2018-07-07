package com.cool.butterknife;

import android.support.annotation.UiThread;
import android.view.View;

import com.cool.butterknife.core.Unbinder;

/**
 * Created by cool on 2018/7/7.
 * 生成代码参考类
 */
public class BaseActivity$ViewBinding implements Unbinder {
    private BaseActivity target;

    private View view2131165329;

    @UiThread
    public BaseActivity$ViewBinding(final BaseActivity target, View source) {
        this.target = target;
        target.mToolbar = source.findViewById(R.id.toolbar);
        View view2131165329 = source.findViewById(R.id.toolbar);
        this.view2131165329 = view2131165329;
        view2131165329.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                target.click(view);
            }
        });
    }

    @Override
    public void unbind() {
        BaseActivity target = this.target;
        this.target = null;
        target.mToolbar = null;
        view2131165329.setOnClickListener(null);
        view2131165329 = null;
    }
}
