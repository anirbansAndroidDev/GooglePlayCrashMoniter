package com.android.googleplay;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyMainReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Toast.makeText(context, "You will never find me where I am!!", Toast.LENGTH_LONG).show();
		Log.d("broadcast", "Inside broadcast");
	}
}