package qianfeng.broadcastreceiver_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ScreenOffandOn extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_SCREEN_OFF.equals(intent.getAction()))
        {
            Log.d("google-my:", "onReceive: 锁屏");
        }else if(Intent.ACTION_SCREEN_ON.equals(intent.getAction()))
        {
            Log.d("google-my:", "onReceive: 亮屏");
        }

    }
}
