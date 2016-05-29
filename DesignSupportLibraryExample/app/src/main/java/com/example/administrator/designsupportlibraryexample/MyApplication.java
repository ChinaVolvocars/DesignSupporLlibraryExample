package com.example.administrator.designsupportlibraryexample;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @USER Wu Hao You
 * @DATE 16/5/27 11:40
 */
public class MyApplication extends Application {
    private static int count = 0;

    @Override
    public void onCreate() {
        super.onCreate();

        this.unregisterActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {
                count++;

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {
                count--;
                if (count ==0){
                    Toast.makeText(MyApplication.this,"已经到后台来",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });

    }
}
