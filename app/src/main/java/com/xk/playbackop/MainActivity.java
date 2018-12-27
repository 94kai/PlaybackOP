package com.xk.playbackop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void record(View view) {
        OPStates.isRecord = true;
        Toast.makeText(this, "开始录制", Toast.LENGTH_SHORT).show();
        record();
    }

    public void play(View view) {
        OPStates.play = true;
        Toast.makeText(this, "开始播放", Toast.LENGTH_SHORT).show();
        play();
    }

    public void to2(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
