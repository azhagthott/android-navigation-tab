package cl.tradeo.android.dev.androidtab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	ViewPager mViewPager;

	ActionBar.Tab tab1, tab2, tab3;

	Fragment fragmentTab1 = new FragmentTab1();
	Fragment fragmentTab2 = new FragmentTab2();
	Fragment fragmentTab3 = new FragmentTab3();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		tab1 = actionBar.newTab().setText("Fragment 1");
		tab2 = actionBar.newTab().setText("Fragment 2");
		tab3 = actionBar.newTab().setText("Fragment 3");

		tab1.setTabListener(new MyTabListener(fragmentTab1));
		tab2.setTabListener(new MyTabListener(fragmentTab2));
		tab3.setTabListener(new MyTabListener(fragmentTab3));

		actionBar.addTab(tab1);
		actionBar.addTab(tab2);
		actionBar.addTab(tab3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
