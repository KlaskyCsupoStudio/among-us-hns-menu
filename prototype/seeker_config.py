import json

CONFIG_FILE = "seeker_config.json"

def save_settings(seeker_count):
    if seeker_count not in (1, 2, 3):
        raise ValueError("Choose 1, 2, or 3 seekers")

    settings = {
        "mode": "HideNSeek",
        "seeker_count": seeker_count
    }

    with open(CONFIG_FILE, "w") as file:
        json.dump(settings, file, indent=2)

def load_settings():
    try:
        with open(CONFIG_FILE) as file:
            settings = json.load(file)
            count = settings.get("seeker_count", 1)
            return count if count in (1, 2, 3) else 1
    except (OSError, ValueError):
        return 1

print("Hide n Seek - Settings Prototype")
print("Current seekers:", load_settings())

try:
    choice = int(input("Choose seeker count (1-3): "))
    save_settings(choice)
    print("Saved seeker count:", load_settings())
except ValueError:
    print("Invalid choice. Select 1, 2, or 3.")
