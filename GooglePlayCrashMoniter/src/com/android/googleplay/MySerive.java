package com.android.googleplay;

import java.util.Calendar;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MySerive extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Deprecated
	public void onStart(Intent intent, int startId) 
	{
		//========================================================================================
		// ++++++++++++++++++++++++++++++ Start Tracker service ++++++++++++++++++++++++++++++++++
		//========================================================================================

		Intent myIntent1 = new Intent(MySerive.this, MyMainReceiver.class);
		PendingIntent pendingIntent = PendingIntent.getBroadcast(MySerive.this, 0, myIntent1,0);

		AlarmManager alarmManager1 = (AlarmManager)getSystemService(ALARM_SERVICE);
		long recurring = (10 * 1000);  // in milliseconds
		alarmManager1.setRepeating(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis(), recurring, pendingIntent);
	
		//========================================================================================
		// ++++++++++++++++++++++++++++++ Start Tracker service ++++++++++++++++++++++++++++++++++
		//========================================================================================
		super.onStart(intent, startId);
	}
}
