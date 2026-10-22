package com.example.hns;

public final class GameSettings {
    private final String lobbyCode;
    private final int seekerCount;

    public GameSettings(String lobbyCode, int seekerCount) {
        if (lobbyCode == null ||
                !lobbyCode.matches("[A-Za-z0-9]{6}")) {
            throw new IllegalArgumentException(
                    "Lobby code must contain exactly 6 letters or digits.");
        }

        if (seekerCount < 1 || seekerCount > 3) {
            throw new IllegalArgumentException(
                    "Seeker count must be between 1 and 3.");
        }

        this.lobbyCode = lobbyCode.toUpperCase();
        this.seekerCount = seekerCount;
    }

    public String getLobbyCode() {
        return lobbyCode;
    }

    public int getSeekerCount() {
        return seekerCount;
    }
}
