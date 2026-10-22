package com.example.hns;

import android.webkit.JavascriptInterface;

import org.json.JSONObject;

public final class SettingsBridge {
    private final SettingsRepository repository;

    public SettingsBridge(SettingsRepository repository) {
        this.repository = repository;
    }

    @JavascriptInterface
    public String loadSettings() {
        try {
            JSONObject result = new JSONObject();
            result.put("lobbyCode", repository.getLobbyCode());
            result.put("seekerCount", repository.getSeekerCount());
            result.put("gameConnected", false);
            return result.toString();
        } catch (Exception e) {
            return "{\"lobbyCode\":\"\",\"seekerCount\":1,\"gameConnected\":false}";
        }
    }

    @JavascriptInterface
    public String saveSettings(String lobbyCode, int seekerCount) {
        try {
            GameSettings settings = new GameSettings(lobbyCode, seekerCount);
            repository.save(settings);

            JSONObject result = new JSONObject();
            result.put("ok", true);
            result.put("lobbyCode", settings.getLobbyCode());
            result.put("seekerCount", settings.getSeekerCount());
            result.put("message", "Settings saved on this device. Game not connected.");
            return result.toString();
        } catch (Exception e) {
            JSONObject result = new JSONObject();
            try {
                result.put("ok", false);
                result.put("message", e.getMessage() == null
                        ? "Invalid settings." : e.getMessage());
            } catch (Exception ignored) {
                return "{\"ok\":false,\"message\":\"Invalid settings.\"}";
            }
            return result.toString();
        }
    }
}
