package com.example.administrator.designsupportlibraryexample.wangyi;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.designsupportlibraryexample.R;
import com.example.administrator.designsupportlibraryexample.wangyi.fragment.OneFragment;
import com.example.administrator.designsupportlibraryexample.wangyi.fragment.ThreeFragment;
import com.example.administrator.designsupportlibraryexample.wangyi.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * 网易云 首页
 */
public class WMainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private Toolbar mtoolbar;
    private NavigationView navigation_view;
    private DrawerLayout mDrawerLayout;
    private ViewPager main_viewpager;
    private List<Fragment> fragmentList = new ArrayList<>(3);
    private MainAdapter mainAdapter;
    private ImageView ImageView1;
    private ImageView ImageView2;
    private ImageView ImageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wmain);
        main_viewpager = (ViewPager) findViewById(R.id.main_viewpager);
        navigation_view = (NavigationView) findViewById(R.id.navigation_view);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.mDrawerLayout);

        ImageView1 = (ImageView) findViewById(R.id.ImageView1);
        ImageView2 = (ImageView) findViewById(R.id.ImageView2);
        ImageView3 = (ImageView) findViewById(R.id.ImageView3);

        ImageView1.setSelected(true);


//        mtoolbar = (Toolbar) findViewById(R.id.mtoolbar);
//        mtoolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
//        mtoolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
//        mtoolbar.inflateMenu(R.menu.menu_toolbar2);
//        mtoolbar.setNavigationOnClickListener(this);

        findViewById(R.id.NavigationImageView).setOnClickListener(this);

        //设置数据
        fragmentList.add(new OneFragment());
        fragmentList.add(new TwoFragment());
        fragmentList.add(new ThreeFragment());

        mainAdapter = new MainAdapter(getSupportFragmentManager());
        main_viewpager.setAdapter(mainAdapter);

        main_viewpager.addOnPageChangeListener(this);

//        int[][] states = new int[2][];
//        int[] colors = new int[2];
//        ColorStateList colorStateList = new ColorStateList(states,colors);
//
//
//        navigation_view.setItemIconTintList(colorStateList);


        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                int itemId = item.getItemId();
                switch (itemId) {
                    case R.id.item_green:
                        Toast.makeText(WMainActivity.this, "我的信息", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_blue:
                        Toast.makeText(WMainActivity.this, "积分商城", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_pink:
                        Toast.makeText(WMainActivity.this, "付费音乐包", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.subitem_01:
                        Toast.makeText(WMainActivity.this, "听歌识曲", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.subitem_02:
                        Toast.makeText(WMainActivity.this, "主题换肤", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(WMainActivity.this, "。。。其他。。。。", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

    }

    @Override
    public void onClick(View v) {
        mDrawerLayout.openDrawer(navigation_view);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                ImageView1.setSelected(true);
                ImageView2.setSelected(false);
                ImageView3.setSelected(false);
                break;
            case 1:
                ImageView1.setSelected(false);
                ImageView2.setSelected(true);
                ImageView3.setSelected(false);
                break;
            case 2:
                ImageView1.setSelected(false);
                ImageView2.setSelected(false);
                ImageView3.setSelected(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    class MainAdapter extends FragmentPagerAdapter {
        public MainAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }

    public void one_iv(View view) {

        main_viewpager.setCurrentItem(0);


        ImageView1.setSelected(true);
        ImageView2.setSelected(false);
        ImageView3.setSelected(false);
    }

    public void two_iv(View view) {
        main_viewpager.setCurrentItem(1);


        ImageView1.setSelected(false);
        ImageView2.setSelected(true);
        ImageView3.setSelected(false);
    }

    public void three_iv(View view) {
        main_viewpager.setCurrentItem(2);


        ImageView1.setSelected(false);
        ImageView2.setSelected(false);
        ImageView3.setSelected(true);
    }
}
