package com.android.googleplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AutostartReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Intent intent1 = new Intent(context,MySerive.class);
		context.startService(intent1);
		Toast.makeText(context, "AutoStarted", Toast.LENGTH_LONG).show();
	}
}
