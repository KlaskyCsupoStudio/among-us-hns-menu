package com.example.hns;

import android.content.Context;
import android.content.SharedPreferences;

public final class SettingsRepository {
    private static final String PREFS = "hns_settings";
    private static final String KEY_CODE = "lobby_code";
    private static final String KEY_SEEKERS = "seeker_count";

    private final SharedPreferences preferences;

    public SettingsRepository(Context context) {
        preferences = context.getSharedPreferences(
                PREFS, Context.MODE_PRIVATE);
    }

    public void save(GameSettings settings) {
        preferences.edit()
                .putString(KEY_CODE, settings.getLobbyCode())
                .putInt(KEY_SEEKERS, settings.getSeekerCount())
                .apply();
    }

    public String getLobbyCode() {
        return preferences.getString(KEY_CODE, "");
    }

    public int getSeekerCount() {
        return preferences.getInt(KEY_SEEKERS, 1);
    }

    public void clear() {
        preferences.edit().clear().apply();
    }
}
