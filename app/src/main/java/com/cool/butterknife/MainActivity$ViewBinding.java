package com.cool.butterknife;

import android.support.annotation.UiThread;
import android.view.View;

import com.cool.butterknife.core.Unbinder;

/**
 * Created by cool on 2018/7/3.
 */
public class MainActivity$ViewBinding implements Unbinder{

    private MainActivity target;

    @UiThread
    public MainActivity$ViewBinding(final MainActivity target, View source) {
        this.target = target;
        target.textView = source.findViewById(R.id.textView);
        target.textView2 = source.findViewById(R.id.textView2);
        View viewById = source.findViewById(R.id.bt_click);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                target.onClick(view);
            }
        });
    }

    @Override
    public void unbind() {
        MainActivity target = this.target;
        this.target = null;
        target.textView = null;

    }
}
