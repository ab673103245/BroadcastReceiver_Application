package qianfeng.broadcastreceiver_application;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
    按注册方式分：
    1. 静态注册的广播（清单文件注册），在应用安装后，并且第一次启动之后，会一直有效的接收广播，即使是在应用关闭退出后，该广播接收者一直有效
    2. 动态注册的广播（Java代码注册），在Acitvity停止后，也将被解除注册，解除注册之后，该广播就无效了。这时，该广播就不能继续收到外部发来的广播。
            !! 就算你不自己解除注册，安卓也会帮你解除注册。应用一退出，动态注册的广播肯定就无效了！！！
 */
public class MainActivity extends AppCompatActivity {

    private ScreenOffandOn receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        filter.addAction(Intent.ACTION_SCREEN_ON);
        receiver = new ScreenOffandOn();
        registerReceiver(receiver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
