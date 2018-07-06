package com.cool.butterknife;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.cool.butterknife.annoation.BindView;
import com.cool.butterknife.annoation.OnClick;
import com.cool.butterknife.core.Butterknife;
import com.cool.butterknife.core.Unbinder;

/**
 * Created by cool on 2018/7/6.
 */
public class FragmentTest extends Fragment {

    @BindView(R.id.tv_msg)
    TextView textView;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_test, container, false);
        unbinder = Butterknife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.setText("这是一个Fragment");
    }

    @OnClick(R.id.bt_click)
    public void test(View view){
        Toast.makeText(getActivity(),"点击",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
