package ca.qc.lbpsb.fusion.fcmnotification;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by delaroy on 10/8/17.
 */

public class SharedPreference {
    private static final String SHARED_PREF_NAME = "FCMSharedPref";
    private static final String TAG_TOKEN = "tagtoken";

    private static final String SHARED_PREF_ID = "IDSharedPref";
    private static final String TAG_ID = "tagID";

    private static SharedPreference mInstance;
    private static Context mCtx;

    private SharedPreference(Context context) {
        mCtx = context;
    }

    public static synchronized SharedPreference getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPreference(context);
        }
        return mInstance;
    }

    //this method will save the device token to shared preferences
    public boolean saveDeviceToken(String token){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TAG_TOKEN, token);
        editor.apply();


        Log.d(TAG_TOKEN, "Refreshed token: " + token);
        return true;
    }

    //this method will fetch the device token from shared preferences
    public String getDeviceToken(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return  sharedPreferences.getString(TAG_TOKEN, null);
    }

    //----------------------------------------------------------------

    //this method will save the device id to shared preferences
    public boolean saveDeviceId(String id){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_ID, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TAG_TOKEN, id);
        editor.apply();


        Log.d(TAG_ID, "device ID: " + id);
        return true;
    }

    //this method will fetch the device id from shared preferences
    public String getDeviceId(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_ID, Context.MODE_PRIVATE);
        return  sharedPreferences.getString(TAG_ID, null);
    }



}