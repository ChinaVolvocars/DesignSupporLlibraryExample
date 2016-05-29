package com.example.administrator.designsupportlibraryexample.wangyi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.designsupportlibraryexample.R;
import com.example.administrator.designsupportlibraryexample.wangyi.MainFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @USER Wu Hao You
 * @DATE 16/5/26 10:56
 */
public class OneFragment extends Fragment {

    private List<Fragment> fragments = new ArrayList<>(4);
    private List<String> stringList = new ArrayList<>(4);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        stringList.add("个性推荐");
        stringList.add("歌单");
        stringList.add("主播电台");
        stringList.add("排行榜");


        fragments.add(new MainFragment("个性推荐的Fragment界面"));
        fragments.add(new MainFragment("歌单的Fragment界面"));
        fragments.add(new MainFragment("主播电台的Fragment界面"));
        fragments.add(new MainFragment("排行榜的Fragment界面"));
        Log.e("Edwin", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_one, container, false);

        Log.e("Edwin", "onCreateView");


        TabLayout mTabLayout = (TabLayout) inflate.findViewById(R.id.mTabLayout);
        ViewPager mViewPager = (ViewPager) inflate.findViewById(R.id.mViewPager);


        MyAdapter myAdapter = new MyAdapter(getActivity().getSupportFragmentManager());
        mViewPager.setAdapter(myAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(myAdapter);


        return inflate;
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e("Edwin", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        Log.e("Edwin", "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("Edwin", "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("Edwin", "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("Edwin", "onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e("Edwin", "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.e("Edwin", "onViewStateRestored");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onLowMemory() {
        Log.e("Edwin", "onLowMemory");
        super.onLowMemory();
    }

    @Override
    public void onDestroyView() {
        Log.e("Edwin", "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.e("Edwin", "onDetach");
        super.onDetach();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.e("Edwin", "onHiddenChanged = " + hidden);
        super.onHiddenChanged(hidden);
    }
}
