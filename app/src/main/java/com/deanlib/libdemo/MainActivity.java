package com.deanlib.libdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deanlib.libdemo.bothwaylistview.BothwayListViewActivity;
import com.deanlib.libdemo.reflecttextview.ReflectTextViewActivity;
import com.deanlib.libdemo.waveview.WaveViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBothway).setOnClickListener(this);
        findViewById(R.id.btnWave).setOnClickListener(this);
        findViewById(R.id.btnReflect).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnBothway:

                Intent intent1 = new Intent(this, BothwayListViewActivity.class);

                startActivity(intent1);

                break;
            case R.id.btnWave:

                Intent intent2 = new Intent(this, WaveViewActivity.class);

                startActivity(intent2);

                break;
            case R.id.btnReflect:

                Intent intent3 = new Intent(this, ReflectTextViewActivity.class);

                startActivity(intent3);

                break;
        }


    }
}
