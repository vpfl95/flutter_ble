package com.example.flutter_ble;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"messages")
                    .setContentText("This is running in Background")
                    .setContentTitle("Flutter Background")
                    .setSmallIcon(R.mipmap.ic_launcher);
            startForeground(101, builder.build());
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
