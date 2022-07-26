# Tebel
A simple textview with custom background to provide additional information.

## Install
### Gradle
Add the dependency below to your module's build.gradle file:
``` Kotlin
dependencies {
    implementation "com.github.pakisinteractive:tebel:1.0.0"
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
