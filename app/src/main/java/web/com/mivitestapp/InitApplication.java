package web.com.mivitestapp;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import web.com.mivitestapp.di.components.AppComponent;
import web.com.mivitestapp.di.components.DaggerAppComponent;
import web.com.mivitestapp.server.pojo.Response;

public class InitApplication extends DaggerApplication {

    private static final String TAG = "InitApplication_mivi789";
    Response response;

    public static InitApplication getApplication(Context context){
        return (InitApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                loadJson();
            }
        }).start();

    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent
                .builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }


    private void loadJson() {
        String st = loadJSONFromAsset();
        Log.d(TAG, "json string->" + st);
        Gson gson = new Gson();
        response = gson.fromJson(st, Response.class);
        Log.d(TAG, "data loaded->" + response);
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("collections.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public boolean authenticateUser(String email, String contactNumber) {
        String actualContact = response.getData().getAttributes().getContactNumber();
        String actualEmail = response.getData().getAttributes().getEmailAddress();

        if (email.equalsIgnoreCase(actualEmail) &&
                contactNumber.equalsIgnoreCase(actualContact)) {
            return true;
        } else {
            return false;
        }
    }

    public Response getUserData(String accId) {
        return response;
    }
}
