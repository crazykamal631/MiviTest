package web.com.mivitestapp.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import web.com.mivitestapp.R;
import web.com.mivitestapp.ui.detail.DetailActivity;

public class SplashActivity extends DaggerAppCompatActivity {

    private static final String TAG = "SplashActivity_mivi789";

    @Inject
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(mContext, DetailActivity.class);
                startActivity(intent);
            }
        }, 1000);
    }
}
