## Package uninstaller for android
Root privileges are not required for the uninstaller to work
### Requirements:
```
- JDK 8 or higher
- adb (Android Debug Bridge, part of platform tools)
```

### Platform tools download links:
From:
https://developer.android.com/studio/releases/platform-tools

 - Windows: https://dl.google.com/android/repository/platform-tools-latest-windows.zip
 - Linux: https://dl.google.com/android/repository/platform-tools-latest-linux.zip
 - Mac: https://dl.google.com/android/repository/platform-tools-latest-darwin.zip

**Important:**
> 
> Before running make sure that your device has USB debugging enabled (found in developer options),
> the device will prompt for authorization, check `Always allow from this computer` and select `OK`
> 
> If you've done this correctly your device should appear in the list of connected devices (run  `adb devices`)
> 
> If your system does not have proper drivers to communicate with or recognize an Android device
> you can download them from this website: https://developer.android.com/studio/run/win-usb

## How to run from terminal
```bash
# Clone this repository
$ git clone https://github.com/FriskIsGit/debloater-for-android

# Navigate to java's source folder
$ cd debloater-for-android/src/main/java/com/code

# Compile
$ javac ADBMain.java Utilities.java ADBExecutor.java InstalledPackages.java

# Step up two directories to debloater-for-android/src/main/java/
$ cd ../../

# Run the program (you will be prompted to provide path to platform tools)
$ java com.code.ADBMain

# ALTERNATIVELY

# Pass the path as argument to the program (quotation marks are not required)
$ java com.code.ADBMain E:/Android Tools/platform-tools/
```

## Modes
#### `1` Uninstall single package
#### `2` Uninstall apps listed in packages.txt or those starting with a prefix
<h1>Better Copy than Orginal</h1>





