Hide n Seek Mod — Implementation Plan

Goal

Create a configurable seeker-count setting for Among Us Hide n Seek on Android.

Target game: Among Us Android 19.0.0 (Influencer Update)

Current Status

- [x] HTML menu prototype
- [x] Local seeker-count configuration prototype
- [x] Source files uploaded to GitHub
- [x] Implementation plan documented
- [ ] Identify a compatible modding framework
- [ ] Verify Android ARM64 and game-version compatibility
- [ ] Implement game integration
- [ ] Test seeker assignment in compatible private lobbies

Framework Evaluation

Status: Research in progress.

Requirements:

- Android ARM64 support
- Compatibility with Among Us Android 19.0.0
- Access to Hide n Seek role-assignment logic
- Multiplayer synchronization support
- Private-lobby testing
- Documented source code, build, and installation instructions

No framework has yet been verified to support the complete target feature.

Planned Menu

- Setting: Seeker Count
- Options: 1, 2, or 3
- Default: 1
- Apply the selected setting before the round starts
- Validate the selection against the number of eligible players

Game Integration Requirements

1. Identify a compatible, documented modding framework.
2. Determine how the framework exposes Hide n Seek role assignment.
3. Apply the selected seeker count during round initialization.
4. Ensure the host and participating clients use consistent settings.
5. Test role assignment in compatible private lobbies.

Important Limitations

The current HTML and Python prototypes do not modify Among Us or change multiplayer role assignment.

Compatibility with the target game version and any proposed framework remains unverified.

A local menu setting alone cannot change the actual number of seekers.

Development Rules

- Prefer documented source code and reproducible builds.
- Verify game-version and architecture compatibility before implementation.
- Do not distribute modified game files without checking applicable permissions.
- Test gameplay changes only in compatible private environments.

Next Milestone

Identify and verify a source-based Android modding framework compatible with Among Us 19.0.0 before beginning game integration.
