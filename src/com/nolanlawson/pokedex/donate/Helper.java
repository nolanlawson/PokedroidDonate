package com.nolanlawson.pokedex.donate;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public class Helper {
	public static boolean isPokedroidFreeInstalled(Context context) {
		return context.getPackageManager().checkSignatures(context.getPackageName(), "com.nolanlawson.pokedex") >= 0;
	}
	
	public static void setPokedroidDonateIcon(Context context, boolean state) {
		PackageManager pm = context.getPackageManager();
		pm.setComponentEnabledSetting(new ComponentName(context, InstallFree.class), state ? 
				PackageManager.COMPONENT_ENABLED_STATE_ENABLED : 
					PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
	}
}
