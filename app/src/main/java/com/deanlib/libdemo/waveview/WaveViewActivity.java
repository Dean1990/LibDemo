package com.deanlib.libdemo.waveview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.deanlib.libdemo.R;
import com.deanlib.waveview.WaveView;

/**
 * 多波纹视图
 *
 * Created by dean on 2018/1/10.
 */

public class WaveViewActivity extends AppCompatActivity {

    WaveView mWaveView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waveview);
        mWaveView = (WaveView) findViewById(R.id.waveView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mWaveView.setAnim(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mWaveView.setAnim(false);
    }
}
