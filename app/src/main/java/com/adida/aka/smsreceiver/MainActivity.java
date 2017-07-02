package com.adida.aka.smsreceiver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTvPhone, mTvContent, mTvTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
//        mTvPhone   = (TextView) findViewById(R.id.tv_phone);
//        mTvContent = (TextView) findViewById(R.id.tv_content);
//        mTvTime    = (TextView) findViewById(R.id.tv_time);
//
//        SmsReceiver smsReceiver = new SmsReceiver();
//        mTvPhone.setText(smsReceiver.mPhone);
//        mTvContent.setText(smsReceiver.mBody);
//        mTvTime.setText(smsReceiver.mSentTime);

    }
}
