package cl.tradeo.android.dev.androidtab;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class MyTabListener implements ActionBar.TabListener {

	Fragment fragment;

	public MyTabListener(Fragment fragment) {
		this.fragment = fragment;
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.pager, fragment);
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}
}
