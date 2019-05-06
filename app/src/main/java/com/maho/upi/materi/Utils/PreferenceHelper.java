package com.maho.upi.materi.Utils;

import android.content.Context;
import android.content.SharedPreferences;

@SuppressWarnings("ALL")
public class PreferenceHelper {

	private static PreferenceHelper preferenceHelper;
	private SharedPreferences sp;

	private final String SP_NAME = "loginsession";

	private static final String KEY_NAMA = "nama";
	private static final String KEY_EMAIL = "password";

	private static final String is_login = "sudah login";

	public PreferenceHelper(Context context) {
		sp = context
				.getApplicationContext()
				.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
	}

	public static PreferenceHelper getInstance(Context context){
		if (preferenceHelper == null){
			preferenceHelper = new PreferenceHelper(context);
		}

		return preferenceHelper;
	}

	public SharedPreferences Pref() {
		return sp;
	}

	public Boolean isLogin() {
		return sp.getBoolean(is_login, true);
	}

	public void setLogin(boolean isCall) {
		sp.edit().putBoolean(is_login, isCall).apply();
	}

	public void setName(String isName) {
		sp.edit().putString(KEY_NAMA, isName).apply();
	}

	public String getName() {
		return sp.getString(KEY_NAMA, "");
	}

	public void setPassword(String isPass) {
		sp.edit().putString(KEY_EMAIL, isPass).apply();
	}

	public String getPassword() {
		return sp.getString(KEY_EMAIL, "");
	}

}
