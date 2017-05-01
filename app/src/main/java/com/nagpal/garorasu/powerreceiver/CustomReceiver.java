package com.nagpal.garorasu.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {


    public CustomReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String	intentAction	=	intent.getAction();
        switch	(intentAction){
            case	Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context,	"Power Connected!",	Toast.LENGTH_SHORT).show();
                break;
            case	Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context,	"Power Disconnected!",	Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
