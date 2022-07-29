<h1>
	<p align="center">
	    :bricks: Tebel
	</p>
</h1>

[![](https://jitpack.io/v/Pakis-Interactive-Studio/Tebel.svg)](https://jitpack.io/#Pakis-Interactive-Studio/Tebel)
<a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>

A simple textview with custom background to provide additional information.

<img src="https://user-images.githubusercontent.com/19986771/180936364-c4050723-0123-4969-ac93-96593be4c546.png" width="400" />

## Install
### Gradle
Add JitPack repository below to your module's build.gradle file:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Add the dependency, you can see the latest releases <a href="https://github.com/Pakis-Interactive-Studio/Tebel/releases">here</a>

``` Kotlin
dependencies {
    implementation 'com.github.Pakis-Interactive-Studio:Tebel:[latest_release]'
}
```

## Usage
Simply include in your layout:
``` Kotlin
<com.pakisinteractive.tebel.TebelAV
        android:id="@+id/tvNeutral"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Neutral"
        app:variant="neutral" />
```

### Properties

| Properties  | Description |
| ------------- | ------------- |
| android:text  | Text of Tebel  |
| android:textColor  | Color of Tebel text  |
| textAppearance  | Text appearance style of Tebel text  |
| variant  | Predefined variant of Tebel [neutral,warning,error,success]  |
| radius  | Corner radius of Tebel [small,large,round]  |

## Contributing 
Please fork this repository and contribute back using pull requests.
Any contributions, large or small, major features, bug fixes, are welcomed and appreciated 

## Find this library useful? 
Star :star: this project or follow our github <a href="https://github.com/Pakis-Interactive-Studio" target="blank">![GitHub followers](https://img.shields.io/github/followers/Pakis-Interactive-Studio?style=social)</a> it motivates us to share more open source project

## Donation 
If this project help you reduce time to develop, you can give us a cup of coffee ☕

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/K3K0E2QMQ) <a href="https://trakteer.id/pakis-interactive-bn1xg" target="_blank"><img id="wse-buttons-preview" src="https://cdn.trakteer.id/images/embed/trbtn-red-5.png" height="30" style="border: 0px; height: 30px;" alt="Trakteer Saya"></a>

## License
```
Copyright 2022 Pakis Interactive

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
