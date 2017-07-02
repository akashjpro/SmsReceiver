package com.adida.aka.smsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.text.SimpleDateFormat;

/**
 * Created by Aka on 7/2/2017.
 */

public class SmsReceiver extends BroadcastReceiver {
    public String mPhone, mSentTime, mBody;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){
            return;
        }
        Bundle bundle = intent.getExtras();
        Object[] data = (Object[]) bundle.get("pdus");
        for (int i =0; i< data.length; i++){
            SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) data[i]);
            mBody += smsMessage.getMessageBody();
        }

        mPhone = SmsMessage.createFromPdu((byte[]) data[0]).getDisplayOriginatingAddress();
        long sentTime = SmsMessage.createFromPdu((byte[]) data[0]).getTimestampMillis();
        mSentTime = convertTimeToSting(sentTime);

        Toast.makeText(context, mPhone + "\n" + mBody + "\n"+mSentTime, Toast.LENGTH_SHORT).show();
    }

    private String convertTimeToSting(long time){
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        return dateFormat.format(time);
    }
}
