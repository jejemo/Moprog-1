package com.maho.upi.materi.UI.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.maho.upi.materi.R;
import com.maho.upi.materi.Utils.SharedPrefManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login_activity extends AppCompatActivity {

	//PreferenceHelper preferenceHelper;

	private SharedPrefManager sharedPrefManager;

	@BindView(R.id.edt_nama)
	EditText nama;
	@BindView(R.id.edt_email)
	EditText email;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		ButterKnife.bind(this);
		sharedPrefManager = new SharedPrefManager(this);

		ceklogin();

		login();
	}

	private void ceklogin() {
		if (sharedPrefManager.Login()){
			Intent intent = new Intent(login_activity.this, MainActivity.class);
			startActivity(intent);
			finish();
		}
	}

	@OnClick(R.id.btn_Login)
	private void login() {
		String n = nama.getText().toString();
		String e = email.getText().toString();
		if (n.equals("Admin") && e.equals("Admin")){
			Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();
			sharedPrefManager.saveSPString(SharedPrefManager.SP_NAMA, n);
			sharedPrefManager.saveSPString(SharedPrefManager.SP_PASS, n);

			sharedPrefManager.saveSPBolean(SharedPrefManager.SP_SUDAH_LOGIN, true);


			Intent intent = new Intent(login_activity.this, MainActivity.class);
			startActivity(intent);
		}else {
			Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT).show();
		}
	}
}
