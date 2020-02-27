package cn.peterkang.krishna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import cn.peterkang.krishna.cn.peterkang.krishna.utility.DeviceInfo;
import cn.peterkang.krishna.cn.peterkang.krishna.utility.entity.DeviceInfoEntity;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

public class Welcome extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
    public final static int REQUEST_READ_PHONE_STATE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getDevideId(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case REQUEST_READ_PHONE_STATE:
                if ((grantResults.length >0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)){
                    getDevideId(this);
                } else {
                    Toast.makeText(this, "权限已被用户拒绝", Toast.LENGTH_LONG).show();
                }
                break;

            default:
                break;
        }
    }

    // 358240051111110

    @SuppressLint("HardwareIds")
    private static String getDevideId(Context context) {
        String deviceId = "";

        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (null != tm) {
            if(ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions((Activity) context, new String[]{ Manifest.permission.READ_PHONE_STATE}, REQUEST_READ_PHONE_STATE);
            }else {
                if(tm.getDeviceId() != null){
                    deviceId = tm.getSubscriberId();
                }else {
                    deviceId = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
                }
            }
            Log.e("peter", "DevicedId1:: "+ deviceId);

        }
        return "";

    }
}
