package com.fuav.android.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.fuav.android.R;
import com.fuav.android.fragments.SettingsFragment;

/**
 * This activity holds the SettingsFragment.
 */
public class SettingsActivity extends DrawerNavigationUI {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);// 横屏
		setContentView(R.layout.activity_settings);

		FragmentManager fm = getFragmentManager();
		Fragment settingsFragment = fm.findFragmentById(R.id.fragment_settings_layout);
		if (settingsFragment == null) {
			settingsFragment = new SettingsFragment();
			fm.beginTransaction().add(R.id.fragment_settings_layout, settingsFragment).commit();
		}
	}

    @Override
    protected int getToolbarId() {
        return R.id.actionbar_toolbar;
    }

    @Override
	protected int getNavigationDrawerMenuItemId() {
		return R.id.navigation_settings;
	}

	@Override
	public void onApiConnected() {
        super.onApiConnected();
	}

}
