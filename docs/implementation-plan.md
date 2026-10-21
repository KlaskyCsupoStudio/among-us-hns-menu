Hide n Seek Mod — Implementation Plan

Goal

Create a configurable seeker-count setting for Among Us Hide n Seek on Android.

Current status

- [x] HTML menu prototype
- [x] Local seeker-count configuration prototype
- [x] Source files uploaded to GitHub
- [ ] Identify a compatible modding framework
- [ ] Implement game integration
- [ ] Test seeker assignment in private lobbies

Framework evaluation

Status: Research in progress.

Requirements:

- Android ARM64 compatibility
- Compatibility with the installed Among Us version
- Support for Hide n Seek role assignment
- Private-lobby testing
- Documented build and installation steps

No framework has been verified against the target game build yet.

Planned menu

- Seeker Count: 1, 2, or 3
- Default value: 1
- Apply the selected setting before a round starts

Game integration requirements

- Compatible game version and Android architecture
- Access to Hide n Seek role-assignment logic
- Validation against the number of players
- Consistent host and client state
- Private-lobby testing

Important limitation

The current prototype does not modify the game or change multiplayer role assignment. Compatibility with Among Us Android v19 has not been verified.

Development rule

Use documented, compatible modding tools. Do not assume a generic Android floating menu can change the game's internal logic.
