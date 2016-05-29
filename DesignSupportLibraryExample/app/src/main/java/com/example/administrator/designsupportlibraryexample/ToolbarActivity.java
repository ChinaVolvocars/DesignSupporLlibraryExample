package com.example.administrator.designsupportlibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Toolbar AIP讲解
 */
public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        toolbar.setTitle("标题");

        toolbar.setLogo(R.mipmap.ic_launcher);

        toolbar.setSubtitle("子标题");

        toolbar.inflateMenu(R.menu.menu_toolbar);

        /**
         * setNavigationIcon需要放在 setSupportActionBar之后才会生效。
         */
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);

        toolbar.setNavigationContentDescription("设置导航内容描述");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToolbarActivity.this, R.string.navigation_click, Toast.LENGTH_SHORT).show();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(ToolbarActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(ToolbarActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(ToolbarActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(ToolbarActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });


    }
}
