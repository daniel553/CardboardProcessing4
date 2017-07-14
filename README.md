# CardboardProcessing4
Processing v4 + VR + Cardboard for Android Studio

## Instructions
1. Clone (or fork and then clone) the repository
2. Open the project as an existing project of Android Studio (From the project dialog choose the second option: Open an existing Android Studio Project)
3. Let gradle does its magic and download the dependencies and sdks if needed.

#### SDK and Dependencies.
* com.google.vr:sdk-audio:1.40.0
* com.google.vr:sdk-base:1.40.0
* com.google.vr:sdk-common:1.40.0
* appcompat-v7:25.3.1
* compileSdkVersion 25
* buildToolsVersion 25.0.1
* gradle 2.3.3

## Processing 4.
The app is using the Version 4.0-beta9 of the Android mode: https://github.com/processing/processing-android/releases/tag/android-262
- Android mode deleted.
- Wearable mode not incuded.
- Some functions were deleted or overwritten to fit with AS environment.
- All code is under it's processing package name (except glsl files)

### glsl Files
All files *.glsl were moved to RAW folder https://developer.android.com/guide/topics/resources/providing-resources.html
these files are fetched by <b>Resources.openRawResource()</b> instead of ClassLoader.

See more in https://github.com/processing/processing-android




