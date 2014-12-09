package com.pjgr.directoriomedicotenerife;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap 
{
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("loadUrlTimeoutValue", 70000);
		super.loadUrl("file:///android_asset/www/index.html");
	}
}