package com.example.administrator.designsupportlibraryexample.wangyi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.designsupportlibraryexample.R;

/**
 * @USER Wu Hao You
 * @DATE 16/5/26 10:45
 */
public class MainFragment extends Fragment {
    private String title = "无数据填充";

    public MainFragment() {
    }

    public MainFragment(String title) {
        this.title = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_main, container, false);

        TextView viewById = (TextView) inflate.findViewById(R.id.mTextView);
        viewById.setText(title);


        return inflate;
    }
}
