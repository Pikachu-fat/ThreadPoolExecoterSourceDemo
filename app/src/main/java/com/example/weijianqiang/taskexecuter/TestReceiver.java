package com.example.weijianqiang.taskexecuter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by weijianqiang
 * On 2019/7/2
 * Description:
 */
public class TestReceiver extends BroadcastReceiver {
    private static final String TAG = "TAGG";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: ");
        TaskExecuter.executeTask(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "run: receiver");
            }
        });
    }
}
