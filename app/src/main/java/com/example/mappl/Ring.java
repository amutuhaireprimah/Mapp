package com.example.mappl;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import static android.app.Service.START_STICKY;

public class Ring extends services{
    private MediaPlayer mime;
    @Nullable
    //@Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand( Intent t, int mute, int sid) {
        mime=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mime.setLooping(true);
        mime.start();
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        mime.stop();
    }
}
