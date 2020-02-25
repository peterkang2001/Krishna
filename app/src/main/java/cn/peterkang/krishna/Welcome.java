package cn.peterkang.krishna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.Toast;

import cn.peterkang.krishna.cn.peterkang.krishna.utility.DeviceInfo;
import cn.peterkang.krishna.cn.peterkang.krishna.utility.entity.DeviceInfoEntity;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String msg = "";


        DeviceInfo info = new DeviceInfo();
        DeviceInfoEntity deviceInfo = info.getDeviceInfo(this);

        Log.e("peter",deviceInfo.toString());


        Toast.makeText(this,"Hello", Toast.LENGTH_LONG).show();
    }
}
