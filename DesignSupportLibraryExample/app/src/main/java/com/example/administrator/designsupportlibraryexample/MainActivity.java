package com.example.administrator.designsupportlibraryexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * @USER Edwin
 * @DATE 2016/5/23 22:03
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("主界面");
        toolbar.setLogo(R.mipmap.ic_launcher);


    }

    /**
     * Toolbar AIP讲解
     *
     * @param view
     */
    public void button1(View view) {
        startActivity(new Intent(this, ToolbarActivity.class));

    }

    public void button2(View view){
        startActivity(new Intent(this, AnimationActivity.class));
    }

}
