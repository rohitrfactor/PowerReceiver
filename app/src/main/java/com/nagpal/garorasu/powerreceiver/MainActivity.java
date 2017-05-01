package com.nagpal.garorasu.powerreceiver;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ComponentName mReceiverComponentName;
    private PackageManager mPackageManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mReceiverComponentName	=	new ComponentName(this,	CustomReceiver.class);
        mPackageManager	=	getPackageManager();
    }
    @Override
    protected void onStart(){
        super.onStart();
        mPackageManager.setComponentEnabledSetting
                (mReceiverComponentName,	PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                        PackageManager.DONT_KILL_APP);
    }
    @Override
    protected void onStop(){
        super.onStop();
        mPackageManager.setComponentEnabledSetting
                (mReceiverComponentName,	PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        PackageManager.DONT_KILL_APP);
    }
}
