package com.maho.upi.materi.UI.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maho.upi.materi.Adapter.ViewPagerMatchesAdapter;
import com.maho.upi.materi.R;

@SuppressWarnings("ALL")
public class menuMatchesFragment extends Fragment {

	private View v;
	private TabLayout tabLayout;
	private ViewPager viewPager;
	private ViewPagerMatchesAdapter adapter;

	public menuMatchesFragment() {
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.menu_matches_fragment, container, false);


		tabLayout = v.findViewById(R.id.tabMatches);
		viewPager = v.findViewById(R.id.viewPager);

		adapter = new ViewPagerMatchesAdapter(getChildFragmentManager());
		adapter.AddFragment(new tabTeamFragment(),"Team");
		adapter.AddFragment(new tabMatchesFragment(),"Match");
		viewPager.setAdapter(adapter);
		tabLayout.setupWithViewPager(viewPager);

		return v;
	}

}
