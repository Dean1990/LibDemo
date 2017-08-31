package com.deanlib.libdemo.bothwaylistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.deanlib.bothwaylistview.BothwayListView;
import com.deanlib.bothwaylistview.BothwayListViewAdapter;
import com.deanlib.bothwaylistview.HeaderHorizontalScrollView;
import com.deanlib.libdemo.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * 双向滚动的ListView
 *
 * Created by dean on 2017/8/31.
 */

public class BothwayListViewActivity extends AppCompatActivity {

    private View mTopParentLinearLayout;
    private HeaderHorizontalScrollView mTopScrollView;
    private BothwayListView mBothwayListView;
    private BothwayListViewAdapter mBothwayListViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bothway_listview);

        mTopParentLinearLayout = findViewById(R.id.top_header);
        mTopScrollView = (HeaderHorizontalScrollView) findViewById(R.id.my_scrollview);
        mBothwayListView = (BothwayListView) findViewById(R.id.listView);

        ArrayList<ScoreEntity> scores = new ArrayList<>();

        Random random = new Random();

        for (int i = 0;i<50;i++){

            scores.add(new ScoreEntity("小明"+i,"1023"+i,
                    random.nextInt(100),random.nextInt(100),random.nextInt(100),
                    random.nextInt(100),random.nextInt(100),random.nextInt(100)));
        }

        mBothwayListView.initListView(mTopParentLinearLayout, mTopScrollView);
        mBothwayListViewAdapter = new TableListAdapter(scores,
                mTopScrollView);
        mBothwayListView.setAdapter(mBothwayListViewAdapter);

    }

    @Override
    public void onDestroy() {
        if (null != mBothwayListView) {
            mBothwayListView.unRegistererReceiver();
        }
        super.onDestroy();
    }
}
