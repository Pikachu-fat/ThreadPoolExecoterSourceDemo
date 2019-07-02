package com.example.weijianqiang.taskexecuter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_aa";
    int value = 0;
    int click = 0;
    boolean inter = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_exe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0;i<10;i++){
                    Log.d(TAG, "onClick: click:"+click);
                    Log.d("MainActivity_aa", "down: 1"+"      equeu.remainingCapacity="+TaskExecuter.limitedQueue.remainingCapacity()+",     equeu.size"+TaskExecuter.limitedQueue.size());
                    click++;
                    TaskExecuter.executeTask(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                Thread.sleep(6000);
                                Log.d(TAG, "run: value:"+value);
                                value++;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
    }
}
