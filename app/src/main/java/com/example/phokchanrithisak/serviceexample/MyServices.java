package com.example.phokchanrithisak.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by phokchanrithisak on 9/27/17.
 */

public class MyServices extends Service{
    static MediaPlayer mp;
//onCreate & onDestroy are life cycle of services but onPause is different
    @Override
    public void onCreate() {
        mp = MediaPlayer.create(MyServices.this, R.raw.likeiloveyou);
        Toast.makeText(this, "Service Created Succesfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();
        Toast.makeText(this, "You are now playing music", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
    public void pauseSong()
    {
        mp.pause();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Music stopped", Toast.LENGTH_SHORT).show();
        mp.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "Services Bound", Toast.LENGTH_LONG).show();
        return null;
    }
}
