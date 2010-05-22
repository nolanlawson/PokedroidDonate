package com.nolanlawson.pokedex.donate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Helper.setROMManagerPremiumIcon(arg0, !Helper.isRomManagerFreeInstalled(arg0));
	}
}
