package com.maho.upi.materi.UI.View;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.maho.upi.materi.Model.TeamModel;
import com.maho.upi.materi.R;
import com.maho.upi.materi.UI.Fragment.menuMatchesFragment;
import com.maho.upi.materi.UI.Fragment.menuProfileFragment;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

	private BottomNavigationView navigationView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loadFragment(new menuMatchesFragment());

		navigationView = findViewById(R.id.menu_Nav);
		navigationView.setOnNavigationItemSelectedListener(this);
	}

	private boolean loadFragment(Fragment fragment) {
		if (fragment != null){
			getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.frag_layout, fragment)
					.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean onNavigationItemSelected(@NonNull MenuItem item) {
		Fragment fragment = null;
		switch (item.getItemId()){
			case R.id.macth_menu:
				fragment = new menuMatchesFragment();
				break;
			case R.id.profile_menu:
				fragment = new menuProfileFragment();
				break;
		}
		return loadFragment(fragment);
	}

}


