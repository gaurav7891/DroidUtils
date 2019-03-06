# DroidUtils
A simple library which reduces writing boilerplate codes for calling toast message,saving in SharedPreferences,showing normal dialogs

## Getting Started
Add the below dependencies in your project level and app level gradle files.

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the below line in your app level gradle file inside your dependencies.
```
  dependencies {
          ...
	        implementation 'com.github.gaurav7891:DroidUtils:0.1'
	}
```

## How to use?
e.g  
1.Lets say we want to show Toast message on the Android UI, simply call
```
  ToastMessage.toast(this, message)
```
2.Data persist in SharedPreference
```
 PreferenceConnector.writeString(context, "MESSAGE_KEY", message)
 ```
 To read the data from SharedPreference
 ```
  PreferenceConnector.readString(context, "MESSAGE_KEY", message)
  ```
 3.To show normal AlertDialog use 
 ```
 DialogUtils.showAlertDialog(context,message,"Dialog Title",isCancelable)
 ```
 
 ## Note:
 This repository is written in Kotlin language, so it can be used with Java also.
 There is lot of things to come in this library which will help to write less code.
