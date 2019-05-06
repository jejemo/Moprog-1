package com.maho.upi.materi.UI.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.maho.upi.materi.R;
import com.maho.upi.materi.UI.View.MainActivity;
import com.maho.upi.materi.UI.View.login_activity;
import com.maho.upi.materi.Utils.PreferenceHelper;
import com.maho.upi.materi.Utils.SharedPrefManager;

@SuppressWarnings("ALL")
public class menuProfileFragment extends Fragment {
	View v;
	private TextView txtNama;
	private Button btnLogout;
	//private PreferenceHelper preferenceHelper;
	private SharedPrefManager sharedPrefManager;

	public menuProfileFragment() {
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.menu_profile_fragment, container, false);

		sharedPrefManager = new  SharedPrefManager(getContext());
		//preferenceHelper = PreferenceHelper.getInstance(getContext().getApplicationContext());

		txtNama = (TextView) v.findViewById(R.id.txtnama);
		btnLogout = (Button) v.findViewById(R.id.btn_Logout);

		txtNama.setText("" + sharedPrefManager.getKeyNama());

		btnLogout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), login_activity.class);
				startActivity(intent);
				sharedPrefManager.saveSPBolean(SharedPrefManager.SP_SUDAH_LOGIN, false);
		//		preferenceHelper.setLogin(false);
			}
		});
		return v;
	}
}
