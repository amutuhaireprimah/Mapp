package com.example.mappl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.view.Gravity;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent){
        Toast toast = Toast.makeText(context,"Your time is over!!!",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        //Vibrate the mobile phone
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(4000);
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
