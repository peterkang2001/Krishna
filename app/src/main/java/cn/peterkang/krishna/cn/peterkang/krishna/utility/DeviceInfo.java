package cn.peterkang.krishna.cn.peterkang.krishna.utility;


import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

import cn.peterkang.krishna.cn.peterkang.krishna.utility.entity.DeviceInfoEntity;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

public class DeviceInfo {

    public DeviceInfoEntity getDeviceInfo(Context context) {

        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        float density = dm.density;
        int densityDpi = dm.densityDpi;

        int screenWidth = (int) (width / density);
        int screenHeight = (int) (height / density);


        DeviceInfoEntity deviceInfoEntity = new DeviceInfoEntity();
        deviceInfoEntity.setWidth(width);
        deviceInfoEntity.setHeight(height);
        deviceInfoEntity.setDensity(density);
        deviceInfoEntity.setDesnsityDpi(densityDpi);
        deviceInfoEntity.setScreenWidth(screenWidth);
        deviceInfoEntity.setScreenHeight(screenHeight);

        return deviceInfoEntity;
    }

    public void getUniqueIdentification(Context context) {

    }
}
