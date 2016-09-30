package qianfeng.broadcastreceiver_application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) { // 接到对应的频道的消息(例如打电话操作)，就马上调用这个方法
       // 获取用户拨打的电话号码
        String resultData = getResultData();
        resultData = "8744" + resultData;
        // 设置修改后的数据(设置数据)
        setResultData(resultData);
    }
}
